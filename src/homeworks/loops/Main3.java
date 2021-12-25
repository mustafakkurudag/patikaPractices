package homeworks.loops;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many digits of the number?");
        int numberOfDigits = scanner.nextInt();

        for (int i = numberOfDigits; i > 0 ; i--) {
            for (int k = i; k <= numberOfDigits; k++) {
                System.out.print(" ");
            }

            for (int j = 2*i - 1; j > 0 ; j--) {
                System.out.print("*");
            }

            System.out.println("");
        }
    }
}
