package com.gildedrose.factory;

import com.gildedrose.item.Item;
import com.gildedrose.item.ItemName;
import com.gildedrose.item.ItemQuality;
import com.gildedrose.item.ItemSellIn;

public interface Factory {

    Item createItem(ItemName name, ItemSellIn sellIn, ItemQuality quality);
}
