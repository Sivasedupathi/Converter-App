package com.example.restservice.EntityTest;

import com.example.restservice.entity.ArabicNumeral;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArabicNumeralTest {


    ArabicNumeral numerals = new ArabicNumeral();

    @Test
    public void returnOneTest() {
        assertEquals("1", numerals.numeralToDigit("I"));
    }

    @Test
    public void returnTwoTest() {
        assertEquals("2", numerals.numeralToDigit("II"));
    }

    @Test
    public void returnThreeTest() {
        assertEquals("3", numerals.numeralToDigit("III"));
    }

    @Test
    public void returnFourTest() {
        assertEquals("4", numerals.numeralToDigit("IV"));
    }

    @Test
    public void returnFiveTest() {

        assertEquals("5", numerals.numeralToDigit("V"));
    }

    @Test
    public void returnSixTest() {
        assertEquals("6", numerals.numeralToDigit("VI"));
    }

    @Test
    public void returnNineTest() {
        assertEquals("9", numerals.numeralToDigit("IX"));
    }

    @Test
    public void returnNumeralsTest() {
        assertEquals("90", numerals.numeralToDigit("XC"));
        assertEquals("900", numerals.numeralToDigit("CM"));
        assertEquals("1903", numerals.numeralToDigit("MCMIII"));
        assertEquals("1997", numerals.numeralToDigit("MCMXCVII"));
        assertEquals("4000", numerals.numeralToDigit("MMMM"));
    }
}
