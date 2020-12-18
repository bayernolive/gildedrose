package com.gildedrose.item;

public class ItemQuality {
    private static final int MAX_VALUE = 50;
    private static final int MIN_VALUE = 0;

    private final int value;

    public ItemQuality(int value) {
        this.value = value;
    }

    ItemQuality increase() {
        if (value == MAX_VALUE) {
            return this;
        }
        return new ItemQuality(value + 1);
    }

    ItemQuality decrease() {
        if (value == MIN_VALUE) {
            return this;
        }
        return new ItemQuality(value - 1);
    }

    ItemQuality reset() {
        return new ItemQuality(MIN_VALUE);
    }

    public int getValue() {
        return value;
    }
}