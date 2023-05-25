package com.gage.LeetCode;

public class l_1374 {

    public static String test(int n) {
        if (n % 2 == 1) {
            return new String(new char[n]).replace("\0", "a");
        }
        return new String(new char[n - 1]).replace("\0", "a") + "b";
    }

    public static void main(String[] args) {
        System.out.println(test(11));
        ;

    }
}
