package com.stackroute;

public class FactorialList
{
    public static int factorial(int n)
    {
        int fact=1;
        if (n>12)
        {
            return -1;
        }
        else
            {
                for (int i = n; i >= 1; i--)
                {
                fact = fact * i;

                }
            }return fact;
    }
}
