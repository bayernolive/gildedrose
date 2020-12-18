package com.gildedrose.factory;

import com.gildedrose.item.NormalItem;
import com.gildedrose.item.ItemName;
import com.gildedrose.item.ItemQuality;
import com.gildedrose.item.ItemSellIn;
import com.gildedrose.item.Item;

public class NormalFacotory implements Factory {

    @Override
    public Item createItem(ItemName name, ItemSellIn sellIn, ItemQuality quality) {
        return new NormalItem(name, sellIn, quality);
    }
}
