package com.codewars._6kyu.FindTheUniqueNumber;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Kata {
    public static double findUniq(double arr[]) {
        Map<Double, Long> map = Arrays.stream(arr)
                .sorted()
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        for (Map.Entry<Double, Long> tmp : map.entrySet()) {
            if (tmp.getValue() == 1) {
                return tmp.getKey();
            }
        }
        return 0;
    }
}