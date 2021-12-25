package practices.loops;

import java.util.Scanner;

public class Main9 {
    public static void main(String[] args) {
        String userName, password;
        Scanner input = new Scanner(System.in);
        int right = 3;
        int balance = 1500;
        int select;
        int price;
        while (right > 0) {
            System.out.print("Your username: ");
            userName = input.nextLine();
            System.out.print("Password : ");
            password = input.nextLine();

            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.println("Hello, Welcome to Kodluyoruz Bank!");
                do {
                    System.out.println("1-Deposit\n" +
                            "2-Withdraw\n" +
                            "3-Balance Inquiry\n" +
                            "4-Exit");
                    System.out.print("Please make your selection: ");
                    select = input.nextInt();
                    switch (select) {
                        case 1:
                            System.out.print("Amount of money : ");
                            price = input.nextInt();
                            balance += price;
                            break;
                        case 2:
                            System.out.print("Amount of money: ");
                            price = input.nextInt();
                            if (price > balance) {
                                System.out.println("Insufficent balance.");
                            } else {
                                balance -= price;
                            }
                            break;
                        case 3:
                            System.out.println("Your balance: " + balance);
                            break;
                        case 4:
                            break;
                        default:
                            System.out.println("Invalid selection!");
                            break;
                    }
                } while (select != 4);
                System.out.println("See you then :)");
                break;
            } else {
                right--;
                System.out.println("Your username or password is wrong. Please try again.");
                if (right == 0) {
                    System.out.println("Your account has been blocked. Please contact to bank.");
                } else {
                    System.out.println("Your rights = : " + right);
                }
            }
        }
    }
}