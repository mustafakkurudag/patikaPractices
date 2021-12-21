package practices;

import java.util.Scanner;

public class Main4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the temperature?");
        int temperature = scanner.nextInt();

        if (temperature <= 5) {
            System.out.println("You can do snowboarding.");
        } else if (temperature > 5 && temperature <= 15) {
            System.out.println("You can go to the cinema.");
        } else if (temperature > 15 && temperature <= 25) {
            System.out.println("You can have a picnic.");
        } else {
            System.out.println("You can swim.");
        }
    }
}
