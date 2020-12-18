package com.gildedrose;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

import com.gildedrose.item.Item;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class GildedRoseTest {

    @Test
    public void foo() {
        Item[] items = new Item[] { GildedRose.createItem("foo", 1, 5) };
        GildedRose app = new GildedRose(items);
        app.update_quality();
        assertEquals("foo", app.getItems()[0].getItemName().getName());
    }

    @Test
    public void safeNetTest()throws IOException, URISyntaxException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        AppRunner.main(new String[0]);
        URI uri = getClass().getResource("/baseline.txt").toURI();
        String excepted = new String(Files.readAllBytes(Paths.get(uri)));
        assertEquals(excepted, out.toString());
    }
}
