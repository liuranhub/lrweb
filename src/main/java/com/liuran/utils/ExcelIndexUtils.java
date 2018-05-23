package com.liuran.utils;

public class ExcelIndexUtils {
    public static int toIndex(String line){
        line = line.toLowerCase();
        if (line.length() == 1){
            char c = line.charAt(0);
            return c - 'a';
        }

        if (line.length() == 2){
            char c10 = line.charAt(0);
            char c = line.charAt(1);

            return (c10 -  'a' + 1) * 26 + c - 'a';
        }

        return 0;
    }

    public static void main(String[] args) {
        System.out.println(toIndex("Z"));
    }
}
