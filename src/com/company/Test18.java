package com.company;

import java.util.Scanner;

public class Test18 {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        System.out.println("Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает");
        String s ;
        int i = 0;
        boolean exit = true;
        while (exit){
            System.out.print("Ваш ответ: ");
            s = in.nextLine();
            if(s.equals("Подсказка")){
                if (i<1) {
                    System.out.println("вирус");
                    i = 2;
                }
                else System.out.println("Подсказка уже недоступна");
            } else {
                if(s.equals("Заархивированный вирус")) {
                    System.out.print("Правильно!");
                    exit = false;
                }
                else if (i<2) {
                    System.out.println("Подумай еще!");
                    i++;
                }
                else {
                    System.out.print("Обидно, приходи в другой раз");
                    exit = false;
                }
            }

        }
    }
}
