package org.yearup.sandwichshop;

public enum SandwichBread {WHITE("White"), WHEAT("Wheat"), RYE("Rye"), WRAP("Wrap");
    private final String name;

    SandwichBread(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
