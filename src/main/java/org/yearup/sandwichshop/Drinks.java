package org.yearup.sandwichshop;

public class Drinks {

    private DrinkSize size;
    private double price;
    private DrinkType type;

    public Drinks(DrinkSize size, double price, DrinkType type) {
        this.size = size;
        this.price = price;
        this.type = type;
    }

    public DrinkSize getSize() {
        return size;
    }

    public double getPrice(DrinkType type) {
        return price;
    }

    public DrinkType getType() {
        return type;
    }

    public void setPrice(double price) {
        if(size == DrinkSize.SMALL) {
            this.price = 2.00;
        } else if(size == DrinkSize.MEDIUM) {
            this.price = 2.50;
        } else if(size == DrinkSize.LARGE){
            this.price = 3.00;
        }
    }

}
