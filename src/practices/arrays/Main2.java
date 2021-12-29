package practices.arrays;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        int[] numbers = {15, 12, 788, 1, -1, -778, 2, 0};

        compareNewNumber(numbers);
    }

    public static void compareNewNumber(int[] array) {
        Scanner scanner = new Scanner(System.in);
        int difference = Integer.MIN_VALUE, temp = Integer.MIN_VALUE;
        int outUp = Integer.MAX_VALUE, outDown = Integer.MIN_VALUE;

        System.out.println("Input a number: ");
        int number = scanner.nextInt();

        for (int x : array) {
            if (number > x) {
                difference = x - number;
                if (temp < difference) {
                    temp = difference;
                    outDown = x;
                } else {
                    continue;
                }
            }
            if (number < x) {
                difference = number - x;
                if (temp < difference) {
                    temp = difference;
                    outUp = x;
                }
            }
        }

        System.out.println("The nearest number smaller than the input number: " + outDown);
        System.out.println("The nearest number greater than the input number: " + outUp);
    }
}
