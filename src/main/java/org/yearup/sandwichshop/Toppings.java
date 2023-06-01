package org.yearup.sandwichshop;

public enum Toppings implements OrderItems {
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
    private double price;
    SandwichSize sandwichSize;

    Toppings(String name, ToppingType type, double price) {
        this.name = name;
        this.type = type;
        this.price = price;
    }

    public ToppingType getType() {
        return type;
    }

    public String getName() {
        return name;
    }


    @Override
    public double getPrice() {
        if (type == ToppingType.MEAT && sandwichSize.getInches().equals("8\"")) {
            return 2.00;
        } else if (type == ToppingType.CHEESE && sandwichSize.getInches().equals("12\"")) {
            return 3.00;
        } else {
            return price;
        }
    }

    @Override
    public String getDetails() {
        return "Toppings: " + getName() + " " + getType() + " " + getPrice();
    }
}
