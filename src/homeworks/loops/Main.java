package homeworks.loops;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many numbers you input?");
        int numbers = scanner.nextInt();
        int counter = 0;
        int number, max = Integer.MIN_VALUE;

        while (counter != numbers) {
            number = scanner.nextInt();

            if (number > max) {
                max = number;
            }

            counter++;
        }

        System.out.println("Max = " + max);
    }
}
