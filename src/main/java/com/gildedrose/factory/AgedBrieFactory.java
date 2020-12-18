package com.gildedrose.factory;

import com.gildedrose.item.AgedBrie;
import com.gildedrose.item.ItemName;
import com.gildedrose.item.ItemQuality;
import com.gildedrose.item.ItemSellIn;
import com.gildedrose.item.Item;


public class AgedBrieFactory implements Factory {

    @Override
    public Item createItem(ItemName name, ItemSellIn sellIn, ItemQuality quality) {
        return new AgedBrie(name, new ItemSellIn(0), quality);
    }
}
