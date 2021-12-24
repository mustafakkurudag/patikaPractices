package practices.loops;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int limit;

        System.out.println("Input the limit value: ");
        limit = scanner.nextInt();

        for (int i = 0; i <= limit; i++) {
            System.out.println((int) Math.pow(4, i) + ", " + (int) Math.pow(5, i));
        }
    }
}
