package com.epam.langSyntax;

public class NumberReverter {

    public void revert(int number) {
        int result = number % 10 * 100;
        result += number / 10 % 10 * 10;
        result += number / 100;
        System.out.println(result);
    }


}
