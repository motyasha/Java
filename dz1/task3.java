package com.company;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        double x = 10; //начало отрезка
        double y = 30; //конец отрезка

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число, которое хотели бы проверить:");
        String number = sc.nextLine();
        double result = Double.parseDouble(number);

        check(x, y, result);

    }
    static void check(double a, double b,double result ){
        if (result >= a && result <= b) {
            System.out.println("Число " + result + " принадлежит отрезку");
        } else {
            System.out.println("Число " + result + " не принадлежит отрезку");
        }
    }

}