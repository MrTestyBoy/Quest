package com.company;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int Res = 0;
        System.out.print("1 - weight, 2 - distance:");
        int I1 = in.nextInt();
        System.out.print("value:");
        int I2 = in.nextInt();
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        if(I1 == 1){
            System.out.println("Грамм: " + I2);
            String result = decimalFormat.format(I2*0.035274);
            System.out.println("Унция: " + result);
            result = decimalFormat.format(I2*0.00220462);
            System.out.println("Фунт: " + result);
            result = decimalFormat.format(I2*15.4324);
            System.out.println("Гран: " + result);
        }
        if(I1 == 2){
            System.out.println("Метры: " + I2);
            String result = decimalFormat.format(I2*0.0006);
            System.out.println("Мили: " + result);
            decimalFormat = new DecimalFormat("#.##");
            result = decimalFormat.format(I2*1.09361);
            System.out.println("Ярды: " + result);
            result = decimalFormat.format(I2*3.28084);
            System.out.println("Футы: " + result);
        }

    }
}
