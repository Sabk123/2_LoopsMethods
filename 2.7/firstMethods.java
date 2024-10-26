public class firstMethods {
    public static void main(String args[]) {
        new firstMethods();
    }

    public firstMethods() {
        square();
        blank();
        circle();
        blank();
        bunny();
        blank();
        line();
        blank();
        count();
        blank();
        signature();
    }

    public void blank() { //fill in the code to make a blank line on the screen.
        System.out.println();
    }

    public void square() { //fill in the code to make an ASCII square here.
        System.out.println("******");
        System.out.println("*    *");
        System.out.println("*    *");
        System.out.println("******");
    }

    public void circle() { //fill in the code to make an ASCII square here.
        System.out.println(" ***");
        System.out.println("*   *");
        System.out.println(" ***");
    }

    public void bunny() { //fill in the code to make an ASCII bunny here.
        System.out.println("\\\\\n" +
                "\\\\_\n" +
                "( _\\\n" +
                "/ \\__\n" +
                "/ _/`\"`\n" +
                "{\\ )_\n" +
                "`\"\"\"`"); 
    }

    public void line() { //use a loop to make a line of stars * here.
        for (int i = 0; i <= 10; i++)
            System.out.print("*");
        System.out.println();
    }


    public void count() { //use a loop to count from 1 to 10 here.
        for (int i = 0; i < 10; i++) {
            System.out.print(i + ", ");
        }
        System.out.println("10");
    }

    public void signature() { //make a "signature" for yourself
        System.out.println("PLEASE GIVE ME A GOOD MARK PLEAAASSSEEE, thanks - Saboor");
    }
}
