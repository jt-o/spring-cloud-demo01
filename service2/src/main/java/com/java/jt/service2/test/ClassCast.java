package com.java.jt.service2.test;

/**
 * Created by jt on 2019/10/29 20:24
 */
public class ClassCast {
    public static final String STR = "1";

    public static void main(String[] args) {
        String s = ClassCast.STR;

        Integer integer = Integer.valueOf(s);
        System.out.println(integer);

        int parseInt = Integer.parseInt(s);
        System.out.println(parseInt);
    }
}
