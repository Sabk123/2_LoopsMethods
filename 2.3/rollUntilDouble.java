import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many rolls until you get a double?");
        //int guess = scanner.nextInt();
        // The lines that are commented are lines that, when enabled, will also make the user input a guess, and see how much they're off
        int dice1 = (int) (Math.random() * 6) + 1;
        int dice2 = (int) (Math.random() * 6) + 1;
        int tries = 0;
        while (dice2 != dice1) {
            dice1 = (int) (Math.random() * 6) + 1;
            dice2 = (int) (Math.random() * 6) + 1;
            tries++;
        }
        //int finalTries = tries - guess;
        if (tries == 0) {
            System.out.println("You rolled a double immediately!"); // it looks weird if its "you rolled a double in 0 tries!" therefore I added this code in
        } else {
            System.out.println("You rolled a double in " + tries + " rolls!");
            //System.out.println("You rolled a double in " + tries + " rolls! You were off by " + finalTries);
        }

    }
}
