package practices.others;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int guess, rights, number;
        boolean isNewGame = true;

        System.out.println("How many rights does the user have in this game?");
        rights = scan.nextInt();

        while (isNewGame) {
            System.out.println("Welcome to New Game");
            number = (int) (Math.random() * 101);

            while (true) {
                System.out.print("Input your guess: ");
                guess = scan.nextInt();

                if (guess > number) {
                    rights--;
                    System.out.println("Your guess was wrong. You have " + rights + " rights.");
                    System.out.println("Tip: You must think a lower number");
                } else if (guess < number) {
                    rights--;
                    System.out.println("Your guess was wrong. You have " + rights + " rights.");
                    System.out.println("Tip: You must think a higher number");
                } else {
                    System.out.println("Congratulations. Your guess is correct :)");
                    isNewGame = isNewGame();
                    break;
                }
                if (rights == 0) {
                    System.out.println("You loss the game...");
                    System.out.println("The correct number is: " + number);

                    isNewGame = isNewGame();
                    break;
                }
            }
        }
    }

    static boolean isNewGame() {
        Scanner scan = new Scanner(System.in);

        System.out.println("PLAY AGAIN: y OR n");
        char answer = scan.next().charAt(0);

        if (answer == 'y') {
            return true;
        } else {
            return false;
        }
    }
}
