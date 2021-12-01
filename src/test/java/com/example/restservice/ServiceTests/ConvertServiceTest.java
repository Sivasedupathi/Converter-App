package com.example.restservice.ServiceTests;

import com.example.restservice.service.ConversionService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ConversionServiceTest {


    ConversionService conversionService = new ConversionService();

    @Test
    public void validateInput(){
        String digit = "MMM";
        boolean flag = conversionService.isRomanNumeral(digit);
        assertTrue(flag);

    }

    @Test
    public void validateRangeOfTheInput(){
        String input1= "0";
        String input2="-9";
        String input3="4001";
        String input4="1";
        String input5="300";


//        assertEquals("",conversionService.callService(input1));
//        assertEquals("",conversionService.callService(input2));
//        assertEquals("",conversionService.callService(input3));
        assertEquals("I",conversionService.callService(input4));
        assertEquals("CCC",conversionService.callService(input5));


    }


}
