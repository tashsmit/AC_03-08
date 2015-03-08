package nyc.c4q.tashsmit;

/**
 * Created by c4q-tashasmith on 3/8/15.
 */

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        /*int score = Scanner.nextInt();
        if (score == 100)
            System.out.println("Perfect score!");
        else if (score >= 90)
            System.out.println("Great!");
        else if (score >= 75)
            System.out.println("Not bad!");
        else if (score >= 60)
            System.out.println("You passed.");
        else
            System.out.println("You failed. :(");*/

        String emoticon = "";



        while (! emoticon.equals("q")) {

            System.out.println("How are you emoticon today? (to exit press q)");
            emoticon = scanner.nextLine();

            if (emoticon.equals(":)") || emoticon.equals(":-D")) {
                System.out.println("Today you are happy");
            } else if (emoticon.equals(":(")) {
                System.out.println("Today you are sad");
            } else if (emoticon.equals("T.T")) {
                System.out.println("Today you are crying");
            } else if (emoticon.equals("q")) {
                break;
            } else {
                System.out.println("I don't know how you feel today!");
            }
        }
        System.out.println("Okay bye see you later!");
    }
}
