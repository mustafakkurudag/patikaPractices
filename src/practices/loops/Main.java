package practices.loops;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
        System.out.println("Input a number: ");
        int number = scanner.nextInt();

        int i = 1, counter = 0;
        double sum = 0, average;

        while (i <= number) {
            if (i % 3 == 0 && i % 4 == 0) {
                sum += i;
                counter++;
            }

            i++;
        }
            average = sum / counter;
            System.out.println("Result = " + average);
        } catch (Exception e) {
            System.out.println(e + "There are no values that can be divisible by 3 or 4");
        }
    }
}
