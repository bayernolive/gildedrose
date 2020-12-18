package com.gildedrose.item;

public class NormalItem extends Item {

    private static final int QUALITY_RESET_SELL_IN_THRESHOLD = 0;

    public NormalItem(final ItemName name, final ItemSellIn sellIn, final ItemQuality quality) {
        super(name, sellIn, quality);
    }

    public void updateByDay() {
        decreaseQuality();
        decreaseSellIn();
        if (isLessThan(QUALITY_RESET_SELL_IN_THRESHOLD)) {
            decreaseQuality();
        }
    }
}
