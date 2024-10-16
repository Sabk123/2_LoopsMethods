import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int guess = -1;
        int secret = (int) (Math.random() * 100) + 1;
        int tries = 0;
        System.out.println("Guess?");
        while (secret != guess) {
            guess = scanner.nextInt();
            if (guess == secret) {
                System.out.println("You got it!");
            } else if (guess < secret) {
                System.out.println("Higher!");
            } else if (guess > secret) {
                System.out.println("Lower!");
            }
            tries++;
        }
        System.out.println("It took you " + tries + " tries.");
    }
}
