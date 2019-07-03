package com.stackroute.practassign2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EvenNumTestTest {
    EvenNumTest evennum;
    @Before
    public void setUp()
    {
        evennum=new EvenNumTest();
    }
    @Test
    public void checkWhetherMethodReturnsFalseForOddNumbers(){
        Boolean b=evennum.checkIfInputIsEvenOrNot(7);
        assertEquals(false,b);
    }
    @Test
    public void checkWhetherMethodReturnsTrueForEvenNumbers(){
        Boolean b=evennum.checkIfInputIsEvenOrNot(10);
        assertEquals(true,b);
    }
    @Test
    public void checkWhetherTheIntegerIsEvenAndReturnsTrueOrNot(){
        Boolean b=evennum.checkIfInputIsEvenOrNot(0);
        assertEquals(true,b);
    }
    @Test
    public void checkWhetherTheIntegerIsEvenAndReturnsTrueOrNotIfNegativeIntegerIsGiven(){
        Boolean b=evennum.checkIfInputIsEvenOrNot(-2);
        assertEquals(true,b);
    }
    @After
    public void tearDown(){
        evennum=null;
    }

}