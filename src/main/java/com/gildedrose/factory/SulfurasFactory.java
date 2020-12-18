package com.gildedrose.factory;

import com.gildedrose.item.Sulfuras;
import com.gildedrose.item.ItemName;
import com.gildedrose.item.ItemQuality;
import com.gildedrose.item.ItemSellIn;
import com.gildedrose.item.Item;

public class SulfurasFactory implements Factory {

    @Override
    public Item createItem(ItemName name, ItemSellIn sellIn, ItemQuality quality) {
        return new Sulfuras(name, new ItemSellIn(0), new ItemQuality(80));
    }
}
