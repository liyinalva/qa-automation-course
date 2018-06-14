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

    @Test
    public void testIfAnumberIsDigitThree() {
        Int2lcd int2lcd = new Int2lcd();
        Assert.assertTrue(int2lcd.isDigitThree(3));
    }

    @Test
    public void testIfAnumberIsDigitFour() {
        Int2lcd int2lcd = new Int2lcd();
        Assert.assertTrue(int2lcd.isDigitFour(4));
    }

    @Test
    public void testIfAnumberIsDigitFive() {
        Int2lcd int2lcd = new Int2lcd();
        Assert.assertTrue(int2lcd.isDigitFive(5));
    }


}