package org.yearup.sandwichshop;

public enum Sauce implements OrderItems {MAYO("Mayo"), MUSTARD("Mustard"), KETCHUP("Ketchup"), RANCH("Ranch"), THOUSAND_ISLANDS("Thousand Islands"), VINAIGRETTE("Vinaigrette");
    private String name;

    Sauce(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    @Override
    public double getPrice() {
        return 0.00;
    }

    @Override
    public String getDetails() {
        return "SAUCE: " + getName();
    }
}
