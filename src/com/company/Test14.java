package com.company;

import java.util.Random;

public class Test14 {
    public static void main(String[] args) {
        Random r = new Random();
        int[] m = new int[15];
        int min = 20, max = -20;
        for(int i = 1; i < 16; i++) {
            m[i-1] = r.nextInt(41) - 20;
            if(m[i-1]>max){
                max = m[i-1];
            }
            if(m[i-1]<min){
                min = m[i-1];
            }
            System.out.println(i + "=" + m[i-1]);
        }
        System.out.println("max=" + max);
        System.out.println("min=" + min);
        if(Math.abs(max)>=Math.abs(min)){
            System.out.println("Большее=|" + max + "|");
        }else{
            System.out.println("Большее=|" + min + "|");
        }
    }
}
