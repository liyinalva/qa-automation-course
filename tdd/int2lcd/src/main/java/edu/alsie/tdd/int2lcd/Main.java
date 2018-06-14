package edu.alsie.tdd.int2lcd;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Int2lcd int2lcd = new Int2lcd();
        List<String> number2Lcd = int2lcd.convertNumber2Lcd(123456789);
        System.out.println(number2Lcd.get(0));
        System.out.println(number2Lcd.get(1));
        System.out.println(number2Lcd.get(2));
    }


}
