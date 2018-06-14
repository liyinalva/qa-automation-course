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
            list.add(" _ ");
            list.add(" _|");
            list.add("|_ ");
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

        if (isDigitFive(digit)) {
            list.add(" _ ");
            list.add("|_ ");
            list.add(" _|");
            return list;
        }

        if (isDigitSix(digit)) {
            list.add(" _ ");
            list.add("|_ ");
            list.add("|_|");
            return list;
        }

        if (isDigitSeven(digit)) {
            list.add("_ ");
            list.add(" |");
            list.add(" |");
            return list;
        }

        if (isDigitEight(digit)) {
            list.add(" _ ");
            list.add("|_|");
            list.add("|_|");
            return list;
        }

        if (isDigitNine(digit)) {
            list.add(" _ ");
            list.add("|_|");
            list.add("  |");
            return list;
        }


        list.add("");
        list.add("");
        list.add("");
        return list;
    }

    public List<String> convertNumber2Lcd(int number) {
        List<String> list = new ArrayList<>();
        list.add("");
        list.add("");
        list.add("");
        int digit;
        String headDigits;
        String middleDigits;
        String footerDigits;
        while (number > 0) {
            digit = number % 10;
            number = number / 10;
            List<String> digit2Lcd =this.convertDigit2Lcd(digit);
            headDigits = digit2Lcd.get(0) + list.get(0);
            middleDigits = digit2Lcd.get(1) + list.get(1);
            footerDigits = digit2Lcd.get(2) + list.get(2);
            list.set(0, headDigits);
            list.set(1, middleDigits);
            list.set(2, footerDigits);
        }

        return list;
    }
}
