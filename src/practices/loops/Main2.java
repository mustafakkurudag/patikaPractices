package practices.loops;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number, sum = 0;

        while (true) {
            System.out.println("Input new number: ");
            number = scanner.nextInt();

            if (number % 2 != 0) {
                break;
            }

            if (number % 4 == 0) {
                sum += number;
            }
        }

        System.out.println("Total: " + sum);
    }
}
