import java.util.Random;
import java.util.Scanner;

public class TicTacToeWeakAI {

    char a = ' ';
    char b = ' ';
    char c = ' ';
    char d = ' ';
    char e = ' ';
    char f = ' ';
    char g = ' ';
    char h = ' ';
    char i = ' ';
    char turn = 'x';
    Scanner scanner = new Scanner(System.in);

    public static void main (String[] args) {
        new TicTacToeWeakAI();
    }

    /* Again, your job is to complete the code in the methods as specified */

    public TicTacToeWeakAI() {
        while (!isDone()) {
            printBoard();
            if (turn == 'x') {
                makeMoveAI(turn);
                turn = 'o';
            } else {
                makeMove(turn);
                turn = 'x';
            }
        }
        printBoard();
        System.out.println("The winner is " + printWinner());
        scanner.close(); // Close scanner after use
    }

    public void printBoard() {
        System.out.println("  1 2 3");
        System.out.println("1 " + a + " " + b + " " + c);
        System.out.println("2 " + d + " " + e + " " + f);
        System.out.println("3 " + g + " " + h + " " + i);
    }

    public void makeMove(char piece) {
        System.out.println("Your turn!");
        int x, y;

        System.out.print("Enter the x-coordinate: ");
        x = scanner.nextInt();

        System.out.print("Enter the y-coordinate: ");
        y = scanner.nextInt();

        while (!isValid(x, y)) {
            System.out.println("Error - invalid coordinate. Try again.");
            System.out.print("Enter the x-coordinate: ");
            x = scanner.nextInt();
            System.out.print("Enter the y-coordinate: ");
            y = scanner.nextInt();
        }

        if (x == 1 && y == 1)
            a = piece;
        else if (x == 2 && y == 1)
            b = piece;
        else if (x == 3 && y == 1)
            c = piece;
        else if (x == 3 && y == 2)
            f = piece;
        else if (x == 3 && y == 3)
            i = piece;
        else if (x == 2 && y == 2)
            e = piece;
        else if (x == 2 && y == 3)
            h = piece;
        else if (x == 1 && y == 2)
            d = piece;
        else
            g = piece;

    }

    public boolean isValid(int x, int y) {
        if (x < 1 || x > 3 || y < 1 || y > 3) {
            return false;
        }
        return true;
    }

    public boolean isDone() {
        if ((a == b && b == c && a != ' ') || (d == e && e == f && d != ' ') || (g == h && h == i && g != ' ') || (a == d && d == g && a != ' ') || (b == e && e == h && b != ' ') || (c == f && f == i && c != ' ') || (a == e && e == i && a != ' ') || (c == e && e == g && c != ' ')) {
            return true;
        }
        else if (a != ' ' && b != ' ' && c != ' ' && d != ' ' && e != ' ' && f != ' ' && g != ' ' && h != ' ' && i != ' ')
            return true;
        else
            return false;
    }

    public char printWinner() {
        // returns who is in the winning condition 
        // returns 't' if it is a tie or cat's game 
        // top horizontal a-b-c is the win 
        if (a == b && a == c && a != ' ')
            return a;
        if (d == e && e == f && d != ' ')
            return d;
        if (g == h && h == i && g != ' ')
            return g;
        if (a == d && d == g && a != ' ')
            return a;
        if (b == e && e == h && b != ' ')
            return b;
        if (c == f && f == i && c != ' ')
            return c;
        if (a == e && e == i && a != ' ')
            return a;
        if (c == e && e == g && c != ' ')
            return c;
        else
            return 't';
    }

    public void makeMoveAI(char piece) {
        // Finished. This method picks a random place for the AI.
        int x = (int)(Math.random() * 3) + 1;
        int y = (int)(Math.random() * 3) + 1;

        while (!isValid(x, y)) {
            x = (int)(Math.random() * 3) + 1;
            y = (int)(Math.random() * 3) + 1;
        }

        System.out.println("The AI's turn! It picked position (" + x + ", " + y + ")\n");

        if (x == 1 && y == 1)
            a = piece;
        else if (x == 2 && y == 1)
            b = piece;
        else if (x == 3 && y == 1)
            c = piece;
        else if (x == 1 && y == 2)
            d = piece;
        else if (x == 2 && y == 2)
            e = piece;
        else if (x == 3 && y == 2)
            f = piece;
        else if (x == 1 && y == 3)
            g = piece;
        else if (x == 2 && y == 3)
            h = piece;
        else if (x == 3 && y == 3)
            i = piece;
    }
}
