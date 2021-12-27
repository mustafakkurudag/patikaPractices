package homeworks.methods;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int base, power;

        System.out.print("Input base value: ");
        base = scanner.nextInt();

        System.out.print("Input power value: ");
        power = scanner.nextInt();

        int result = pow(base,power);
        System.out.println(base + " to power of " + power + " = " + result);
    }

    static int pow(int base, int power) {

        int result = 1;

        for (int i = 0; i < power; i++) {
            result = base * pow(base, power-1);
        }

        return result;
    }
}
