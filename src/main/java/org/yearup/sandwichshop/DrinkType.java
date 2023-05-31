package org.yearup.sandwichshop;

public enum DrinkType {COKE("Coke"), SPRITE("Sprite"), TEA("Tea"), JUICE("Juice");
    private final String name;

    public String getName() {
        return name;
    }

    DrinkType(String name) {
        this.name = name;
    }
}
