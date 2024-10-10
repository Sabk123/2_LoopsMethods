import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int square = 0;
        while (square != -1) { // we didn't learn while loops yet (unless if there is another way)
            System.out.println("What's the dimension of the square? -1 to quit");
            square = scanner.nextInt();
            for (int i = 0; i < square; i++) {
                for (int j = 0; j < square; j++) {
                    System.out.print("*");
                }
                System.out.println(" ");
            }
        }
    }
}
