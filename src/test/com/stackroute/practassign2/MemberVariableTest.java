package com.stackroute.practassign2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MemberVariableTest {
    MemberVariable membervariable;
    @Before
    public void setUp(){
        membervariable=new MemberVariable();
    }
    @Test
    public void givenThreeArgumentsReturnsMembersDetails(){
        String result=membervariable.printValues("Raju",21,2000.2f);
        assertEquals("Member's Name:Raju\n"+"Member's Age:21\n"+"Member's Salary:2000.2",result);
    }
    @Test
    public void GivenThreeArgumentsWhichReturnsDetailsOfMemberVariables(){
        String result=membervariable.printValues("Teju",21,3000.0f);
        assertEquals("Member's Name:Teju\n"+"Member's Age:21\n"+"Member's Salary:3000.0",result);
    }
    @After
    public void tearDown(){
        membervariable=null;
    }

}