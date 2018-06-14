package edu.alsie.tdd.int2lcd;

import java.util.ArrayList;
import java.util.List;

public class Int2lcd {

    public boolean isDigitOne(int digit) { return digit == 1; }

    public boolean isDigitTwo(int digit) { return digit == 2; }

    public boolean isDigitThree(int digit) { return digit == 3; }

    public boolean isDigitFour(int digit) { return digit == 4; }

    public boolean isDigitFive(int digit) { return digit == 5; }

    public boolean isDigitSix(int digit) { return digit == 6; }

    public boolean isDigitSeven(int digit) { return digit == 7; }

    public boolean isDigitEight(int digit) { return digit == 8; }

    public boolean isDigitNine(int digit) { return digit == 9; }

    public List<String> convertDigit2Lcd(int digit) {
        List<String> list = new ArrayList<>();
        if (isDigitOne(digit)) {
            list.add(" ");
            list.add("|");
            list.add("|");
            return list;
        }

        if (isDigitTwo(digit)) {
            list.add("_ ");
            list.add("_|");
            list.add("|_");
            return list;
        }

        if (isDigitThree(digit)) {
            list.add("_ ");
            list.add("_|");
            list.add("_|");
            return list;
        }

        if (isDigitFour(digit)) {
            list.add("   ");
            list.add("|_|");
            list.add("  |");
            return list;
        }

        list.add("");
        list.add("");
        list.add("");
        return list;
    }
}
