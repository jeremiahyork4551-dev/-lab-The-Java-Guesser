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

    // Stub: replaced in Step 4
    public void humanGuesser() {
        System.out.println("human guesser");
    }

    // Stub: replaced in Step 5
    public void computerGuesser() {
        System.out.println("computer guesser");
    }
}
