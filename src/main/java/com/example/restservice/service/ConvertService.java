package com.example.restservice.service;

import com.example.restservice.entity.ArabicNumeral;
import com.example.restservice.entity.RomanNumeral;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConvertService {

    @Autowired
    private RomanNumeral romanNumeral = new RomanNumeral();

    @Autowired
    private ArabicNumeral arabicNumeral = new ArabicNumeral();

    //Given the value the call service will route the request to the right converter logic
    // digit to numeral --Roman numeral
    // numeral to digit -- Arabic numeral
    public String callService(String value){

        String response;

        if (isRomanNumeral(value)) {

            char sign = value.charAt(0);

            if (sign == '-') {
                return "Please Match the Requested Format";
            }

            response = arabicNumeral.numeralToDigit(value);

            if (Integer.parseInt(response) < 1 || Integer.parseInt(response) > 4000) {
                response = "Requested value is not between I and MMMM";
            }
        } else {
            response = romanNumeral.digitToNumeral(Integer.parseInt(value));

            if (Integer.parseInt(value) < 1 || Integer.parseInt(value) > 4000) {
                response = "Requested value is not between 1 and 4000";
            }
        }

        return response;
    }

    //To validate whether the given value is roman numeral or not
    public Boolean isRomanNumeral(String value){

        try {
            Integer d = Integer.parseInt(value);
            return false;
        } catch (NumberFormatException e) {
            return true;
        }
    }


}
