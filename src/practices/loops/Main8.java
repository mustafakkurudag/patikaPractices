package practices.loops;

import java.util.Scanner;

public class Main8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        System.out.println("Input a number: ");
        number = scanner.nextInt();

        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number-i; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k < (2*i+1); k++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        for (int x = number-1; x > 0; x--) {
            for (int z = number - x; z >= 0; z--) {
                System.out.print(" ");
            }

            for (int y = 2*x-1; y > 0; y--) {
                System.out.print("*");
            }

            System.out.println("");

        }
    }
}
