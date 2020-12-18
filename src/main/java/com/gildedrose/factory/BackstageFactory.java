package com.gildedrose.factory;

import com.gildedrose.item.BackstagePass;
import com.gildedrose.item.ItemName;
import com.gildedrose.item.ItemQuality;
import com.gildedrose.item.ItemSellIn;
import com.gildedrose.item.Item;

public class BackstageFactory implements Factory {

    @Override
    public Item createItem(ItemName name, ItemSellIn sellIn, ItemQuality quality) {
        return new BackstagePass(name, sellIn, quality);
    }
}
