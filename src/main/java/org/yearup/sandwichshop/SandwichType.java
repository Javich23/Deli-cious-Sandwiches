package org.yearup.sandwichshop;

public enum SandwichType {WHITE("White"), WHEAT("Wheat"), RYE("Rye"), WRAP("Wrap");
    private final String name;

    SandwichType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
