package com.stackroute;

import org.junit.Test;

import static org.junit.Assert.*;

public class CheckPowerof4Test {
    @Test
    public void shouldRecognize16() {
        assertEquals(true, CheckPowerof4.ispowerof4(16));
    }
    @Test
    public void shouldRecognize256() {
        assertEquals(true, CheckPowerof4.ispowerof4(256));
    }
    @Test
    public void shouldNotRecognize121() {
        assertEquals(false, CheckPowerof4.ispowerof4(121));
    }
    @Test
    public void shouldNotRecognize() {
        assertEquals(false, CheckPowerof4.ispowerof4(-1));
    }
    @Test
    public void shouldRecognize1() {
        assertEquals(true, CheckPowerof4.ispowerof4(1));
    }
    @Test
    public void shouldRecognize1048576() {
        assertEquals(true, CheckPowerof4.ispowerof4(1048576));
    }


}