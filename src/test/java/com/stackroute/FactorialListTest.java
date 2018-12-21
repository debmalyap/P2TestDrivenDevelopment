package com.stackroute;

import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialListTest {

    @Test
    public void test1

    {
        FactorialList ob1 = new FactorialList();
        assertEquals(1,ob1.factorial(1));
    }

    @Test
    public void test2

    {
        FactorialList ob2 = new FactorialList();
        assertEquals(2,ob2.factorial(2));
    }

    @Test
    public void test3

    {
        FactorialList ob3 = new FactorialList();
        assertEquals(120,ob3.factorial(5));
    }

    @Test
    public void test4

    {
        FactorialList ob4 = new FactorialList();
        assertEquals("out of range",ob4.factorial(14));
    }


    @Test
    public void test5

    {
        FactorialList ob5 = new FactorialList();
        assertFalse("out of range",ob5.factorial(13);
    }

    @Test
    public void test6

    {
        FactorialList ob6 = new FactorialList();
        assertEquals(479001600,ob6.factorial(12));
    }

    @Test
    public void test7

    {
        FactorialList ob7 = new FactorialList();
        assertNull("Enter some value",);
    }


}