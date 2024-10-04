class Main {
    public static void main(String[] args) {
        System.out.println("\nGroup Z - Example\n");
        for (int i = 0; i < 25; i += 4)
            System.out.print(i + " ");
        System.out.println();
        for (int i = 0; i < 10; i++)
            System.out.print("m ");
        System.out.println();
        System.out.println("\nGroup C – Skip Counting\n");
        for (int i = 0; i <= 18; i += 2)
            System.out.print(i + " ");
        System.out.println(" ");
        for (int i = 1; i <= 19; i += 2)
            System.out.print(i + " ");
        System.out.println(" ");
        for (int i = 0; i <= 30; i += 3)
            System.out.print(i + " ");
        System.out.println(" ");
        for (int i = 0; i <= 40; i += 4)
            System.out.print(i + " ");
        System.out.println(" ");
        for (double i = 1; i <= 5.5; i += 0.5)
            System.out.print(i + " ");
        System.out.println("\nGroup D – One Thing Repeated\n");
        for (int i = 0; i <= 13; i++)
            System.out.print("*");

        System.out.println(" ");
        for (int i = 0; i <= 13; i++)
            System.out.print("2");
        System.out.println(" ");

        for (int i = 0; i <= 13; i++)
            System.out.print("10");
        System.out.println(" ");

        for (int i = 0; i <= 13; i++)
            System.out.print("la");
        System.out.println(" ");

        for (int i = 0; i <= 13; i++)
            System.out.print("-1+1");
        System.out.println(" ");
    }
}
