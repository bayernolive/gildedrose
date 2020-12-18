package com.gildedrose.item;

public class Sulfuras extends Item {

    public Sulfuras(final ItemName name, final ItemSellIn sellIn, final ItemQuality quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void updateByDay() {
        //sulfuras is no need to update
    }
}
