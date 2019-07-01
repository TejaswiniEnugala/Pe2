package com.stackroute.practassign2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentGradesTest {
    StudentGrades studentMarksCaluculator;
    String expectedResult;
    String actualResult;
    @Before
    public void setUp(){

        studentMarksCaluculator=new StudentGrades();
    }
    @Test
    public void checkForStudentsMarks(){
        int students=4;
        int[] marks = {10,20,30,40};
        actualResult=studentMarksCaluculator.getAverage(students,marks);
        expectedResult="average of students marks is 25.0";
        assertEquals(expectedResult,actualResult);

        actualResult=studentMarksCaluculator.getMaxMarks(students,marks);
        expectedResult="The maximum grade is 40";
        assertEquals(expectedResult,actualResult);


        actualResult=studentMarksCaluculator.getMinMarks(students,marks);
        expectedResult="The minimum grade is 10";
        assertEquals(expectedResult,actualResult);
    }
    @Test
    public void checkForStudentGrades(){
        int students=4;
        int[] marks = {20,40,60,80};
        actualResult=studentMarksCaluculator.getAverage(students,marks);
        expectedResult="average of students marks is 50.0";
        assertEquals(expectedResult,actualResult);

        actualResult=studentMarksCaluculator.getMaxMarks(students,marks);
        expectedResult="The maximum grade is 80";
        assertEquals(expectedResult,actualResult);


        actualResult=studentMarksCaluculator.getMinMarks(students,marks);
        expectedResult="The minimum grade is 20";
        assertEquals(expectedResult,actualResult);
    }
    @Test
    public void checkForGradesOfStudents(){
        int students=3;
        int[] marks = {30,90,60};
        actualResult=studentMarksCaluculator.getAverage(students,marks);
        expectedResult="average of students marks is 60.0";
        assertEquals(expectedResult,actualResult);

        actualResult=studentMarksCaluculator.getMaxMarks(students,marks);
        expectedResult="The maximum grade is 90";
        assertEquals(expectedResult,actualResult);


        actualResult=studentMarksCaluculator.getMinMarks(students,marks);
        expectedResult="The minimum grade is 30";
        assertEquals(expectedResult,actualResult);
    }


    @After
    public void tearDown(){
        studentMarksCaluculator = null;
    }


}