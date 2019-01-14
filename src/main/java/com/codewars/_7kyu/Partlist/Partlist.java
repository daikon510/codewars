package com.codewars._7kyu.Partlist;

public class Partlist {
    public static String[][] partlist(String[] arr) {
        String[][] str = new String[arr.length - 1][1];
        String a = "";
        String[] b = new String[1];
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length; j++) {
                a = a.concat(arr[j]);
                if (i == j && j != arr.length - 1) {
                    a = a.concat(", ");
                } else if (j != arr.length - 1) {
                    a = a.concat(" ");
                }
            }
            b[0] = a;
            str[i][0] = b[0];
            a = "";
            b[0] = "";
        }
        return str;
    }
}
