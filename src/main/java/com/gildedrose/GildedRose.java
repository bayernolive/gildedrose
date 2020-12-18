package com.gildedrose;

import com.gildedrose.factory.ItemFactory;
import com.gildedrose.item.Item;

class GildedRose {
    private Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public static Item createItem(String name, int sellIn, int quality) {
        return ItemFactory.createItemByName(name, sellIn, quality);
    }

    public void update_quality() {
        for (Item item : items) {
            item.updateByDay();
        }
    }

    public Item[] getItems() {
        return items;
    }
}