package practices.arrays;

import java.util.Arrays;

public class Main3 {
    public static void main(String[] args) {
        String[][] stars = new String[7][4];

        for (int i = 0; i < stars.length; i++) {
            for (int j = 0; j < stars[i].length; j++) {
                if (i == 0 || i == 3 || i == 6) {
                    stars[i][j] = "*";
                } else if (j == 0 || j == 3) {
                    stars[i][j] = "*";
                } else{
                    stars[i][j] = " ";
                }
            }
        }

        for (String[] st: stars) {
            for (String s: st) {
                System.out.print(s+ " ");
            }
            System.out.println("");
        }
    }
}
