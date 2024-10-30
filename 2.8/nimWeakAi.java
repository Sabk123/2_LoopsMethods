import java.util.Scanner;
public class nimWEAKAI {
    public static void main(String[] args) {
        new nimWEAKAI();
    }

    public nimWEAKAI() {
        char again = rules();

        while (again == 'y') {
            int left = 15;
            int player = 2;
            String name1 = getName(1);
            String name2 = "AI";

            while (left > 0) {
                whoseturn(player, name1, name2);
                drawLeft(left);

                if (player == 1) {
                    left = turn(left);
                    player = 2;
                } else {
                    left = turnAI(left);
                    player = 1;
                }
            }
            whosewon(player, name1, name2);
            System.out.println("Play again? (y/n)");
            Scanner scanner = new Scanner(System.in);
            again = scanner.next().charAt(0);
        }

        System.out.println("\nThanks for playing the Game of Nim!");
    }

    public char rules() {
        System.out.println("Game of Nim");
        System.out.println("There are 15 stones in the pile. Players take turns taking stones.");
        System.out.println("On each turn, they can take one or two stones. The player who takes the last stone loses.");
        return 'y';
    }

    public String getName(int num) {
        System.out.println("Player #1: Enter your name: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }

    public void drawLeft(int left) {
        System.out.println("\nStones Remaining: " + left);
        for (int i = 0; i < left; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public void whoseturn(int player, String name1, String name2) {
        if (player == 1) {
            System.out.println(name1 + "'s turn.");
        } else {
            System.out.println(name2 + "'s turn.");
        }
    }

    public boolean isValid(int num, int left) {
        return num <= left && (num == 1 || num == 2);
    }

    public int turnAI(int left) {
        int amt = (int) (Math.random() * 2) + 1;
        while (!isValid(amt, left)) {
            amt = (int) (Math.random() * 2) + 1;
        }
        System.out.println("The AI has taken " + amt + " stones.");
        return left - amt;
    }

    public int turn(int left) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many stones do you want to remove?");
        int amt = scanner.nextInt();
        while (!isValid(amt, left)) {
            System.out.println("That amount is invalid. Try a smaller number.");
            System.out.println("How many stones do you want to remove? ");
            amt = scanner.nextInt();
        }
        return left - amt;
    }

    public void whosewon(int player, String name1, String name2) {
        if (player == 1) {
            System.out.println(name2 + " has lost. " + name1 + " forced them to take the last stone.");
        } else {
            System.out.println(name1 + " has lost. " + name2 + " forced them to take the last stone.");
        }
    }
}
