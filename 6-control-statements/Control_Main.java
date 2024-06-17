import java.util.Scanner;

public class Control_Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // int amountOfMoneyOnAccount = 100;
        // int itemPrice = 200;

        // if (amountOfMoneyOnAccount < itemPrice) {
        // System.out.println("You don't have enough money on your account to purchase "
        // + " this item.");
        // } else {
        // System.out.println("Item is purchased");
        // }

        // amountOfMoneyOnAccount += 200;
        // if (amountOfMoneyOnAccount < itemPrice) {
        // System.out.println("You don't have enough money on your account to purchase "
        // + " this item.");
        // } else {
        // System.out.println("Item is purchased");
        // }

        // int i1 = 3;
        // int i2 = 2;
        // int i3 = 10;
        // if (i1 > i2) {
        // if (i1 < i3) {
        // System.out.println("i1 is more than i2 and i3");
        // } else {
        // System.out.println("i1 is more than i2 but less than i3");
        // }
        // }

        // int order = 1000;

        // if (order > 0 & order < 100) {
        // System.out.println("You have 5% discount for this order");
        // } else if (order >= 100 && order < 500) {
        // System.out.println("You have 10% discount for this order");
        // } else if (order >= 500 && order < 5000) {
        // System.out.println("You have 15% discount for this order");

        // }

        // Switch statement

        // expression types available: byte, short, char, int, String, Enum
        String customerStatus = "premium_customer";
        switch (customerStatus) {
            case "guest":
                System.out.println("Thank you for your order!");
                break;
            case "regular_customer":
                System.out.println(
                        "Thank you for your purchase! Take discount 10% for your order "
                                + "as a gratitude for staying with us.");
                break;
            case "premium_customer":
                System.out.println("Wow! You are our PREMIUM customer! Just take all order "
                        + "for 1 USD.");
                break;
            default:
                System.out.println("Customer doesn't have status set.");
        }

        System.out.println("============ No break demo");
        int i = 1;
        switch (i) {
            case 1:
                System.out.println("one");
            case 2:
                System.out.println("two");
                break;
            default:
                System.out.println("This is default block");
        }

        System.out.println("============ Default block demo");

        i = 10;
        switch (i) {
            case 1:
                System.out.println("one");
            case 2:
                System.out.println("two");
                break;
            default:
                System.out.println("This is default block");
        }

        // Switch statement vs IF statement

        // Switch statement
        // Test for equality between the value of the expression and one of the case
        // constants
        // Better performance for multi way branching. Compiler will create "Jump table"
        // for switch statement and will use table for selecting the path of execution
        // depending on the value of the expression.
        // More readable

        // IF Statement
        // Can text expressions based on ranges of vaues or conditions
        // Each if statement will be evaluated, which can decrease performance in case
        // there are a lot of 'if' statement
        // Multiple 'if-else' statement makes codes less readable

        System.out.print("Please enter this actions for further execution \n"
                + "login, sign_up, terminate_program, main_menu, about_app, again_to_execute");

        String userInput = sc.nextLine();

        switch (userInput) {
            case "login":
                System.out.print("Please Enter your username :) ");
                String username = sc.next();
                System.out.println("You enetered :) " + username);
                break;
            case "sign_up":
                System.out.println("WELCOME :) ");
                break;
            case "terminate_program":
                System.out.println("Thank you! Good bye :) ");
                break;
            case "main_menu":
                System.out.println("Main Menu");
                break;
            case "about_app":
                System.out.println("This app is created by me with support of IT-BUlls.com");
                break;
            case "again_to_execute":
                System.out.println(
                        "Please, enter one of these values login, sign_up, terminate_program, main_menu, about_app");
                userInput = sc.next();
                System.out.println(userInput);
                break;
            default:
                break;
        }

    }
}
