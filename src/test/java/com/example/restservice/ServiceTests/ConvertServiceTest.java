package com.example.restservice.ServiceTests;

import com.example.restservice.service.ConvertService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ConvertServiceTest {


    ConvertService conversionService = new ConvertService();

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


        assertEquals("Requested value is not between 1 and 4000",conversionService.callService(input1));
        assertEquals("Requested value is not between 1 and 4000",conversionService.callService(input2));
        assertEquals("Requested value is not between 1 and 4000",conversionService.callService(input3));
        assertEquals("I",conversionService.callService(input4));
        assertEquals("CCC",conversionService.callService(input5));
    }


    @Test
    public void validateRangeOfTheRomanNumeralInput(){
        String input1= "I";
        String input2="IV";
        String input3="IX";
        String input4="XC";
        String input5="CM";
        String input6="MCMIII";
        String input7="MCMXCVII";
        String input8="MMMM";
        String input9="-I";
        String input10="0";


        assertEquals("1",conversionService.callService(input1));
        assertEquals("4",conversionService.callService(input2));
        assertEquals("9",conversionService.callService(input3));
        assertEquals("90",conversionService.callService(input4));
        assertEquals("900",conversionService.callService(input5));
        assertEquals("1903",conversionService.callService(input6));
        assertEquals("1997",conversionService.callService(input7));
        assertEquals("4000",conversionService.callService(input8));
        assertEquals("Please Match the Requested Format",conversionService.callService(input9));
        assertEquals("Requested value is not between 1 and 4000",conversionService.callService(input10));

    }

}
