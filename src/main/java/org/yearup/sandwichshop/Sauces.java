package org.yearup.sandwichshop;

public enum Sauces {MAYO("Mayo"), MUSTARD("Mustard"), KETCHUP("Ketchup"), RANCH("Ranch"), THOUSAND_ISLANDS("Thousand Islands"), VINAIGRETTE("Vinaigrette");
    private String name;

    Sauces(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
