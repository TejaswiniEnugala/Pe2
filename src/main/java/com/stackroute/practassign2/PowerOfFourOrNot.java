package com.stackroute.practassign2; // Program to check whether the number is power of 4 or not

public class PowerOfFourOrNot {
    public static String isPowerOfFour(int number)
    {

        if(number == 0)
            return "0";
        while(number != 1)
        {
            if(number % 4 != 0)
                return "it is not a power of 4";
            number= number / 4;
        }
return "it is power of 4";
    }
}
