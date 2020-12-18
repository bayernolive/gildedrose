package com.gildedrose.factory;

import com.gildedrose.item.Item;
import com.gildedrose.item.ItemName;
import com.gildedrose.item.ItemQuality;
import com.gildedrose.item.ItemSellIn;

import java.util.HashMap;
import java.util.Map;

public class ItemFactory {

    private ItemFactory() {
    }

    private static Map<String, Factory> factoryMap = new HashMap<>();

    static {
        factoryMap.put(ItemName.AGED_BRIE, new AgedBrieFactory());
        factoryMap.put(ItemName.BACKSTAGE_PASSES, new BackstageFactory());
        factoryMap.put(ItemName.SULFURAS, new SulfurasFactory());
        factoryMap.put(ItemName.CONJURED, new ConjuredFacotory());
    }

    public static Item createItemByName(String name, int sellIn, int quality) {
        ItemName itemName = new ItemName(name);
        ItemSellIn itemSellIn = new ItemSellIn(sellIn);
        ItemQuality itemQuality = new ItemQuality(quality);
        Factory factory = buildFactory(name);
        return factory.createItem(itemName, itemSellIn, itemQuality);
    }

    private static Factory buildFactory(String name) {
        Factory factory = factoryMap.get(name);
        if (factory == null) {
            factory = new NormalFacotory();
        }
        return factory;
    }
}