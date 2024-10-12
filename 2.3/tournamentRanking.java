import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter wins or losses!");
        char end = 'T';
        while (end != 'F') {
            int total = 0;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Game 1 (W/L): ");
            char game1 = Character.toUpperCase(scanner.next().trim().charAt(0));
            System.out.println("Game 2 (W/L): ");
            char game2 = Character.toUpperCase(scanner.next().trim().charAt(0));
            System.out.println("Game 3 (W/L): ");
            char game3 = Character.toUpperCase(scanner.next().trim().charAt(0));
            System.out.println("Game 4 (W/L): ");
            char game4 = Character.toUpperCase(scanner.next().trim().charAt(0));
            System.out.println("Game 5 (W/L): ");
            char game5 = Character.toUpperCase(scanner.next().trim().charAt(0));
            System.out.println("Game 6 (W/L): ");
            char game6 = Character.toUpperCase(scanner.next().trim().charAt(0));
            if (game1 == 'W') {
                total = total + 1;
            }
            if (game2 == 'W') {
                total = total + 1;
            }
            if (game3 == 'W') {
                total = total + 1;
            }
            if (game4 == 'W') {
                total = total + 1;
            }
            if (game5 == 'W') {
                total = total + 1;
            }
            if (game6 == 'W') {
                total = total + 1;
            }
            if (total == 5 || total == 6) {
                System.out.println("Team is placed in group 1");
            } else if (total == 3 || total == 4) {
                System.out.println("Team is placed in group 2");
            } else if (total == 1 || total == 2) {
                System.out.println("Team is placed in group 3");
            } else {
                System.out.println("Team is eliminated");
            }
            System.out.println("Continue? T or F");
            end = Character.toUpperCase(scanner.next().trim().charAt(0));
        }
    }
}
