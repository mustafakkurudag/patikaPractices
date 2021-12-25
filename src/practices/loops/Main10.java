package practices.loops;

import java.util.Scanner;

public class Main10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1, number2;
        int lcm = 0, gcd = -1, max;
        int i = 1;

        System.out.print("Input first number: ");
        number1 = scanner.nextInt();

        System.out.print("Input second number: ");
        number2 = scanner.nextInt();

        max = number1 * number2;

        while (i < number1) {
            if (number1 % i == 0 && number2 % i == 0) {
                gcd = i;
            }

            i++;
        }

        while (max > 1) {
            if (max % number1 == 0 && max % number2 == 0) {
                lcm = max;
            }

            max--;
        }

        System.out.println("Greatest common divisor of " + number1 + " and " + number2 + " is " + gcd);
        System.out.println("Least common multiple of " + number1 + " and " + number2 + " is " + lcm);
    }
}
