import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter diamond size");
        int columns = scanner.nextInt();
        if ((columns % 2) != 0 && columns > 0) { // I genuinely cannot think of any other way to check if its even unless using an if statement.
            int midRow = columns / 2;
            for (int i = 0; i <= midRow; i++) { // This is the first half of the code.
                for (int j = 0; j < midRow - i; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < 2 * i + 1; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }

            for (int i = midRow - 1; i >= 0; i--) { // This is the second half of the code (after midRow is reached)
                for (int j = 0; j < midRow - i; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < 2 * i + 1; j++) {
                    System.out.print("*");
                }
                System.out.println();
            } //1 hour in I realized I was doing this wrong.
        } else {
            System.out.println("Enter an odd positive integer.");
        }
    }
}





