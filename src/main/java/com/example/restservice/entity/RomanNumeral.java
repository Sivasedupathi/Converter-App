package com.example.restservice.entity;

public class RomanNumeral {

    public String digitToNumeral(int digit){

        StringBuilder result = new StringBuilder();
        int remainder = digit;

        if (remainder >= 5) {
            result.append("V");
            remainder -= 5;
        }
        if (remainder == 4) {
            result.append("IV");
            remainder -= 4;
        }
        for (int i = 0; i < remainder; i++) {
            result.append("I");
        }
        return result.toString();

    }


}
