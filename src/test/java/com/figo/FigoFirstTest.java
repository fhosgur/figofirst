package com.figo;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by fhosgur on 1/23/15.
 */
public class FigoFirstTest {
    @Test
    public void square(){
        assertEquals("Expected 25 but got something else",25,FigoFirst.square(5));
    }

    @Test
    public void squareTestZero(){
        assertEquals("Expected 0 but got something else",0,FigoFirst.square(0));
    }

    @Test
    public void testNegativeNumbers(){
        assertEquals("Expected 0 but got something else",25,FigoFirst.square(-5));
    }
}
