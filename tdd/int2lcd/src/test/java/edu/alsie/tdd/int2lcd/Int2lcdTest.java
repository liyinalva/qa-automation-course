package edu.alsie.tdd.int2lcd;

import org.junit.Assert;
import org.junit.Test;

public class Int2lcdTest {

    @Test
    public void testIfAnumberIsDigitOne() {
        Int2lcd int2lcd = new Int2lcd();
        Assert.assertTrue(int2lcd.isDigitOne(1));
    }

    @Test
    public void testIfAnumberIsDigitTwo() {
        Int2lcd int2lcd = new Int2lcd();
        Assert.assertTrue(int2lcd.isDigitTwo(2));
    }

}