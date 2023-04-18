
import java.util.Random;
import java.util.Scanner;

public class mainMethodTests {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Welcome to Bop It Game!\n");

        // Initialize the scanner and random number generator
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Initialize the score and timer
        int score = 0;
        int time = 30;

        // Loop until the timer runs out
        while (time > 0) {
            // Generate a random instruction
            int instruction = random.nextInt(3) + 1;

            // Display the instruction and wait for user input
            System.out.println("Bop it! Twist it! Pull it! #" + instruction);
            String input = scanner.nextLine();

            // Check if the user input matches the instruction
            if (input.equals("bop") && instruction == 1 || input.equals("twist") && instruction == 2 || input.equals("pull") && instruction == 3) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Wrong!");
                break;
            }

            // Update the timer and display the score
            time--;
            System.out.println("Time left: " + time + " seconds");
            System.out.println("Score: " + score + "\n");

            // Wait for one second before displaying the next instruction
            Thread.sleep(1000);
        }

        // Display the final score
        System.out.println("Game over!");
        System.out.println("Final score: " + score);
    }
}
