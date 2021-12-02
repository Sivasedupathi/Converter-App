package com.example.restservice.EntityTest;

import com.example.restservice.entity.RomanNumeral;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class RomanNumeralTests {

    RomanNumeral numerals = new RomanNumeral();

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
        assertEquals("VI", numerals.digitToNumeral(6));
    }

    @Test
    public void returnNineTest() {
        assertEquals("IX", numerals.digitToNumeral(9));
    }

    @Test
    public void returnNumeralsTest() {
        assertEquals("XC", numerals.digitToNumeral(90));
        assertEquals("CM", numerals.digitToNumeral(900));
        assertEquals("MCMIII", numerals.digitToNumeral(1903));
        assertEquals("MCMXCVII", numerals.digitToNumeral(1997));
        assertEquals("MMMM", numerals.digitToNumeral(4000));
    }

}