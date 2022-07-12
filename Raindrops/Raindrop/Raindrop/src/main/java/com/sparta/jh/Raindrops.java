package com.sparta.jh;

public class Raindrops
{ // realised the code was unecessarily long before as when looking to see if it was completed I did not need the extra steps for appending the longer messages
    // refactoring to make it cleaner
     public static String plingPlangPlong(int number) {
        StringBuilder stringResponse = new StringBuilder();
        if (number > 0) {

            if (number % 3 == 0) {
                stringResponse.append("Pling");
            }
            if (number % 5 == 0) {
                stringResponse.append("Plang");
            }
            if (number % 7 == 0) {
                stringResponse.append("Plong");
            }
            if (number % 3 != 0 && number % 5 != 0 && number % 7 != 0) {
                stringResponse.append(String.valueOf(number));
            }
            return stringResponse.toString();
        } else return "This is not a valid number - please enter a number greater than 0!";
    }
}
