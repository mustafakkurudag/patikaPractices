package practices.loops;

import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number, digit, sum = 0;

        System.out.println("Input the number: ");
        number = scanner.nextInt();

        while (number != 0) {
            digit = number % 10;
            number /= 10;
            sum += digit;
        }

        System.out.println("Sum of digits = " + sum);
    }
}
