package com.stackroute.practassign2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseOfAnInputTest {
    ReverseOfAnInput stringreverse;
    @Before
    public void setUp(){
        stringreverse=new ReverseOfAnInput();
    }
    @Test
    public void checkReverseOfAString()
    {
        String result=stringreverse.ReverseOfString("teju");
        assertEquals("ujet",result);
    }
    @Test
    public void checkReverseOfAGivenString()
    {
        String result=stringreverse.ReverseOfString("suma");
        assertEquals("amus",result);
    }
    @Test
    public void checkReverseOfAnInputIfNumberIsGiven()
    {
        String result=stringreverse.ReverseOfString("45689");
        assertEquals("98654",result);
    }
    @After
    public void tearDown(){
        stringreverse=null;
    }


}