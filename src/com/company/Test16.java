package com.company;

import java.util.Scanner;

public class Test16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Уравнение:");
        String s = in.nextLine();
        String[] sx = s.split("x");
        String[] sm = s.split("");
        int res, dec = 1;
        dec = (sm[1].equals("-"))?-1:dec;
        if(sx.length == 2){
            res = (sx[0].equals(""))?(Integer.parseInt(sm[4]) - (Integer.parseInt(sm[2])*dec)):((Integer.parseInt(sm[4]) - Integer.parseInt(sm[0]))*dec);
        } else {
            res = Integer.parseInt(sm[0]) + (Integer.parseInt(sm[2])*dec);
        }
        System.out.println("x= " + res);
    }
}
