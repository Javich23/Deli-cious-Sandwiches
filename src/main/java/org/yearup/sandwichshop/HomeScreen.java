package org.yearup.sandwichshop;

import java.util.Scanner;

public class HomeScreen {
    static Scanner consoleInput = new Scanner(System.in);

    public void display() {
        boolean exit = false;

        while (!exit) {
            System.out.println("\u001B[36m" + """

                    ======  Sandwich Shop =====
                                       
                    [1] NEW ORDER
                    [0] EXIT
                    """);

            System.out.print("Enter option: ");
            int option = consoleInput.nextInt();
            consoleInput.nextLine();
            switch (option) {
                case 1 ->{
                    Order order = new Order();
                    OrderScreen orderScreen = new OrderScreen(order);
                    orderScreen.orderScreen();
                }

                case 0 -> exit = true;

                default->
                        System.out.println("Invalid option, please try again.");

            }
        }
    }

}
