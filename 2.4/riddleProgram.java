import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is broken before you use it?");
        String ans = scanner.next();
        String answer = ans.toLowerCase();
        int tries = 0;

        while (tries < 3) {
            if (answer.equals("eggs") || answer.equals("egg")) {
                System.out.println("Good job!");
                break;
            } else {
                tries++;
                if (tries < 3) {
                    System.out.println("Incorrect. Try again");
                    ans = scanner.next();
                    answer = ans.toLowerCase();
                }
            }
        }

        if (tries == 3 && !answer.equals("eggs") && !answer.equals("egg")) {
            System.out.println("Three tries are up, it was an egg.");
        }
    }
}
