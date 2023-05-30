package org.yearup.sandwichshop;

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
                    // Create a new order
                    Order order = new Order();
                    orderManager.addOrder(order);
                    // Here we can add methods to customize the order (add sandwiches, drinks, chips, etc.)
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
}
