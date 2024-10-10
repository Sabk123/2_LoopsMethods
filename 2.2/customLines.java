import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What character would you like for line #1");
        String character1 = scanner.next();
        System.out.println("How many do you want?");
        int amount1 = scanner.nextInt();
        for (int i = 1; i <= amount1; i++)
            System.out.print(character1);
        System.out.println(" ");

        System.out.println("What character would you like for line #2");
        String character2 = scanner.next();
        System.out.println("How many do you want?");
        int amount2 = scanner.nextInt();
        for (int i = 1; i <= amount2; i++)
            System.out.print(character2);
        System.out.println(" ");

        System.out.println("What character would you like for line #3");
        String character3 = scanner.next();
        System.out.println("How many do you want?");
        int amount3 = scanner.nextInt();
        for (int i = 1; i <= amount3; i++)
            System.out.print(character3);
        System.out.println(" ");

        System.out.println("What character would you like for line #4");
        String character4 = scanner.next();
        System.out.println("How many do you want?");
        int amount4 = scanner.nextInt();
        for (int i = 1; i <= amount4; i++)
            System.out.print(character4);
        System.out.println(" ");
        System.out.println("What character would you like for line #5");
        String character5 = scanner.next();
        System.out.println("How many do you want?");
        int amount5 = scanner.nextInt();
        for (int i = 1; i <= amount5; i++)
            System.out.print(character5);
        System.out.println(" ");

    }
}
