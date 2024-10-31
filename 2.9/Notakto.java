import java.util.Random;
import java.util.Scanner;

public class TicTacToeWeakAI { // I can't be asked renaming this

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


    public TicTacToeWeakAI() {
        boolean isPlayerTurn = true;
        while (!isDone()) {
            printBoard();
            if (isPlayerTurn) {
                isPlayerTurn = false;
                makeMove(turn);
            } else {
                isPlayerTurn = true;
                makeMoveAI(turn);
            }
        }
        printBoard();
        if (isPlayerTurn){
            System.out.println("The winner is the Human");
        }
        else {
            System.out.println("The winner is the AI");
        }
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
            a = 'x';
        else if (x == 2 && y == 1)
            b = 'x';
        else if (x == 3 && y == 1)
            c = 'x';
        else if (x == 3 && y == 2)
            f = 'x';
        else if (x == 3 && y == 3)
            i = 'x';
        else if (x == 2 && y == 2)
            e = 'x';
        else if (x == 2 && y == 3)
            h = 'x';
        else if (x == 1 && y == 2)
            d = 'x';
        else
            g = 'x';

    }

    public boolean isValid(int x, int y) {
        if (x < 1 || x > 3 || y < 1 || y > 3) {
            return false;
        }
        if (x == 1 && y == 1 && a == ' ') return true;
        if (x == 2 && y == 1 && b == ' ') return true;
        if (x == 3 && y == 1 && c == ' ') return true;
        if (x == 1 && y == 2 && d == ' ') return true;
        if (x == 2 && y == 2 && e == ' ') return true;
        if (x == 3 && y == 2 && f == ' ') return true;
        if (x == 1 && y == 3 && g == ' ') return true;
        if (x == 2 && y == 3 && h == ' ') return true;
        if (x == 3 && y == 3 && i == ' ') return true;

        return false;
    }

    public boolean isDone() {
        if ((a == b && b == c && a != ' ') || (d == e && e == f && d != ' ') || (g == h && h == i && g != ' ') || (a == d && d == g && a != ' ') || (b == e && e == h && b != ' ') || (c == f && f == i && c != ' ') || (a == e && e == i && a != ' ') || (c == e && e == g && c != ' ')) {
            return true;
        }
        else return a != ' ' && b != ' ' && c != ' ' && d != ' ' && e != ' ' && f != ' ' && g != ' ' && h != ' ' && i != ' ';
    }


    public void makeMoveAI(char piece) {
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
