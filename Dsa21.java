import java.util.Scanner;

public class Dsa21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Declare the 5x5 2D array to store the input
        int[][] array = new int[5][5];
        int input;

        // Input 2D Array using Scanner Class and check data validity
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                while (true) { // Keep asking until valid input (0 or 1) is given
                    System.out.print("Enter 0 or 1 for position [" + i + "][" + j + "]: ");
                    if (sc.hasNextInt()) {
                        input = sc.nextInt();
                        if (input == 0 || input == 1) { // Ensure input is either 0 or 1
                            array[i][j] = input;
                            break; // Exit the loop once valid input is given
                        } else {
                            System.out.println("Invalid input! Please enter 0 or 1."); // Inform about invalid input
                        }
                    } else {
                        System.out.println("Invalid input! Please enter an integer."); // Inform about non-integer input
                        sc.next(); // Clear the invalid input
                    }
                }
            }
        }

        // Perform the Flip-Flop Operation
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                array[i][j] = (array[i][j] == 0) ? 1 : 0;
            }
        }

        // Output the 2D Flip-Flop Array
        System.out.println("Output Flip-Flop Array:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println(); // Move to the next line after each row
        }

        sc.close(); // Close the scanner resource
    }
}
