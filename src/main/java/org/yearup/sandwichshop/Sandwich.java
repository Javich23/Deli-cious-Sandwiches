package org.yearup.sandwichshop;

import java.util.ArrayList;
import java.util.List;

public class Sandwich implements OrderItems{
    private SandwichSize size;
    private SandwichBread type;
    private static List<Topping> toppings;
    private static  List<Sauce> sauces;
    private boolean toasted;

    public Sandwich(SandwichSize size, SandwichBread type) {
        this.size = size;
        this.type = type;
        toppings = new ArrayList<>();
        sauces = new ArrayList<>();
        this.toasted = false;
    }

    public SandwichSize getSize() {
        return size;
    }

    public SandwichBread getType() {
        return type;
    }

    public static void addTopping(Topping topping) {
        toppings.add(topping);
    }
    public static void addSauce(Sauce sauce){
        sauces.add(sauce);
    }
    @Override
    public double getPrice() {
        double totalPrice = size.getPrice();
        for(Topping topping: toppings) {
            totalPrice += topping.getPrice(size);
        }
        return totalPrice;
    }

    @Override
    public String getDetails() {
        return "SIZE: " + size.getInches() +"\n"
                +"BREAD: " + type.getName() +"\n"
                +"TOPPINGS: " + toppings + "\n"
                +"SAUCES: " + sauces + "\n"
                +"TOASTED: " + (toasted ? "YES" : "NO");



    }

    public void setToasted(boolean toasted) {
        this.toasted = toasted;
    }
}
