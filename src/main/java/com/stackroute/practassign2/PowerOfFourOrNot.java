package com.stackroute.practassign2; // Program to check whether the number is power of 4 or not

public class PowerOfFourOrNot {
    public static String isPowerOfFour(int num)
    {

        if(num == 0)
            return "0";
        while(num != 1)
        {
            if(num % 4 != 0)
                return "it is not a power of 4";
            num= num / 4;
        }
return "it is power of 4";
    }
}
