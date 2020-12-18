package com.gildedrose.item;

public class ItemName {
    public static final String AGED_BRIE = "Aged Brie";
    public static final String BACKSTAGE_PASSES = "Backstage passes to a TAFKAL80ETC concert";
    public static final String SULFURAS = "Sulfuras, Hand of Ragnaros";
    public static final String CONJURED = "Conjured Mana Cake";

    private final String name;

    public ItemName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}