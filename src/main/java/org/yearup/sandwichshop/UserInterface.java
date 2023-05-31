package org.yearup.sandwichshop;

import java.util.Scanner;

public class UserInterface {
    static Scanner consoleInput = new Scanner(System.in);
    OrderManager orderManager; // This would manage the orders

    private void init() {
        orderManager = new OrderManager(); // Initialize the order manager
    }

    public void display() {
        init();

        boolean exit = false;

        while (!exit) {
            System.out.println("\u001B[36m" + """

                    ======  Sandwich Shop =====
                                       
                    [1] New Order
                    [0] Exit""");

            int option = consoleInput.nextInt();
            switch (option) {
                case 1:
                    orderScreen();
                    break;
                case 0:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid option, please try again.");
                    break;
            }
        }
    }

    private void orderScreen() {
        init();

        boolean exit = false;

        while (!exit) {
            String heading = """
                                    
                    ======= ORDER HERE ========
                    1) Sandwich
                    2) Drinks
                    3) Chips
                    0) Back to Home Screen
                    """;

            int choice = consoleInput.nextInt();
            switch (choice) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 0:
                    exit = true;
                    break;
                default:
                    System.out.println("Oops, that didn't work. Try again!");
                    break;

            }
        }
    }
}

