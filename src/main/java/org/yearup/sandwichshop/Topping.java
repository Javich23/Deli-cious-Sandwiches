package org.yearup.sandwichshop;

public enum Topping {
    //Meat Toppings
    STEAK("Steak", ToppingType.MEAT, 1.00),
    HAM("Ham", ToppingType.MEAT, 1.00),
    SALAMI("Salami", ToppingType.MEAT, 1.00),
    ROAST_BEEF("Roast_Beef", ToppingType.MEAT, 1.00),
    CHICKEN("Chicken", ToppingType.MEAT, 1.00),
    BACON("Bacon", ToppingType.MEAT, 1.00),
    //Cheese Toppings
    AMERICAN("American", ToppingType.CHEESE, 0.75),
    PROVOLONE("Provolone", ToppingType.CHEESE, 0.75),
    CHEDDAR("Cheddar", ToppingType.CHEESE, 0.75),
    SWISS("Swiss", ToppingType.CHEESE, 0.75),
    //Included toppings(Free)
    LETTUCE("Lettuce", ToppingType.REGULAR, 0.00),
    PEPPER("Pepper", ToppingType.REGULAR, 0.00),
    ONIONS("Onions", ToppingType.REGULAR, 0.00),
    TOMATOES("Tomatoes", ToppingType.REGULAR, 0.00),
    JALAPENOS("Jalapenos", ToppingType.REGULAR, 0.00),
    CUCUMBERS("Cucumbers", ToppingType.REGULAR, 0.00),
    PICKLES("Pickles", ToppingType.REGULAR, 0.00),
    GUACAMOLE("Guacamole", ToppingType.REGULAR, 0.00),
    MUSHROOMS("Mushrooms", ToppingType.REGULAR, 0.00);
    private String name;
    private ToppingType type;
    private double basePrice;

    Topping(String name, ToppingType type, double basePrice) {
        this.name = name;
        this.type = type;
        this.basePrice = basePrice;
    }

    public ToppingType getType() {
        return type;
    }

    public String getName() {
        return name;
    }
//    public static double getExtraMeat(SandwichSize size) {
//        double extraPrice = 0.0;
//        if(true) {
//            if(size == SandwichSize.FOUR) {
//                extraPrice = 0.50;
//            } else if(size == SandwichSize.EIGHT){
//                extraPrice = 1.00;
//            } else if(size == SandwichSize.TWELVE) {
//                extraPrice = 1.50;
//            }
//        }
//        return extraPrice;
//    }
    public double getPrice(SandwichSize size) {
        double price = basePrice;
        if (size == SandwichSize.EIGHT) {
            price *= 2.0;
        } else if (size == SandwichSize.TWELVE) {
            price *= 3.0;
        }
        return price;
    }
}
