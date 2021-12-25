package practices.loops;

import java.util.Scanner;

public class Main6CalculateArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number, tempNumber, numberOfDigits = 0, digit;
        int sum = 0, exponential = 1;

        System.out.println("Input the number: ");
        number = scanner.nextInt();

        tempNumber = number;

        while (tempNumber != 0) {
            tempNumber /= 10;
            numberOfDigits++;
        }

        tempNumber = number;

        while (tempNumber != 0) {
            digit = tempNumber % 10;
            tempNumber /= 10;

            exponential = 1;
            for (int i = 0; i < numberOfDigits; i++) {
                exponential *= digit;
            }

            sum += exponential;
        }

        if (sum == number) {
            System.out.println("The number you inputted is an armstrong number.");
        } else {
            System.out.println("The number you inputted is not an armstrong number.");
        }
    }
}
