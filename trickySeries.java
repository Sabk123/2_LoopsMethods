class Main {
    public static void main(String args[]) {
        System.out.println("\nGroup Z - Example\n");
        for (int i = 0; i < 5; i++)
            System.out.print((i * i) + " ");
        System.out.println();
        for (int i = 0; i < 25; i += 4)
            System.out.print(i + " ");
        System.out.println();
        System.out.println("\nGroup E – Tricky Series\n");
        System.out.print("\nAdd by 0.5: ");
        for (double i = 1; i <= 5.5; i += 0.5)
            System.out.print(i + " ");
        System.out.print("\nPowers of two: ");
        for (int i = 0; i < 12; i++)
            System.out.print(Math.pow(2, i) + " ");
        System.out.print("\nMultiply by 3: ");
        for (int i = 1; i <= 59049; i *= 3) {
            System.out.print(i + " ");
        }
        System.out.print("\nDivide by 10: ");
        for (double i = 1000; 0.01 <= i; i /= 10)
            System.out.print(i + " ");
        System.out.println("\nBonus\n");
        System.out.print("Add 1 to each side: ");
        for (double i = 1; i < 9; i++) {
            double bonus1 = i + 1;
            System.out.print(i + "/" + bonus1 + " ");
        }
        System.out.print("\nAdd 1 to multiplication and add by one each time: ");
        int multiplyAdd = 1;
        for (int i = 1; i < 10; i++) {
            multiplyAdd *= i;
            System.out.print(multiplyAdd + " ");
        }
        System.out.print("\nThe fibonacci sequence is: ");
        int add = 1;
        int add2 = 1;
        System.out.print(add + " " + add2 + " ");
        for (int i = 1; i < 10; i++) {
            int nextNum = add + add2; // this took me way too long to realize this was the fibonacci sequence, I wonder what else I missed
            System.out.print(nextNum + " ");
            add = add2; // storing first number as the second number for the next iteration of the loop
            add2 = nextNum; // storing add2 as the two old numbers for the next iteration of the loop
        }
    }
}
