package org.yearup.sandwichshop;

public class Sandwich {
    private SandwichSize size;
    private double price;
    private SandwichType type;

    public Sandwich(SandwichSize size, double price, SandwichType type) {
        this.size = size;
        this.price = price;
        this.type = type;
    }

    public SandwichSize getSize() {
        return size;
    }

    public double getPrice(SandwichType type) {
        return price;
    }

    public SandwichType getType() {
        return type;
    }

    public void setPrice(double price) {
        if(size == SandwichSize.FOUR) {
            this.price = 5.50;
        } else if(size == SandwichSize.EIGHT) {
            this.price = 7.00;
        } else if(size == SandwichSize.TWELVE){
            this.price = 8.50;
        }
    }
}
