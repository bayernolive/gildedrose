package com.gildedrose.item;

public class ItemSellIn {
    private static final int MIN_VALUE = 0;
    private final int value;

    public ItemSellIn(int value) {
        this.value = value;
    }

    ItemSellIn decrease() {
        return new ItemSellIn(value - 1);
    }

    public boolean isLessThan(int value) {
        return this.value < value;
    }

    public int getValue() {
        if (value < MIN_VALUE) {
            return MIN_VALUE;
        }
        return value;
    }
}