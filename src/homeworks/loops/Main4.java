package homeworks.loops;

public class Main4 {

    public static void main(String[] args) {
        int m, n = 0;
        boolean flag = false;

        while (n <= 100) {
            m = n / 2;

            if (n == 0 || n == 1) {
                n++;
                continue;
            } else if (n == 2) {
                System.out.println(n + " is a prime number");
                n++;
                continue;
            } else {
                for (int i = 2; i <= m+1; i++) {
                    if (n % i == 0) {
                        flag = false;
                        break;
                    } else {
                        flag = true;
                        continue;
                    }
                }

                if (flag) {
                    System.out.println(n + " is a prime number");
                }
            }
            n++;
        }
    }
}
