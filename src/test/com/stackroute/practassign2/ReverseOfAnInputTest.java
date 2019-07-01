package com.stackroute.practassign2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseOfAnInputTest {
    ReverseOfAnInput rev;
    @Before
    public void setUp(){
        rev=new ReverseOfAnInput();
    }
    @Test
    public void checkReverseOfAString()
    {
        String result=rev.RevString("teju");
        assertEquals("ujet",result);
    }
    @Test
    public void checkReverseOfANumberReturnsString()
    {
        String result=rev.RevString("45689");
        assertEquals("98654",result);
    }
    @After
    public void tearDown(){
        rev=null;
    }


}