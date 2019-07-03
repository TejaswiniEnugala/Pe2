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
    @Before
    public void setup(){
        file=new ReadTextFile();
    }
    @Test
    public void readFileAndConveretToUpperCase() throws IOException {
      String result=file.readFile(new File("f.txt"));
        assertEquals(" HELLOWELCOME",result);
    }
    @Test
    public void readGivenFileAndDisplayOutputInUppercase() throws IOException {
        String result=file.readFile(new File("file2.txt"));
        assertEquals(" HII THIS IS TEJU",result);
    }
    @Test
    public void readGivenFileAndDisplayContentsInUppercase() throws IOException {
        String result=file.readFile(new File("file1.txt"));
        assertEquals(" I AM  MANI AM GOOD",result);
    }
    @After
    public void tearDown(){
        file=null;

    }

}