package com.company;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {

        double a = 2; //начало отрезка
        double b = 8; //конец отрезка
        String ans;
        ans = "y";

        while (ans.equals("n") == false) {

            Scanner sc = new Scanner(System.in);
            System.out.println("Введите число, для проверки:");
            String number = sc.nextLine();
            double result = Double.parseDouble(number);

            otrezokProverka(a, b, result);

            System.out.println("Чтобы продолжить, выберите y/n?");
            do {
                ans = sc.nextLine();
                if (ans.equals("y") == false && ans.equals("n") == false) {
                    System.out.println("Неверный запрос, чтобы продолжить, выберите y/n?");
                }
            } while (ans.equals("y") == false && ans.equals("n") == false);

        }
    }
    static void otrezokProverka(double a, double b,double result ){
        if (result >= a && result <= b) {
            System.out.println("Число " + result + " принадлежит отрезку");
        } else {
            System.out.println("Число " + result + " не принадлежит отрезку");
        }
    }

}