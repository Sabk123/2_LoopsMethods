import java.util.Scanner;

public class fizzBuzz_twoPlayer {
    public static void main(String args[]) {
        new fizzBuzz_twoPlayer();
    }

    public fizzBuzz_twoPlayer() {
        rules();
        Scanner scanner = new Scanner(System.in);
        char again = 'y';

        while (again != 'n') {
            System.out.println();
            int turn = 1;
            boolean done = false;
            int n = 1;

            while (!done) {
                if (turn == 1) {
                    done = humanTurn(n);
                    turn = 2;
                } else {
                    done = aiTurn(n);
                    turn = 1;
                }
                n++;
            }
            System.out.println("Play again? (y/n)>> ");
            again = scanner.next().charAt(0);
        }
    }

    public void rules() {
        System.out.println("Fizz Buzz rules");
        System.out.println("Any number divisible by 3 is called out by saying 'fizz'");
        System.out.println("Any number divisible by 5 is called out by saying 'buzz'");
        System.out.println("Any number divisible by both 3 and 5 is called out by saying fizzbuzz");
    }

    public String fBNum(int n) {
        int fizz = 3;
        int buzz = 5;
        if ((n % fizz ==0) && (n % buzz == 0)){
            return("fizzbuzz");
        }
        if (n % fizz == 0){
            return("fizz");
        }
        if (n % buzz == 0){
            return("buzz");
        }
        return String.valueOf(n);
    }

    public boolean humanTurn(int n) {
        Scanner scanner = new Scanner(System.in);
        String right = fBNum(n);
        System.out.println("Human >> ");
        String ans = scanner.next().toLowerCase();

        if (ans.equals(right)) {
            return false;
        } else {
            System.out.println("Human, that's wrong! It's " + right);
            System.out.println("The AI wins!");
            return true;
        }
    }

    public boolean aiTurn(int n) {
        int prob = (int) (Math.random() * 5) + 1;

        if (prob == 2) {
            String wrong = fBNum(n + 1);
            System.out.println("AI >> " + wrong);
            System.out.println("AI, that's wrong! It's " + fBNum(n));
            System.out.println("The human wins!");
            return true;
        } else {
            System.out.println("AI >> " + fBNum(n));
            return false;
        }
    }
}
