package com.sparta.jh;

public class Raindrops
{ // realised the code was unecessarily long before, refactoring to make it cleaner
    public static String plingPlangPlong(int number) {
        StringBuilder stringResponse = new StringBuilder();
        if (number <= 0) return "" + number;
        if (number % 3 == 0) {
            stringResponse.append("Pling");
        }
        if (number % 5 == 0) {
            stringResponse.append("Plang");
        }
        if (number % 7 == 0) {
            stringResponse.append("Plong");
        }
        if (stringResponse.toString().equals("")) return "" + number;
        return stringResponse.toString();
    }
}
