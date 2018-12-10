package com.codewars._6kyu;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LineTest {

    @Test
    public void test1() {
        assertEquals("YES", Line.Tickets(new int[]{25, 25, 50}));
    }

    @Test
    public void test2() {
        assertEquals("NO", Line.Tickets(new int[]{25, 100}));
    }

    @Test
    public void test3() {
        assertEquals("NO", Line.Tickets(new int[]{25, 100, 25, 25}));
    }

    @Test
    public void test4() {
        assertEquals("NO", Line.Tickets(new int[]{25, 100}));
    }
    @Test
    public void test5() {
        assertEquals("YES", Line.Tickets(new int[]{}));
    }
    @Test
    public void test6() {
        assertEquals("YES", Line.Tickets(new int[]{25, 25, 50, 50}));
    }
    @Test
    public void test7() {
        assertEquals("NO", Line.Tickets(new int[]{25, 25, 50, 50, 100}));
    }
    @Test
    public void test8() {
        assertEquals("YES", Line.Tickets(new int[]{25, 25, 50, 50, 25, 100}));
    }
    @Test
    public void test9() {
        assertEquals("NO", Line.Tickets(new int[]{25, 25, 50, 50, 100, 25}));
    }
}