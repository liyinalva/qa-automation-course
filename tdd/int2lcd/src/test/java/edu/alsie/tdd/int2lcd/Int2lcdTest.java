package edu.alsie.tdd.int2lcd;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

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

    @Test
    public void testIfAnumberIsDigitSix() {
        Int2lcd int2lcd = new Int2lcd();
        Assert.assertTrue(int2lcd.isDigitSix(6));
    }

    @Test
    public void testIfAnumberIsDigitSeven() {
        Int2lcd int2lcd = new Int2lcd();
        Assert.assertTrue(int2lcd.isDigitSeven(7));
    }

    @Test
    public void testIfAnumberIsDigitEight() {
        Int2lcd int2lcd = new Int2lcd();
        Assert.assertTrue(int2lcd.isDigitEight(8));
    }

    @Test
    public void testIfAnumberIsDigitNine() {
        Int2lcd int2lcd = new Int2lcd();
        Assert.assertTrue(int2lcd.isDigitNine(9));
    }

    @Test
    public void testConvertDigitOne2Lcd(){
        Int2lcd int2lcd = new Int2lcd();
        List<String> expected = new ArrayList<>();
        expected.add(" ");
        expected.add("|");
        expected.add("|");
        List<String> actual = int2lcd.convertDigit2Lcd(1);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testConvertDigitTwo2Lcd(){
        Int2lcd int2lcd = new Int2lcd();
        List<String> expected = new ArrayList<>();
        expected.add(" _ ");
        expected.add(" _|");
        expected.add("|_ ");
        List<String> actual = int2lcd.convertDigit2Lcd(2);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testConvertDigitThree2Lcd(){
        Int2lcd int2lcd = new Int2lcd();
        List<String> expected = new ArrayList<>();
        expected.add("_ ");
        expected.add("_|");
        expected.add("_|");
        List<String> actual = int2lcd.convertDigit2Lcd(3);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testConvertDigitFor2Lcd(){
        Int2lcd int2lcd = new Int2lcd();
        List<String> expected = new ArrayList<>();
        expected.add("   ");
        expected.add("|_|");
        expected.add("  |");
        List<String> actual = int2lcd.convertDigit2Lcd(4);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testConvertDigitFive2Lcd(){
        Int2lcd int2lcd = new Int2lcd();
        List<String> expected = new ArrayList<>();
        expected.add(" _ ");
        expected.add("|_ ");
        expected.add(" _|");
        List<String> actual = int2lcd.convertDigit2Lcd(5);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testConvertDigitSix2Lcd(){
        Int2lcd int2lcd = new Int2lcd();
        List<String> expected = new ArrayList<>();
        expected.add(" _ ");
        expected.add("|_ ");
        expected.add("|_|");
        List<String> actual = int2lcd.convertDigit2Lcd(6);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testConvertDigitSeven2Lcd(){
        Int2lcd int2lcd = new Int2lcd();
        List<String> expected = new ArrayList<>();
        expected.add("_ ");
        expected.add(" |");
        expected.add(" |");
        List<String> actual = int2lcd.convertDigit2Lcd(7);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testConvertDigitEight2Lcd(){
        Int2lcd int2lcd = new Int2lcd();
        List<String> expected = new ArrayList<>();
        expected.add(" _ ");
        expected.add("|_|");
        expected.add("|_|");
        List<String> actual = int2lcd.convertDigit2Lcd(8);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testConvertDigitNine2Lcd(){
        Int2lcd int2lcd = new Int2lcd();
        List<String> expected = new ArrayList<>();
        expected.add(" _ ");
        expected.add("|_|");
        expected.add("  |");
        List<String> actual = int2lcd.convertDigit2Lcd(9);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testConvertNumber2Lcd(){
        Int2lcd int2lcd = new Int2lcd();
        List<String> expected = new ArrayList<>();
        expected.add("  _ _     _  _ _  _  _ ");
        expected.add("| _|_||_||_ |_  ||_||_|");
        expected.add("||_ _|  | _||_| ||_|  |");
        List<String> actual = int2lcd.convertNumber2Lcd(123456789);
        Assert.assertEquals(expected, actual);
    }

}