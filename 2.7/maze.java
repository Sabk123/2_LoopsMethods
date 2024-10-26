import java.util.Scanner;

public class Maze {
    public static void main(String args[]) {
        new Maze();
    }

    public Maze() {
        System.out.println("XXXXXXXXXX");
        System.out.println("Xa b cX");
        System.out.println("XXX XXXX X");
        System.out.println("XXX XXd eX");
        System.out.println("Xf gXXXX X");
        System.out.println("XXXh iX");
        System.out.println("Xj KXXXXnX");
        System.out.println("XXXXXXXXXX");
        placeA(); // I have no idea if I should make a backwards since it didn't say it in the instructions, or a J and K.
    }

    public void placeA() {
        System.out.println("You can (a) Stay here, or (b) move forward");
        Scanner scanner = new Scanner(System.in);
        char choice = scanner.next().charAt(0);
        if (Character.toLowerCase(choice) == 'a')
            placeA();
        else if (Character.toLowerCase(choice) == 'b')
            placeB();

    }

    public void placeB() {
        System.out.println("You can (b) Stay here, or (c) Move forward");
        Scanner scanner = new Scanner(System.in);
        char choice = scanner.next().charAt(0);
        if (Character.toLowerCase(choice) == 'b')
            placeB();
        else if (Character.toLowerCase(choice) == 'c')
            placeC();
    }

    public void placeC() {
        System.out.println("You can (c) Stay here, or (d) Move forward");
        Scanner scanner = new Scanner(System.in);
        char choice = scanner.next().charAt(0);
        if (Character.toLowerCase(choice) == 'c')
            placeC();
        else if (Character.toLowerCase(choice) == 'd')
            placeD();
    }

    public void placeD() {
        System.out.println("You can (d) Stay here, or (e) Move forward");
        Scanner scanner = new Scanner(System.in);
        char choice = scanner.next().charAt(0);
        if (Character.toLowerCase(choice) == 'd')
            placeD();
        else if (Character.toLowerCase(choice) == 'e')
            placeE();
    }

    public void placeE() {
        System.out.println("You can (e) Stay here, or (f) Move forward");
        Scanner scanner = new Scanner(System.in);
        char choice = scanner.next().charAt(0);
        if (Character.toLowerCase(choice) == 'e')
            placeE();
        else if (Character.toLowerCase(choice) == 'f')
            placeF();
    }

    public void placeF() {
        System.out.println("You can (f) Stay here, or (g) Move forward");
        Scanner scanner = new Scanner(System.in);
        char choice = scanner.next().charAt(0);
        if (Character.toLowerCase(choice) == 'f')
            placeF();
        else if (Character.toLowerCase(choice) == 'g')
            placeG();
    }

    public void placeG() {
        System.out.println("You can (g) Stay here, or (h) Move forward");
        Scanner scanner = new Scanner(System.in);
        char choice = scanner.next().charAt(0);
        if (Character.toLowerCase(choice) == 'g')
            placeG();
        else if (Character.toLowerCase(choice) == 'h')
            placeH();
    }

    public void placeH() {
        System.out.println("You can (h) Stay here, or (i) Move forward");
        Scanner scanner = new Scanner(System.in);
        char choice = scanner.next().charAt(0);
        if (Character.toLowerCase(choice) == 'H')
            placeH();
        else if (Character.toLowerCase(choice) == 'I')
            placeI();
    }

    public void placeI() {
        System.out.println("You can (i) Stay here, or (n) Move forward");
        Scanner scanner = new Scanner(System.in);
        char choice = scanner.next().charAt(0);
        if (Character.toLowerCase(choice) == 'i')
            placeI();
        else if (Character.toLowerCase(choice) == 'n')
            placeN();
    }

    public void placeN() {
        System.out.println("You've Escaped!");
    }
}
