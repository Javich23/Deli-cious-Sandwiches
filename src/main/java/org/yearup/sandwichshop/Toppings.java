package org.yearup.sandwichshop;

public enum Toppings {
    //Meat Toppings
    STEAK("Steak",ToppingType.PREMIUM,1.00),
    HAM("Ham",ToppingType.PREMIUM,1.00),
    SALAMI("Salami",ToppingType.PREMIUM,1.00),
    ROAST_BEEF("Roast_Beef",ToppingType.PREMIUM,1.00),
    CHICKEN("Chicken",ToppingType.PREMIUM,1.00),
    BACON("Bacon",ToppingType.PREMIUM,1.00),
    //Cheese Toppings
    AMERICAN("American",ToppingType.PREMIUM,0.75),
    PROVOLONE("Provolone",ToppingType.PREMIUM,0.75),
    CHEDDAR("Cheddar",ToppingType.PREMIUM,0.75),
    SWISS("Swiss",ToppingType.PREMIUM,0.75),
    //Included toppings(Free)
    LETTUCE("Lettuce",ToppingType.REGULAR,0.00),
    PEPPER("Pepper",ToppingType.REGULAR,0.00),
    ONIONS("Onions",ToppingType.REGULAR,0.00),
    TOMATOES("Tomatoes",ToppingType.REGULAR,0.00),
    JALAPENOS("Jalapenos",ToppingType.REGULAR,0.00),
    CUCUMBERS("Cucumbers",ToppingType.REGULAR,0.00),
    PICKLES("Pickles",ToppingType.REGULAR,0.00),
    GUACAMOLE("Guacamole",ToppingType.REGULAR,0.00),
    MUSHROOMS("Mushrooms",ToppingType.REGULAR,0.00)
    ;
    private String name;
    private ToppingType type;
    private double price;
    Toppings(String name,ToppingType type,double price) {
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

    public double getPrice() {
        return price;
    }
}
