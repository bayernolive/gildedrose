package com.gildedrose.factory;

import com.gildedrose.item.ConjuredItem;
import com.gildedrose.item.ItemName;
import com.gildedrose.item.ItemQuality;
import com.gildedrose.item.ItemSellIn;
import com.gildedrose.item.Item;

public class ConjuredFacotory implements Factory {

    @Override
    public Item createItem(ItemName name, ItemSellIn sellIn, ItemQuality quality) {
        return new ConjuredItem(name, sellIn, quality);
    }
}
