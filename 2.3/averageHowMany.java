import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How big is the class? ");
        int classSize = scanner.nextInt();
        int min = 10;
        int max = 0;
        int sum = 0;
        if (classSize >= 1) { // zero or below wont work
            for (int i = 1; i <= classSize; i++) {
                int mark = 11;
                while (mark >= 11) {
                    System.out.println("What is students " + i + " mark?");
                    mark = scanner.nextInt();
                    if (min > mark && mark < 11) { // mark < 11 makes it that it won't be calculated if it is above 11
                        min = mark;
                    }
                    if (max < mark && mark < 11) {
                        max = mark;
                    }
                    if (mark < 11) {
                        sum += mark;
                    }
                    if (mark >= 11) {
                        System.out.println("Error. Mark is ten or lower");
                    }
                }

            }
            int avgMark = sum / classSize;
            System.out.println("The average mark is " + avgMark);
            System.out.println("The highest mark is " + max);
            System.out.println("The lowest mark is " + min); // hopefully not me
        } else {
            System.out.println("Please enter a class size above 0");
        }

    }
}
