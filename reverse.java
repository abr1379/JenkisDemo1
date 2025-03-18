import java.util.Scanner;

public class reverse{
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number to reverse: ");
        int number = scanner.nextInt();

        // Variable to store the reversed number
        int reversedNumber = 0;

        // Loop to reverse the number
        while (number != 0) {
            int digit = number % 10;  // Get the last digit
            reversedNumber = reversedNumber * 10 + digit;  // Append the digit to the reversed number
            number = number / 10;  // Remove the last digit from the original number
        }

        // Output the reversed number
        System.out.println("Reversed number: " + reversedNumber);

        // Close the scanner
        scanner.close();
    }
}

