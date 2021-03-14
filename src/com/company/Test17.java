package com.company;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Test17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Количество строк: ");
        int x = in.nextInt();
        int max=0, y = 0;
        String[] s = new String[x+1];
        s[0] = in.nextLine();
        for (int i = 1; i-1<x; i++){
            System.out.print("Строка "+ i + ": ");
            s[i] = in.nextLine();
            String[] sm = s[i].split("");
            StringBuilder sx= new StringBuilder();
            for(String c:sm ){
                Pattern p = Pattern.compile("[]"+ sx +"]");
                sx.append((!p.matcher(c).find()) ? c : "");
            }
            String[] st = sx.toString().split("");
            int n = sx.length()-1;
            for (; n>=0; n--){
                int t = 0;
                for (String c : sm) {
                    if (c.equals(st[n])) {
                        t++;
                    }
                }
                sx = new StringBuilder((t > 1) ? sx.substring(0, sx.length() - 1) : sx.toString());
            }
            if(max<sx.length()){
                y=i;
                max = sx.length();
            }
        }
        System.out.println("Ответ:" + s[y]);
    }
}
