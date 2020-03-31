package com.aor.refactoring.example3;

public class Fixed implements Discount {
    private final int fixed;

    @Override
    public double applyDiscount(double price) {
        return fixed > price ? 0 : price - fixed;
    }

    public Fixed(int fixed) {
        this.fixed = fixed;
    }
}
