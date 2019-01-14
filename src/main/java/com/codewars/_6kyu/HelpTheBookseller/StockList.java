package com.codewars._6kyu.HelpTheBookseller;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class StockList {
    public static String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        Arrays.stream(lstOf1stLetter).forEach(
                c -> {
                    Map<String, Integer> map2 = new HashMap<String, Integer>();
                    Arrays.stream(lstOfArt).filter(a -> a.startsWith(c)).forEach(
                            a -> {
                                String[] str = a.split(" ");
                                map2.put(str[0], Integer.valueOf(str[1]));
                            }
                    );
                    int sum = map2.entrySet().stream().mapToInt(Map.Entry::getValue).sum();
                    map.put(c, sum);
                }
        );
        if (lstOfArt.length == 0) {
            return "";
        }
        return map.entrySet().stream().reduce(
                "",
                (sum, els) -> sum + "(" + els.getKey() + " : " + els.getValue() + ")",
                (a, b) -> null
        ).replace(")(", ") - (");
    }
}