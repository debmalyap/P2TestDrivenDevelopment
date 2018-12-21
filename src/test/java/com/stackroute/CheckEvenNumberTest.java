package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CheckEvenNumberTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void checkiseven_1()
    {
        assertTrue(CheckEvenNumber.checkeven(24));
    }

    @Test
    public void checkiseven_2()
    {
        assertFalse(CheckEvenNumber.checkeven(25));
    }

    @Test
    public void checkiseven_3()
    {
        assertTrue(CheckEvenNumber.checkeven(23));
    }
}