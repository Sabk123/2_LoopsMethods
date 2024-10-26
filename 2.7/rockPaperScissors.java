import java.util.Random;
import java.util.Scanner;

public class rockPaperScissors {
    public static void main(String args[]) {
        new rockPaperScissors();
    }

    public rockPaperScissors() {
        int cPoint = 0;
        int uPoint = 0;
        int game = 1; // this is never used
        char playAgain = 'y';
        Scanner scanner = new Scanner(System.in);
        System.out.println("------ Rock, Paper, Scissors ------\n");
        while (playAgain == 'y') {
            char user = userChoice(scanner);
            System.out.println("You have selected: " + user);

            char comp = compChoice();
            System.out.println("The computer has selected: " + comp);

            char win = winner(comp, user);
            if (win == 'c') {
                cPoint++;
                System.out.println("\nThe computer wins!");
            } else if (win == 'u') {
                uPoint++;
                System.out.println("\nYou win!");
            } else {
                System.out.println("\nThere is a tie!");
            }

            System.out.println("Points: You: " + uPoint + " Computer: " + cPoint);
            System.out.print("Play again? (y/n): ");
            playAgain = scanner.next().charAt(0);
        }

        System.out.println("Goodbye!");
        scanner.close();
    }

    public boolean isValid(String c) {
        if(c.equalsIgnoreCase("Rock") || c.equalsIgnoreCase("R") || c.equalsIgnoreCase("Paper") || c.equalsIgnoreCase("P") || c.equalsIgnoreCase("Scissors") || c.equalsIgnoreCase("S")){
            return true;
        }
        else
            return false;
    }

    public char userChoice(Scanner scanner) {
        System.out.print("Choice? (r/p/s): ");
        String pick = scanner.next();

        while (!isValid(pick)) {
            System.out.print("Invalid choice. Choice? (r/p/s): ");
            pick = scanner.next();
        }

        if (pick.equalsIgnoreCase("Rock") || pick.equalsIgnoreCase("R"))
            return 'r';
        else if (pick.equalsIgnoreCase("Paper") || pick.equalsIgnoreCase("P"))
            return 'p';
        else
            return 's';
    }

    public char compChoice() {
        Random rand = new Random();
        int choice = rand.nextInt(3) + 1;

        if (choice == 1)
            return 'r';
        else if (choice == 2)
            return 'p';
        else
            return 's';
    }

    public char winner(char comp, char user) {
        if (comp == user)
            return 't';
        else if ((comp == 's' && user == 'p') || (comp == 'p' && user == 'r') || ((comp == 'r' && user == 's'))){
            return 'c';
        }
        else {
            return 'u';
        }
    }
}
