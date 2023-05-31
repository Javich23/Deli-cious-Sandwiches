package org.yearup.sandwichshop;

public class Chip implements OrderItems{
   private ChipType type;

    public Chip(ChipType type) {
        this.type = type;
    }

    @Override
    public double getPrice() {
        return 1.50;
    }

    @Override
    public String getDetails() {
        return "Chip " + type.getName();
    }
}
