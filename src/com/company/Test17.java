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
            String sm[] = s[i].split("");
            String sx="";
            for(String c:sm ){
                Pattern p = Pattern.compile("[]"+ sx +"]");
                sx += (!p.matcher(c).find())?c:"";
            }
            if(max<sx.length()){
                y=i;
                max = sx.length();
            }
        }
        System.out.println("Ответ:" + s[y]);
    }
}
