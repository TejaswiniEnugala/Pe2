package com.stackroute.practassign2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PowerOfFourOrNotTest {
    PowerOfFourOrNot obj;
    String expectedResult;
    String actualResult;
    @Before
    public void setUp(){
        obj=new PowerOfFourOrNot();
    }
    @Test
public void checkWhetherNumberIsPowerOfFour(){
        actualResult=obj.isPowerOfFour(64);
        expectedResult="it is power of 4";
        assertEquals(expectedResult,actualResult);
    }
    @Test
    public void checkWhetherNumberIsNotPowerofFour(){
        actualResult=obj.isPowerOfFour(6);
        expectedResult="it is not a power of 4";
        assertEquals(expectedResult,actualResult);
    }
@After
    public void tearDown()
{
    obj=null;
}

}