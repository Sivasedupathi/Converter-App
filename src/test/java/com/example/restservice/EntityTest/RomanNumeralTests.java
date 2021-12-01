package com.example.restservice.ServiceTests;

import com.example.restservice.service.RomanNumerals;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class RomanNumeralsServiceTests {

    RomanNumerals numerals = new RomanNumerals();

    @Test
    public void returnOneTest() {
        assertEquals("I", numerals.digitToNumeral(1));
    }

    @Test
    public void returnTwoTest() {
        assertEquals("II", numerals.digitToNumeral(2));
    }

    @Test
    public void returnThreeTest() {
        assertEquals("III", numerals.digitToNumeral(3));
    }

    @Test
    public void returnFourTest() {
        assertEquals("IV", numerals.digitToNumeral(4));
    }

    @Test
    public void returnFiveTest() {

        assertEquals("V", numerals.digitToNumeral(5));
    }

    @Test
    public void returnSixTest() {
        assertEquals("VII", numerals.digitToNumeral(6));
    }


}