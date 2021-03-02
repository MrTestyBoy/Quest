package com.company;

import java.util.Scanner;

public class Test15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Курс доллара: ");
        double f =  in.nextDouble();
        System.out.print("Количество рублей: ");
        double x = in.nextDouble();
        double Res = Math.round((x*100)/f);
        System.out.printf("Итого: %5.2f долларов\n", Res/100);
    }
}
