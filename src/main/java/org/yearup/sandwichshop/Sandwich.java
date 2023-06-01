package org.yearup.sandwichshop;

import java.util.ArrayList;
import java.util.List;

public class Sandwich implements OrderItems{
    private SandwichSize size;
    private SandwichBread type;
    private static List<Topping> toppings;
    private static  List<Sauce> sauces;

        public Sandwich(SandwichSize size, SandwichBread type) {
        this.size = size;
        this.type = type;
        this.toppings = new ArrayList<>();
        this.sauces = new ArrayList<>();
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
        return size.getPrice();
    }

    @Override
    public String getDetails() {
        return "SIZE: " + size.getInches() +"\n"
                +"BREAD: " + type.getName() +"\n"
                    +"Toppings: " + toppings + "\n";


    }
}
