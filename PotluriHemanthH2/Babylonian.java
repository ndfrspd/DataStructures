import java.util.*;

public class Babylonian {

    public static void main(String[] args) {
       
        // Variables for program
        int n;
        double k;
        double r = 0;
        
        // Recieves the user inputed number
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Welcome to the Babylonian Square root method, please enter a positive integer:");
        n = keyboard.nextInt();

        // Recieves the user inputed precsion for the calculation
        System.out.println("Enter the precision you want (Ex. 0.001)");
        k = keyboard.nextDouble();
        
    }
}