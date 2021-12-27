package homeworks.methods;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        drawPattern(number, number, true);
    }

    static void drawPattern(int number, int tempNumber, boolean bool) {

        if (number > 0 && bool) {
            System.out.print(number + ", ");
            drawPattern(number - 5, tempNumber, true);
        } else if (number <= tempNumber) {
            System.out.print(number + ", ");
            drawPattern(number + 5, tempNumber, false);
        }
    }
}
