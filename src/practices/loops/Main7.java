package practices.loops;

import java.util.Scanner;

public class Main7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number;
        double sum = 0;

        System.out.print("Input the number: ");
        number = scanner.nextInt();

        for (int i = (int)number; i > 0; i--) {
            sum += (double) 1 / i;
        }

        System.out.format("Harmonic serie = %.2f", sum);
    }
}
