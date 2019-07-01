package com.stackroute.practassign2;//program to find the students grades , max marks, min marks, average

public class StudentGrades {
    public static String getAverage(int students, int[] marksOfStudents) {
        int sum = 0;
        String output;
        float average;
        for (int i = 0; i < students; i++) {
            sum = sum + marksOfStudents[i];
        }
        average = sum / students;
        output = "average of students marks is " + average;
        return output;

    }
    public static String getMaxMarks(int students, int[] marksOfStudents){
        String output;
        int maxValue = marksOfStudents[0];
        for(int i=1;i < marksOfStudents.length;i++){
            if(marksOfStudents[i] > maxValue){
                maxValue = marksOfStudents[i];
            }
        }
        output = "The maximum grade is "+maxValue;
        return output;
    }
    public static String getMinMarks(int students, int[] marksOfStudents){
        String output;
        int minValue = marksOfStudents[0];
        for(int i=1;i<marksOfStudents.length;i++){
            if(marksOfStudents[i] < minValue){
                minValue = marksOfStudents[i];
            }
        }
        output = "The minimum grade is "+minValue;
        return output;
    }


}


