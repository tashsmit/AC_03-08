package nyc.c4q.tashsmit;

/**
 * Created by c4q-tashasmith on 3/8/15.
 */
import java.util.Scanner;

public class Fruit {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please type in a fruit");
        String fruit = scanner.next();
        String color;
        String flavor;
        if (fruit.equals("banana")) {
            color = "yellow";
            flavor = "sweet";
        }
        else if (fruit.equals("grapefruit")) {
            color = "pink";
            flavor = "bitter";
        }
        else if (fruit.equals("lemon")) {
            color = "yellow";
            flavor = "sour";
        }
        else if (fruit.equals("strawberry")) {
            color = "red";
            flavor = "sweet";
        }
        else if (fruit.equals("pear")) {
            color = "green";
            flavor = "sweet";
        }
        else {
            System.out.println("I don't know that fruit.");
            return;
        }
        System.out.println("a " + fruit + " is " + color + " and tastes " + flavor);
    }

}
