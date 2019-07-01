package com.stackroute.practassign2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.IOException;

import static org.junit.Assert.*;

public class FrequencyOfWordsTest {
    FrequencyOfWords frequency;

    @Before
    public void setup(){
        frequency=new FrequencyOfWords();
    }
    @Test
    public void readFileAndConveretToUpperCase() throws IOException {
        String str=frequency.readFrequencyOfWordsInFile(new File("file1.txt"));
        assertEquals(" i-2,am-2,man-1,good-1",str);
    }
    @After
    public void tearDown(){
        frequency=null;
    }

}