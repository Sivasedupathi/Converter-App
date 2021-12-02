package com.example.restservice.entity;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class ArabicNumeral {

    private static final Map<Character,
                Integer> roman = new HashMap<Character,
                        Integer>()
    //Vlookup to convert numerals to digit
    {{
        put('I', 1);
        put('V', 5);
        put('X', 10);
        put('L', 50);
        put('C', 100);
        put('D', 500);
        put('M', 1000);
    }};

    // This function returns digit
    public String numeralToDigit(String s) {
        int sum = 0;
        int n = s.length();

        for (int i = 0; i < n; i++) {

            // If present value is less than next value,
            // subtract present from next value and add the
            // resultant to the sum variable.
            if (i != n - 1 && roman.get(s.charAt(i)) <
                    roman.get(s.charAt(i + 1))) {
                sum += roman.get(s.charAt(i + 1)) -
                        roman.get(s.charAt(i));
                i++;
            } else {
                sum += roman.get(s.charAt(i));
            }
        }
        return String.valueOf(sum);
    }
}
