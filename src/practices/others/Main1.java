package practices.others;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input a word:");
        String word = scanner.nextLine();
        String reverseWord = "";

        char[] wordArray = word.toCharArray();

        for (int i = wordArray.length - 1; i >= 0; i--) {
            reverseWord += wordArray[i];
        }

        if (word.compareTo(reverseWord) == 0) {
            System.out.println(word + " is a palindrome...");
        } else {
            System.out.println(word + " is not a palindrome...");
            System.out.println("Reverse: " + reverseWord);
        }
    }
}
