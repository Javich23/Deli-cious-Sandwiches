package org.yearup.sandwichshop;
public enum DrinkSize {SMALL("Small",2.00), MEDIUM("Medium",2.50), LARGE("Large",3.00);
    private final String name;
    private final double price;

    DrinkSize(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

