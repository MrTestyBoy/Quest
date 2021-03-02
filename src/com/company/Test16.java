package com.company;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Test16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String[] sm = s.split("");
        int[] z = new int[3];
        int i = 1, x = 0, res, dec = 1;
        for(String c:sm ){
            Pattern p = Pattern.compile("[0-9]$");
            if(p.matcher(c).find()){
                z[i - 1] = z[i - 1]*10+ Integer.parseInt(c);
            } else {
                i++;
                if(c.equals("-")){
                    dec = -1;
                }
                if(c.equals("x")){
                    i--;
                    x = i;
                    System.out.println("x=" + i);
                    if(x==3){
                        res = z[0] + (z[1]*dec);
                    }
                }
            }
        }
        if(x == 2){
            res = (z[2] - z[0])*dec;
        }else{
            res = z[2] - (z[1])*dec;
        }
        System.out.println("x=" + res);
    }
}
