package practices.loops;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n, r, factorialN, factorialR, combination;

        System.out.println("Input n value: ");
        n = scan.nextInt();

        System.out.println("Input r value: ");
        r = scan.nextInt();

        factorialN = calculteFactroial(n);
        factorialR = calculteFactroial(r);

        combination = factorialN / (factorialR * (calculteFactroial(n - r)));

        System.out.println("C(" + n + ", " + r + ") = " + combination);

    }

    static int calculteFactroial(int n) {
        int factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
        }

        return factorial;
    }
}
