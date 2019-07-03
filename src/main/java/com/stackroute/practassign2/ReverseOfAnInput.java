package com.stackroute.practassign2;

public class ReverseOfAnInput {
    public static String ReverseOfString(String str) //reversing the given string
    {
        String string="";
        int stringlength=str.length();
        for(int i=stringlength-1;i>=0;i--)
        {
            string=string+str.charAt(i);
        }
        return string;
    }
}
