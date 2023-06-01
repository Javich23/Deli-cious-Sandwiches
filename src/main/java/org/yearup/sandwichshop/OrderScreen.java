package org.yearup.sandwichshop;

import java.util.EnumSet;
import java.util.Scanner;

public class OrderScreen {
    static Scanner consoleInput = new Scanner(System.in);
    private Order order;
//    private Sandwich sandwich;
    private Toppings toppings;
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
        for(SandwichType i : SandwichType.values()) {
            System.out.printf("%s", i.getName()+ "\n");
        }
        System.out.print("Choose your bread: ");
        String bread = consoleInput.next().toUpperCase();
        SandwichType sandwichType = SandwichType.valueOf(bread);
        for(SandwichSize s : SandwichSize.values()) {
            System.out.printf("%s", s + " INCHES\n");
        }
        System.out.print("Choose your size: ");
        String size = consoleInput.next().toUpperCase();
        SandwichSize sandwichSize = SandwichSize.valueOf(size);
        Sandwich sandwich1 = new Sandwich(sandwichSize, sandwichType);
        for(Toppings t : Toppings.values()) {
            if(t.equals(ToppingType.MEAT)) {
                System.out.printf("%s", t.getName()+ "\n");
            }
        }
        System.out.print("Choose your meat: ");
        String topping = consoleInput.next();

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
        System.out.println("Added " + drinkSize + " " + drinkType);

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
        System.out.println("Added " + chipType + " CHIPS");
    }

    private void checkout() {
        System.out.println("YOUR ORDER: ");
       for(OrderItems item: order.getItems()) {
           System.out.println(item.getDetails());
       }
        System.out.printf("Total price: $%.2f\n", order.getTotalPrice());

    }
}

