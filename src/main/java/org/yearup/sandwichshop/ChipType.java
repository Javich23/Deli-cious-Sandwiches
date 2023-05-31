package org.yearup.sandwichshop;

public enum ChipType {BAKED("Baked"), BBQ("BBQ"), JALAPENO("Jalapeno"), CHEDDAR("Cheddar"), SEASALT("Seasalt");

    private String name;

    ChipType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
