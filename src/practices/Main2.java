package practices;

import java.util.Scanner;

public class Main2 {
    static String PASSWORD = "a1B2c3D4";
    static final String USERNAME = "myusername";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String userName, password, answer;

        while (true) {
            System.out.println("Username: ");
            userName = scanner.nextLine();

            System.out.println("Password: ");
            password = scanner.nextLine();

            if (userName.compareTo(USERNAME) == 0) {
                if (password.compareTo(PASSWORD) == 0) {
                    System.out.println("Welcome!");
                    break;
                } else {
                    System.out.println("The password you entered is incorrect. Would you like to change your password? Yes or No");
                    answer = scanner.nextLine();

                    if (answer.compareTo("No") == 0) {
                        continue;
                    } else {
                        System.out.println("Input your new password: ");
                        password = scanner.nextLine();

                        if (password.compareTo(PASSWORD) == 0) {
                            System.out.println("Your new and old password couldn't be the same!");
                        } else {
                            System.out.println("Your password has been changed!");
                            PASSWORD = password;
                        }
                    }
                }
            } else {
                System.out.println("The username you entered was not found in our records! Please try again.");
            }
        }
    }
}
