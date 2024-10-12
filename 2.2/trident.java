import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter tine length");
        Scanner scanner = new Scanner(System.in);
        int tineL = scanner.nextInt();
        System.out.println("Enter tine spacing");
        int tineS = scanner.nextInt();
        System.out.println("Enter handle length");
        int handle = scanner.nextInt();
        String tineSpace = " ".repeat(tineS); // Creates spacing
        String tine = "*" + tineSpace + "*" + tineSpace + "*"; // This creates the first tine
        for (int k = 0; k < tineL; k++) {
            System.out.println(tine); // This repeats the tine per how much the length is
        }
        String tineSpaceBase = "*".repeat(tineS * 2); // This is the tine spacing multiplied by two (two rows of *)
        String tineBase = "***" + tineSpaceBase; // Three *'s are added due to the 3 *'s minimum already being there and not accounted for in the tineSpaceBase calc
        System.out.println(tineBase);
        String tineHandle = tineSpace + " *" + tineSpace; // The following 3 lines prints the tine handle
        for (int j = 0; j < handle; j++) {
            System.out.println(tineHandle);
        }

        System.out.println();
    }
}




