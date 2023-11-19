import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;

class loop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What should the government do to help the poor?");
        String input = scan.nextLine(); // waits for input
        if(input.equalsIgnoreCase("Nothing"))
        {
            try {
                FileWriter output = new FileWriter("file_1.txt"); // write to file
                output.write(input);
                System.out.println("Data is written to the file");
                output.close();
            }
            catch (Exception e) {
                e.getStackTrace();
            }
        }
        else 
        {
            try {
                FileWriter output = new FileWriter("file_3.txt"); // if something besides "Nothing" is insereted, please append to "file_3.txt"
                output.write(input);
                System.out.println("Incorrect");
                output.close();
            }
            catch (Exception e) {
                e.getStackTrace();
            }
        }

        Scanner myObj = new Scanner(System.in); // create a scanner object
        System.out.println("Do you think there should be lower taxes for Democrats?");

        String output = myObj.nextLine(); // waits for input
        if(output.equalsIgnoreCase("Yes"))
        {
            System.out.println("You think there should be lower taxes for the poor");
            boolean isTrue;
        }

        else
        {
            System.out.println("You don't think there should be lower taxes for the poor");
            boolean isFalse;
        }

        Scanner MyObj2 = new Scanner(System.in); // create new scanner object
        System.out.println("Do you think there should be higher taxes for republicans that make over $450,000 yearly?");

        String output_2 = MyObj2.nextLine(); // waits for input for republican line
        if(output_2.equalsIgnoreCase("Yes"))
        {
            try {
                FileWriter fw1 = new FileWriter("file_2.txt"); // write to file_2.txt
                fw1.write(output_2);
                fw1.close();
                System.out.println("You think there should be higher taxes for the rich");

            }
            catch (Exception e) {
                e.getStackTrace();
            }
        }

        else {
            System.out.println("Last question: What political party do you affiliate with?");
            // Democrat, Republican, Left-Wing, Right-Wing.
        }
    }
}