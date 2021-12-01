package com.example.restservice.service;

public class RomanNumerals {

    public String digitToNumeral(int digit){

        StringBuilder response = new StringBuilder();

        for (int i = 0; i < digit; i++) {
            response.append("I");
        }
        return response.toString();

    }


}
