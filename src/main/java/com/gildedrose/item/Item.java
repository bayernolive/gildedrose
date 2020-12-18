package com.gildedrose.item;

public abstract class Item {
    private ItemName itemName;
    private ItemSellIn itemSellIn;
    private ItemQuality itemQuality;

    public ItemName getItemName() {
        return itemName;
    }

    Item(final ItemName name, final ItemSellIn sellIn, final ItemQuality quality) {
        this.itemName = name;
        this.itemSellIn = sellIn;
        this.itemQuality = quality;
    }

    @Override
    public String toString() {
        return itemName.getName() + ", " + itemSellIn.getValue() + ", " + itemQuality.getValue();
    }

    public abstract void updateByDay();

    protected void decreaseSellIn() {
        itemSellIn = itemSellIn.decrease();
    }

    protected void increaseQuality() {
        itemQuality = itemQuality.increase();
    }

    protected void decreaseQuality() {
        itemQuality = itemQuality.decrease();
    }

    protected void resetQuality() {
        itemQuality = itemQuality.reset();
    }

    protected boolean isLessThan(int value) {
        return itemSellIn.isLessThan(value);
    }
}