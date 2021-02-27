package com.company;

import java.util.regex.Pattern;

public class Test13 {
    public static void main(String[] args) {
        int Sey = 0;
        String s = "I love java 8 Я люблю java 14 core1";
        String sm[] = s.split(" ");
        s = "";
        for(String c:sm ){
            Pattern x = Pattern.compile("[a-zA-Z]$");
            if(x.matcher(c).find()){
                s += c + " ";
                Sey++;
            }
        }
        System.out.println(s);
        System.out.println(Sey);
    }
}
