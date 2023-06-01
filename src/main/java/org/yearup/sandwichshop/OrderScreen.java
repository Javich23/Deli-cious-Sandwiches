package org.yearup.sandwichshop;

import java.util.Scanner;

public class OrderScreen {
    static Scanner consoleInput = new Scanner(System.in);
    private Order order;
    public Topping topping;
//    private Sandwich sandwich;

    public OrderScreen(Order order) {
        this.order = order;
    }

    public void orderScreen() {
        boolean exit = false;

        while (!exit) {
            System.out.println("""
                                    
                    ======= ORDER HERE ========
                    [1] ADD SANDWICH
                    [2] ADD DRINK
                    [3] ADD CHIP
                    [4] CHECKOUT
                    [0] CANCEL ORDER
                    """);
            System.out.print("Choose an option: ");
            int choice = consoleInput.nextInt();
            switch (choice) {
                case 1-> addSandwich();
                case 2-> addDrink();
                case 3-> addChip();
                case 4-> checkout();
                case 0-> exit = true;
                default-> System.out.println("Oops, that didn't work. Try again!");
            }
        }
    }
    private void addSandwich() {

        System.out.println("""
                [1] WHITE
                [2] WHEAT
                [3] RYE
                [4] WRAP
                """);
        System.out.print("Choose your bread: ");
        int bread = consoleInput.nextInt();
        SandwichBread sandwichBread = SandwichBread.values()[bread - 1];
        System.out.println("""
                [1] 4"
                [2] 8"
                [3] 12"
                """);
        System.out.print("Choose your size: ");
        int size = consoleInput.nextInt();
        SandwichSize sandwichSize = SandwichSize.values()[size - 1];
        Sandwich sandwich1 = new Sandwich(sandwichSize,sandwichBread);
        System.out.println("""
                [1] STEAK
                [2] HAM
                [3] SALAMI
                [4] ROAST BEEF
                [5] CHICKEN
                [6] BACON
                """);
        System.out.print("CHOOSE A MEAT (ENTER NUMBER): ");
        int meat = consoleInput.nextInt();
        Topping meatTopping = Topping.values()[meat - 1];
        Sandwich.addTopping(meatTopping);
        System.out.println("""
                [7] AMERICAN
                [8] PROVOLONE
                [9] CHEDDAR
                [10] SWISS
                """);
        System.out.print("CHOOSE A CHEESE(ENTER NUMBER): ");
        int cheese = consoleInput.nextInt();
        Topping cheeseTopping = Topping.values()[cheese - 1];
        Sandwich.addTopping(cheeseTopping);
        boolean done = false;
        while(!done) {
            System.out.println("""
                    [11] LETTUCE
                    [12] PEPPER
                    [13] ONION
                    [14] TOMATOES
                    [15] JALAPENOS
                    [16] CUCUMBERS
                    [17] PICKLES
                    [18] GUACAMOLE
                    [19] MUSHROOMS
                    [0] DONE WITH TOPPINGS
                    """);

            System.out.print("CHOOSE TOPPING(S): ");
            int topping = consoleInput.nextInt();
            if(topping == 0) {
                done = true;
            } else {
                Topping freeTopping = Topping.values()[topping - 1];
                Sandwich.addTopping(freeTopping);
            }
        }
        boolean loop = false;
        while(loop) {
            System.out.println("""
                    [1] MAYO
                    [2] MUSTARD
                    [3] KETCHUP
                    [4] RANCH
                    [5] THOUSAND ISLANDS
                    [6] VINAIGRETTE
                    [0] DONE WITH SAUCES
                    """);

            System.out.print("CHOOSE SAUCE(S): ");
            int sauce = consoleInput.nextInt();
            if(sauce == 0) {
                loop = true;
            } else {
                Sauce sauces = Sauce.values()[sauce - 1];
                Sandwich.addSauce(sauces);
            }
        }
        order.addOrder(sandwich1);
    }

    private void addDrink() {
        System.out.println("""
                [1] SMALL
                [2] MEDIUM
                [3] LARGE
                """);
        System.out.print("Choose a size: ");
        int size = consoleInput.nextInt();
        DrinkSize drinkSize = DrinkSize.values()[size -1];
        System.out.print("""
                [1] COKE
                [2] SPRITE
                [3] TEA
                [4] JUICE
                """);
        System.out.print("Chose a beverage: ");
        int type = consoleInput.nextInt();
        DrinkType drinkType = DrinkType.values()[type - 1];
        Drink drink = new Drink(drinkSize, drinkType);
        order.addOrder(drink);
        System.out.println("\nAdded " + drinkSize + " " + drinkType);

    }

    private void addChip() {
        System.out.print("""
                [1] BAKED
                [2] BBQ
                [3] JALAPENO
                [4] CHEDDAR
                [5] SEASALT
                """);
        System.out.print("Choose a chip: ");
        int type = consoleInput.nextInt();
        ChipType chipType = ChipType.values()[type - 1];
        Chip chip = new Chip(chipType);
        order.addOrder(chip);
        System.out.println("\nAdded " + chipType + " CHIPS");
    }

    private void checkout() {
        System.out.println("========= YOUR ORDER =========");
        for(OrderItems item: order.getItems()) {
            System.out.println(item.getDetails());
        }
        System.out.printf("Total price: $%.2f\n", order.getTotalPrice());

        // Saving the order details to a receipt file
        ReceiptFileManager receiptFileManager = new ReceiptFileManager(order);
        receiptFileManager.saveToFile();

    }
}

