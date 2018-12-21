package com.stackroute;

import org.junit.Test;
// when the input is more 12 it will return -1
import static org.junit.Assert.*;

public class FactorialListTest {

    @Test
    public void test1()

    {
        assertEquals(1,FactorialList.factorial(1));
    }

    @Test
    public void test2()

    {

        assertEquals(2,FactorialList.factorial(2));
    }

    @Test
    public void test3()

    {
        assertEquals(120,FactorialList.factorial(5));
    }

    @Test
    public void test4()

    {
        assertEquals(-1,FactorialList.factorial(14));
    }


    @Test
    public void test5()

    {
        assertEquals(-1,FactorialList.factorial(13));
    }

    @Test
    public void test6()

    {
        assertEquals(479001600,FactorialList.factorial(12));
    }

}