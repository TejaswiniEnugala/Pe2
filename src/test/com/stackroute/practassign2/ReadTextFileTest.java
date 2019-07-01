package com.stackroute.practassign2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

import static org.junit.Assert.*;

public class ReadTextFileTest {
    ReadTextFile file;
    PrintWriter actualResult;
    String expectedResult;
    @Before
    public void setup(){
        file=new ReadTextFile();
    }
    @Test
    public void readFileAndConveretToUpperCase() throws IOException {
      String str=file.readFile(new File("f.txt"));
        assertEquals(" HELLOWELCOME",str);
    }
    @After
    public void tearDown(){
        file=null;

    }

}