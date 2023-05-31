package org.yearup.sandwichshop;

public enum SandwichSize {FOUR("4\""), EIGHT("8\""), TWELVE("12\"");
        private String inches;

    SandwichSize(String inches) {
        this.inches = inches;
    }

    public String getInches() {
        return inches;
    }
}

