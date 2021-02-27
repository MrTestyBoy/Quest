package com.company;

import java.util.Scanner;

public class Test12 {
    public static void main(String[] args) {
        String s = "I like Java!!!";
        if((s.contains("Java"))&&(s.startsWith("I like"))&&(s.endsWith("!!!"))) {
            System.out.println(s.toUpperCase());
            s = s.replace("a", "o");
            System.out.println(s.substring(7,11));
        }
    }
}
