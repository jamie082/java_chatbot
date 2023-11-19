import java.util.Scanner;
import java.io.File;
import java.io.IOException;

class loop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What should the government do to help the poor?");
        String input = scan.nextLine(); // waits for input
        if(input.equalsIgnoreCase("Nothing"))
        {
            System.out.println("Correct");
        }
        else 
        {
            System.out.println("Incorrect");
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
            System.out.println("You think there should be higher taxes for the rich");
        }

        else
        {
            System.out.println("You think there should be same taxes for the rich?");
        }
    }
}