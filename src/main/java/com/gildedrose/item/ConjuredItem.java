package com.gildedrose.item;

public class ConjuredItem extends Item {

    private static final int QUALITY_RESET_SELL_IN_THRESHOLD = 0;

    public ConjuredItem(final ItemName name, final ItemSellIn sellIn, final ItemQuality quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void updateByDay() {
        decreaseSellIn();
        decreaseQuality();
        decreaseQuality();
        dealWithSellInExpire();
    }

    private void dealWithSellInExpire() {
        if (isLessThan(QUALITY_RESET_SELL_IN_THRESHOLD)) {
            decreaseQuality();
            decreaseQuality();
        }
    }
}
