package com.stackroute.practassign2;//program to find the factorial

public class Factorial {
    public String factorialOfNumber(int n)
    {
        int i, j;
        int factorial=1;
        String[] string=new String[n];
        String str="";
        for (i = 1; i <= n; i++) {
            factorial = 1;
            for (j = 1; j <= i; j++) {
                factorial = factorial * j;
            }
            string[i-1]= "the factorial of" + (i) +"is"+ factorial;

        }
        for(i=0;i<n;i++)
        {
            str=str+string[i]+"\n";
        }
        return str;
    }
}
