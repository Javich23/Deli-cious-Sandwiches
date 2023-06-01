package org.yearup.sandwichshop;

public class Sandwich implements OrderItems{
    private SandwichSize size;
    private SandwichType type;

    public Sandwich(SandwichSize size, SandwichType type) {
        this.size = size;
        this.type = type;
    }

    public SandwichSize getSize() {
        return size;
    }

    public SandwichType getType() {
        return type;
    }

//    public void setPrice(double price) {
//        if(size == SandwichSize.FOUR) {
//            this.price = 5.50;
//        } else if(size == SandwichSize.EIGHT) {
//            this.price = 7.00;
//        } else if(size == SandwichSize.TWELVE){
//            this.price = 8.50;
//        }
//    }

    @Override
    public double getPrice() {
        return size.getPrice();
    }

    @Override
    public String getDetails() {
        return null;
    }
}
