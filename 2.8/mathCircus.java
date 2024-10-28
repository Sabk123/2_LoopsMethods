import java.util.Scanner;

public class mathCircus
{
    public static void main (String args[])
    {
        new mathCircus ();
    }

    public mathCircus ()
    {
        Scanner scanner = new Scanner(System.in);
        char choice = 'a';
        int points = 0;
        int done = 0;
        System.out.println("Welcome to the Math Circus!");
        while (choice != 'q')
        {
            System.out.println ("\nYou have " + points + " out of " + done + " questions correct.\n");
            System.out.println ("*****Menu Options*****");
            System.out.println ("a) addition");
            System.out.println ("b) subtraction");
            System.out.println ("c) multiplication");
            System.out.println ("d) division");
            System.out.println ("q) quit");
            System.out.println("Choice > ");
            choice = scanner.next().charAt(0);
            System.out.println ("");
            done++;
            if (choice == 'a')
                points += addition ();
            else if (choice == 'b')
                points += subtraction ();
            else if (choice == 'c')
                points += multiplication ();
            else if (choice == 'd')
                points += division ();
            else if (choice != 'q')
            {
                done--;
                System.out.println ("Please enter an option in the menu");
            }
        } //while loop
        System.out.println ("Good bye!");
    } //constructor
    public int addition ()
    {
        Scanner scanner = new Scanner(System.in);
        int a = (int) (Math.random () * 6) + 1;
        int b = (int) (Math.random () * 6) + 1;
        int guess = 0;
        int ans = a + b;
        System.out.println(a + " + " + b + " = ");
        guess = scanner.nextInt();
        if (guess == ans)
        {
            System.out.println ("You got it right!");
            return 1;
        }
        else
        {
            System.out.println ("That was incorrect. It was "+ans+".");
            return 0;
        }
    }
    public int subtraction ()
    {
        Scanner scanner = new Scanner(System.in);
        int a = (int) (Math.random () * 6) + 1;
        int b = (int) (Math.random () * 6) + 1;
        int guess = 0;
        int ans = a - b;
        System.out.println(a + " - " + b + " = ");
        guess = scanner.nextInt();
        if (guess == ans)
        {
            System.out.println ("You got it right!");
            return 1;
        }
        else
            System.out.println ("That was incorrect. It was "+ans+".");
        return 0;
    }
    public int multiplication ()
    {
        Scanner scanner = new Scanner(System.in);
        int a = (int) (Math.random () * 6) + 1;
        int b = (int) (Math.random () * 6) + 1;
        int guess = 0;
        int ans = a * b;
        System.out.println(a + " * " + b + " = ");
        guess = scanner.nextInt();
        if (guess == ans)
        {
            System.out.println ("You got it right!");
            return 1;
        }
        else
            return 0;
    }
    public int division ()
    {
        Scanner scanner = new Scanner(System.in);
        int a = ((int) (Math.random() * 6) + 1) * 2; // Ensures an even integer
        int b = (int) (Math.random() * 6) + 1;
        int guess = 0;
        int ans = a / b;
        while (a % b != 0) {
            a = ((int) (Math.random() * 6) + 1) * 2;
            b = (int) (Math.random() * 6) + 1;
            ans = a / b;
        }
        System.out.println(a + " / " + b + " = ");
        guess = scanner.nextInt();
        if (guess == ans)
        {
            System.out.println ("You got it right!");
            return 1;
        }
        return 0;
    }
}
