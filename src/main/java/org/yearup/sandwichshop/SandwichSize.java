package org.yearup.sandwichshop;

public enum SandwichSize {
    FOUR("4\"", 5.50), EIGHT("8\"", 7.00), TWELVE("12\"", 8.50);
    private String inches;
    private double price;

    SandwichSize(String inches, double price) {
        this.inches = inches;
        this.price = price;
    }

    public String getInches() {
        return this.inches;
    }

    public double getPrice() {
        return price;
    }
}

