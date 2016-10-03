import java.util.*;

public class Babylonian {

    public static void main(String[] args) {
       
        // Variables for program
        int n;
        double k;
        double r = 0;
        
        // Recieves the user inputed number
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Welcome to the Babylonian Square root method, please enter a positive number:");
        n = keyboard.nextInt();
        System.out.println("You entered " + n);
        System.out.println("");

        // Recieves the user inputed precsion for the calculation
        System.out.println("Enter the precision you want (Ex. 0.001)");
        k = keyboard.nextDouble();
        
        // Initial guess
        double guess = n/2;

        // Additional variables needed to add precision to the calculation
        double difference = 1;
        double lastGuess = guess;
        
        // Performs the calcualtion
        while (difference >= k)
        {
            r = n / guess;
            guess = (guess + r) / 2;
            difference = ((lastGuess - guess)/lastGuess);
            lastGuess = guess;
            System.out.println(guess);
        }
        
        // Prints out the final answer
        System.out.println("");
        System.out.printf("The square root of " + n + " is: %.2f", r);
        
    }
}