package org.yearup.sandwichshop;

import java.util.ArrayList;

import java.util.List;

public class Order {
    private List<OrderItems> items;

    public Order() {
        items = new ArrayList<>();
    }

    public List<OrderItems> getItems() {
        return items;
    }

    public void addOrder(OrderItems item) {
        this.items.add(item);
    }

    public void removeOrder(OrderItems item) {
        this.items.remove(item);
    }

    public double getTotalPrice() {
        double totalPrice = 0.0;
        for(OrderItems item : items) {
            totalPrice += item.getPrice();
        }
        return totalPrice;
    }

    public String getReceipt() {
        StringBuilder receipt = new StringBuilder();
        for(OrderItems item :items){
            receipt.append(item.getDetails()).append("\n");
        }

        return receipt.toString();
    }

    public void clear() {
        this.items.clear();
    }
}

