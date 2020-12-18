package com.gildedrose.item;

public class AgedBrie extends Item {

    public AgedBrie(final ItemName name, final ItemSellIn sellIn, final ItemQuality quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void updateByDay() {
        increaseQuality();
    }
}