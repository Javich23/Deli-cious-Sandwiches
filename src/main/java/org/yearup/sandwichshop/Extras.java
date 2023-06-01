package org.yearup.sandwichshop;

public class Extras implements OrderItems{
    private ExtraChoice choice;
    private SandwichSize size;

    public Extras(ExtraChoice choice, SandwichSize size) {
        this.choice = choice;
        this.size = size;
    }

    @Override
    public double getPrice() {
        if (this.choice == ExtraChoice.EXTRA_MEAT) {
            if (size == SandwichSize.FOUR) {
                return 0.50;
            } else if (size == SandwichSize.EIGHT) {
                return 1.00;
            } else if (size == SandwichSize.TWELVE) {
                return 1.50;
            }
        } else {
            if (size == SandwichSize.FOUR) {
                return 0.30;
            } else if (size == SandwichSize.EIGHT) {
                return 0.60;
            } else if (size == SandwichSize.TWELVE) {
                return 0.90;
            }
        }
            return 0;
    }

    @Override
    public String getDetails() {
       if(this.choice == ExtraChoice.EXTRA_MEAT){
           return "EXTRA MEAT";
       } else {
           return "EXTRA CHEESE";
       }
    }
}
