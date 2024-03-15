package com.amigoscode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    @Test
    void canTwoNumbers(){
        //Class we are testing, Calculator
        Calculator underTest= new Calculator();
        int number1=10;
        int number2=20;
        int result=underTest.add(number1,number2);
        //lesson278
        assertEquals(30,result);

    }


}
