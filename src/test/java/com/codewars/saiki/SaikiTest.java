package com.codewars.saiki;

import javaslang.collection.List;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SaikiTest {
    List<Integer> ns = List.of(4, 2, 5, 1, 3);
    List<String> ss = List.of("java", "php", "python");

    @Test
    public void Test() {
        assertEquals(Integer.valueOf(15), Saiki.sum(ns));
        assertEquals(Integer.valueOf(5), Saiki.max(ns));
        assertEquals(Integer.valueOf(5), Saiki.size(ns));
        assertEquals(Integer.valueOf(3), Saiki.size(ss));
    }
}