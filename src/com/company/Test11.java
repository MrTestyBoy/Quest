package com.company;

import java.util.Scanner;

public class Test11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("1: ");
        String s = in.nextLine();
        System.out.print("2: ");
        int x = in.nextInt();
        if(x>Integer.parseInt(s)){
            System.out.println(x);
            System.out.println(Double.parseDouble(s));
        }else{
            System.out.println(s);
            double d = x;
            System.out.println(d);
        }
    }
}
