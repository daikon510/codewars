package com.codewars.saiki;

import javaslang.collection.Array;
import javaslang.collection.List;

import java.util.ArrayList;

public class Saiki {
    public static void main(String[] args) {
        List<Integer> ns = List.of(4, 2, 5, 1, 3);
        List<String> ss = List.of("java", "php", "python");

        sum(ns);                             // 15

//            max(ns);                             // 5

//            size(ns);                            // 5
//            size(ss);                            // 3
//
//            map(ns, n -> n * 2);                 // [8, 4, 10, 2, 6]
//            map(ss, String::length);             // [4, 3, 6]
//
//            filter(ns, n -> n > 2);              // [4, 5, 3]
//            filter(ss, s -> s.startswith("p"));  // ["php", "python"]
//
//            all(ns, n -> n > 3);                 // false
//            all(ss, s -> s.size() > 0);          // true
//
//            any(ns, n -> n > 3);                 // true
//            any(ss, s -> s.size() > 0);          // true
//
//            join(ss, " | ");                     // "java | php | python"
//
//            reverse(ns);                         // [3, 1, 5, 2, 4]
//            reverse(ss);                         // ["python", "php", "java"]
    }

    // sum

    public static Integer sum(List<Integer> ns) {
        return sum(ns, 0);
    }

    private static Integer sum(List<Integer> ns, Integer acc) {
        if (ns.size() == 0) {
            return acc;
        } else {
            Integer n = ns.head();
            return sum(ns.tail(), acc + n);
        }
    }

    // max
    public static Integer max(List<Integer> ns) {
        return max(ns, 0);
    }

    private static Integer max(List<Integer> ns, Integer acc) {
        if (ns.size() == 0) {
            return acc;
        }
        Integer n = ns.head();
        return acc < n ? max(ns.tail(), n) : max(ns.tail(), acc);
    }

    // size
    public static Integer size(List<?> ns) {
        return size(ns, 0);
    }

    private static Integer size(List<?> ns, Integer acc) {
        if (ns == List.empty()) {
            return acc;
        }
        ns.head();
        return size(ns.tail(), acc += 1);
    }

    // map

    // filter

    // all

    // any

    // join

    // reverse
}