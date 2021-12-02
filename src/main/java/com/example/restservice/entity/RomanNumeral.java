package com.example.restservice.entity;

import org.springframework.stereotype.Component;

import java.util.NavigableMap;
import java.util.TreeMap;

@Component
public class RomanNumeral {

    private static NavigableMap<Integer, String> lookUpMapping = new TreeMap<Integer, String>();
    
    //add a value to the map to use as an look up
    static {
        lookUpMapping.put(1, "I");
        lookUpMapping.put(4, "IV");
        lookUpMapping.put(5, "V");
        lookUpMapping.put(9, "IX");
        lookUpMapping.put(10, "X");
        lookUpMapping.put(40, "XL");
        lookUpMapping.put(50, "L");
        lookUpMapping.put(90, "XC");
        lookUpMapping.put(100, "C");
        lookUpMapping.put(400, "CD");
        lookUpMapping.put(500, "D");
        lookUpMapping.put(900, "CM");
        lookUpMapping.put(1000, "M");
    }
    
    //Given a digit it converts it into numerals
    public String digitToNumeral(int digit){

        StringBuilder sb = new StringBuilder();

        while (digit > 0) {

            // mark the input number to the highest key that is < number
            int greaterValue  = lookUpMapping.floorKey(digit);
            String numeral = lookUpMapping.get(greaterValue);

            sb.append(numeral);

            // subtract the highest value and continue
            digit -= greaterValue;
        }

        return sb.toString();

    }

}
