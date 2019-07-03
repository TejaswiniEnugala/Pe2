package com.stackroute.practassign2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialTest {
    Factorial factorial;
    @Before
    public void setUp()
    {
        factorial=new Factorial();
    }
    @Test
    public void returnFactorialOfNumber(){
        String result=factorial.factorialOfNumber(4);
        String expectedResult="the factorial of1is1\n"+"the factorial of2is2\n"+"the factorial of3is6\n"+"the factorial of4is24\n";
        assertEquals(expectedResult,result);
    }
    @Test
    public void returnFactorialOfGivenInput(){
        String result=factorial.factorialOfNumber(3);
        String expectedResult="the factorial of1is1\n"+"the factorial of2is2\n"+"the factorial of3is6\n";
        assertEquals(expectedResult,result);
    }
    @Test
    public void returnFactorialIfInputIsZero(){
        String result=factorial.factorialOfNumber(0);
        String expectedResult="1";
        assertEquals(expectedResult,result);
    }
    @Test
    public void returnFactorialIfInputIsNegativeNumber(){
        String result=factorial.factorialOfNumber(-2);
        String expectedResult="give positive number";
        assertEquals(expectedResult,result);
    }


    @After
    public void tearDown(){
        factorial=null;
    }

}