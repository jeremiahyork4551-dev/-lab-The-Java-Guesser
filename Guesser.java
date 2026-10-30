import java.util.Scanner;

public class Guesser {

    // One Scanner for the whole program (reads from the keyboard)
    Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        // main is static, so it just builds a Guesser and lets the constructor run
        new Guesser();
    }

    // Constructor = the main loop
    public Guesser() {
        boolean keepGoing = true;
        while (keepGoing) {
            int choice = menu();
            if (choice == 0) {
                keepGoing = false;
            } else if (choice == 1) {
                humanGuesser();
            } else if (choice == 2) {
                computerGuesser();
            } else {
                System.out.println("Invalid choice. Please enter 0-2.");
            }
        }
    }

    // Prints the menu and returns the user's choice as an int
    public int menu() {
        System.out.println();
        System.out.println("0) Exit");
        System.out.println("1) Human Guesser");
        System.out.println("2) Computer guesser");
        System.out.println();
        System.out.print("Please enter 0-2: ");

        String response = input.nextLine();
        int choice = -1;
        try {
            choice = Integer.parseInt(response.trim());
        } catch (NumberFormatException e) {
            choice = -1; // not a number -> falls through to "Invalid choice"
        }
        return choice;
    }

    // Computer picks 1-100, human guesses until correct
    public void humanGuesser() {
        System.out.println("human guesser");

        // Math.random() gives 0.0 up to (not including) 1.0
        // * 100 -> 0.0 to 99.99..., (int) chops to 0-99, + 1 -> 1-100
        int target = (int)(Math.random() * 100) + 1;
        System.out.println(target); // DEBUG: matches sample output - remove before submitting

        int turns = 1;
        boolean keepGoing = true;
        while (keepGoing) {
            System.out.print(turns + ") Please enter a number: ");
            String response = input.nextLine();

            int guess;
            try {
                guess = Integer.parseInt(response.trim());
            } catch (NumberFormatException e) {
                System.out.println("That's not a number. Try again.");
                continue; // skip the rest of the loop; doesn't count as a turn
            }

            if (guess < target) {
                System.out.println("too low...");
            } else if (guess > target) {
                System.out.println("too high...");
            } else {
                System.out.println("got it!");
                keepGoing = false;
            }
            turns++;
        }

        System.out.println();
        System.out.println("Very good!");
    }

    // Stub: replaced in Step 5
    public void computerGuesser() {
        System.out.println("computer guesser");
    }
}
