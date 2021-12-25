package practices.loops;

import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int base, power;
        int result = 1;

        System.out.println("Input the base number: ");
        base = scan.nextInt();

        System.out.println("Input the power number: ");
        power = scan.nextInt();

        for (int i = 0; i < power; i++) {
            result *= base;
        }

        System.out.println(base + " to the power of " + power + " = " + result);
    }
}
