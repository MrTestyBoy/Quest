package com.company;

public class Test3 {
    public static void main(String[] args) {
        int[] N = new int[]{1, 2, 3, 4, 5};
        int C = N[N.length-1];
        N[N.length-1] = N[0];
        N[0] = C;
        System.out.println(N[0] + N[N.length/2]);
    }
}
