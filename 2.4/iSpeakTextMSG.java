import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String phrase = "MsZarifiIsAnAmazingTeacherPleaseGiveAGoodMark";
        while (!phrase.equals("END")) {
            System.out.println("Enter phrase, end to quit> ");
            phrase = scanner.next().toUpperCase();
            if (phrase.equals("CU")) {
                System.out.println("see you");
            } else if (phrase.equals(":-)")) {
                System.out.println("I'm happy");
            } else if (phrase.equals(":-(")) {
                System.out.println("I'm unhappy");
            } else if (phrase.equals(";-)")) {
                System.out.println("wink");
            } else if (phrase.equals(":-P")) {
                System.out.println("stick out my tongue");
            } else if (phrase.equals("( ̃. ̃)")) {
                System.out.println("sleepy");
            } else if (phrase.equals("TA")) {
                System.out.println("totally awesome"); // I've never seen ANYONE use any of the past 7 short forms
            } else if (phrase.equals("CUZ")) { // it should be with an s, get with the times
                System.out.println("because");
            } else if (phrase.equals("TY")) {
                System.out.println("thank you");
            } else if (phrase.equals("YW")) {
                System.out.println("you're welcome");
            } else if (phrase.equals("TTYL")) {
                System.out.println("talk to you later");
            } else if (!phrase.equals("END")) { // else wouldn't work cleanly due to if end being inputted then it'll still print out end, therefore I added doesn't equal end
                System.out.println("Enter a valid phrase!");
            }


        }
    }
}
