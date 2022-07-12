package com.sparta.jh;

public class Raindrops
{ // realised the code was unecessarily long before, refactoring to make it cleaner
    public static String plingPlangPlong(int number) {
        StringBuilder response = new StringBuilder();
        if (number <= 0) return "" + number;
        if (number % 3 == 0) {
            response.append("Pling");
        }
        if (number % 5 == 0) {
            response.append("Plang");
        }
        if (number % 7 == 0) {
            response.append("Plong");
        }
        if (response.toString().equals("")) return "" + number;
        return response.toString();
    }
}
