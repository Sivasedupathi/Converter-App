package com.example.restservice.service;

import com.example.restservice.entity.ArabicNumeral;
import com.example.restservice.entity.RomanNumeral;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class ConversionService {

    @Autowired
    private RomanNumeral romanNumeral = new RomanNumeral();

    @Autowired
    private ArabicNumeral arabicNumeral = new ArabicNumeral();

    public String callService(String value){

        String response;

        if (isRomanNumeral(value)) {
            response = arabicNumeral.numeralToDigit(value);

            if (Integer.parseInt(response) < 1 || Integer.parseInt(response) > 4000) {
                throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Requested roman numeral is not between 1 and 4000");
            }
        } else {
            response = romanNumeral.digitToNumeral(Integer.parseInt(value));

            if (Integer.parseInt(value) < 1 || Integer.parseInt(value) > 4000) {
                throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Requested roman numeral is not between 1 and 4000");
            }
        }


        return response;

    }

    public Boolean isRomanNumeral(String value){

        try {
            Integer d = Integer.parseInt(value);
            return false;
        } catch (NumberFormatException e) {
            return true;
        }
    }


}
