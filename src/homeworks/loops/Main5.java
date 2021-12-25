package homeworks.loops;

import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input your fibonacci length: ");
        int length = scanner.nextInt();
        int counter = 0;
        int number1, number2 = 1, sum = 0;

        while (counter < length) {
            number1 = number2;
            System.out.print(sum + " ");
            number2 = sum;
            sum = number1 + number2;

            counter++;
        }
    }
}
