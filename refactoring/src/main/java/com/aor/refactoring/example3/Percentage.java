package com.aor.refactoring.example3;

public class Percentage implements Discount {
    private final double percentage;

    public Percentage(double percentage) {
        this.percentage = percentage;
    }

    @Override
    public double applyDiscount(double price) {
        return price - price * percentage;
    }
}
