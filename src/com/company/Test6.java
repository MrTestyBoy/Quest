package com.company;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("1 - weight, 2 - distance:");
        int I1 = in.nextInt();


        if(I1 == 1){
            System.out.print("1 - Грамм, 2 - Унция, 3 - Фунт, 4 - Гран:");
            int I3 = in.nextInt();
            System.out.print("value:");
            double I2 = in.nextDouble();
            switch(I3){
                case  (1):break;
                case (2):I2/=0.035274;break;
                case (3):I2/=0.00220462;break;
                case (4):I2/=15.4324;break;
            }
            DecimalFormat decimalFormat = new DecimalFormat("#.##");
            System.out.println("Грамм: " + I2);
            String result = decimalFormat.format(I2*0.035274);
            System.out.println("Унция: " + result);
            result = decimalFormat.format(I2*0.00220462);
            System.out.println("Фунт: " + result);
            result = decimalFormat.format(I2*15.4324);
            System.out.println("Гран: " + result);
        }
        if(I1 == 2){
            System.out.print("1 - Метры, 2 - Мили, 3 - Ярды, 4 - Футы:");
            int I3 = in.nextInt();
            System.out.print("value:");
            double I2 = in.nextDouble();
            switch(I3){
                case  (1):break;
                case (2):I2/=0.0006;break;
                case (3):I2/=1.09361;break;
                case (4):I2/=3.28084;break;
            }
            DecimalFormat decimalFormat = new DecimalFormat("#.##");
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
