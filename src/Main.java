import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Initialize variables
        Scanner in = new Scanner(System.in);
        double gasInTank = 0;
        double mpg = 0;
        double gasPrice = 0;
        double hundredMileCost = 0;
        double howFar = 0;
        String trash = "";
        //Request input
        System.out.println("How many gallons of gas are left in the tank?");
            //If statement to either set value or return error
            if (in.hasNextDouble()) {
                gasInTank = in.nextDouble(); // set variable from input
                in.nextLine(); // Clear buffer
            } else {
                trash = in.nextLine(); //Set trash to the invalid string the user entered
                System.out.println("You entered an invalid value: " + trash + ". Restart program and use numerical values only.");
                System.exit(0); //Exit program to allow restart
            }
        System.out.println("What MPG is your vehicle rated for?");
        //If statement to either set value or return error
            if (in.hasNextDouble()) {
                mpg = in.nextDouble(); // set variable from input
                in.nextLine(); // Clear buffer
            } else {
                trash = in.nextLine(); //Set trash to the invalid string the user entered
                System.out.println("You entered an invalid value: " + trash + ". Restart program and use numerical values only.");
                System.exit(0); //Exit program to allow restart
            }
        System.out.println("What is the current price of gas?");
        //If statement to either set value or return error
            if (in.hasNextDouble()) {
                gasPrice = in.nextDouble(); // set variable from input
                in.nextLine(); // Clear buffer
            } else {
                trash = in.nextLine(); //Set trash to the invalid string the user entered
                System.out.println("You entered an invalid value: " + trash + ". Restart program and use numerical values only.");
                System.exit(0); //Exit program to allow restart
            }
        //calulate cost per 100 miles
        hundredMileCost = (gasPrice / mpg) * 100;
        //Print result
        System.out.println("Your gas cost per 100 miles is " + hundredMileCost);
        //Calculate how far you can go on the remaining gas
        howFar = gasInTank * mpg;
        //Print result
        System.out.println("With " + gasInTank + " gallons left in your tank, you can travel " + howFar + " miles.");
    }
}