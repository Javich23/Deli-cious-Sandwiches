package org.yearup.sandwichshop;

public enum ChipType {BAKED(1.50), BBQ(1.50), JALAPENO(1.50), CHEDDAR(1.50), SEASALT(1.50);
    private double price;

    ChipType(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
