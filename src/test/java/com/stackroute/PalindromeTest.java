package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeTest {
Palindrome palindrome;
    @Before
    public void setUp() throws Exception {
        palindrome = new Palindrome();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void palindromeReverse() {
        assertEquals("ihbrus",palindrome.palindromeReverse("surbhi"));
        assertEquals( "najas",palindrome.palindromeReverse( "sajan"));
    }

    }
}