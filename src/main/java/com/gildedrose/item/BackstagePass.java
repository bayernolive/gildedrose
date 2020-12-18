package com.gildedrose.item;

public class BackstagePass extends Item {

    private static final int DOUBLE_QUALITY_INCREASE_THRESHOLD = 11;
    private static final int TRIPLE_QUALITY_INCREASE_THRESHOLD = 6;
    private static final int QUALITY_RESET_SELL_IN_THRESHOLD = 0;

    public BackstagePass(final ItemName name, final ItemSellIn sellIn, final ItemQuality quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void updateByDay() {
        increaseQuality();
        dealWithThreshold(DOUBLE_QUALITY_INCREASE_THRESHOLD);
        dealWithThreshold(TRIPLE_QUALITY_INCREASE_THRESHOLD);
        decreaseSellIn();
        dealWithSellInExpire();
    }

    private void dealWithSellInExpire() {
        if (isLessThan(QUALITY_RESET_SELL_IN_THRESHOLD)) {
            resetQuality();
        }
    }

    private void dealWithThreshold(int threshold) {
        if (isLessThan(threshold)) {
            increaseQuality();
        }
    }
}