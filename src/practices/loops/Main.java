package practices.loops;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input a number: ");
        int number = scanner.nextInt();

        int i = 0, sum = 0, counter = 0;
        double average;

        while (i <= number) {
            if (i % 3 == 0 || i % 4 == 0) {
                sum += i;
                counter++;
            }

            i++;
        }

        average = sum / counter;

        System.out.println("Result = " + average);
    }
}
