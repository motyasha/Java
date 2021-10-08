package com.company;

import java.util.Scanner;

public class dz1 {
    public static void main(String[] args) {
        String ans;
        ans = "y";
        while (ans.equals("n") == false ) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите первое целое число");
            String number1 = sc.nextLine();
            int result1 = Integer.parseInt(number1);
            System.out.println("Введите ворое целое число");
            String number2 = sc.nextLine();
            int result2 = Integer.parseInt(number2);

            System.out.println("Какую операцию произвести?(сложение, вычитание, умножение или деление)");
            String str = sc.nextLine();

            switch (str) {
                case "сложение":
                    Summa(result1, result2);
                    break;
                case "вычитание":
                    Minus(result1, result2);
                    break;
                case "умножение":
                    Proizvedenie(result1, result2);
                    break;
                case "деление":
                    Delenie(result1, result2);
                    break;
                default:
                    Error();

            }

            System.out.println("Чтобы продолжить, выберите y/n?");
            do {
                ans = sc.nextLine();
                if (ans.equals("y") == false && ans.equals("n") == false) {
                    System.out.println("Неверный запрос, чтобы продолжить, выберите y/n?");
                }
            } while (ans.equals("y") == false && ans.equals("n") == false);
        }
    }

    public static void Summa ( int A, int B){
        int C = A + B;
        System.out.println("Вывод:" + C);
    }
    public static void Minus ( int A, int B){
        int C = A - B;
        System.out.println("Вывод:" + C);
    }
    public static void Proizvedenie ( int A, int B){
        int C = A * B;
        System.out.println("Вывод:" + C);
    }
    public static void Delenie( int A, int B){
        double C = A / B;
        System.out.println("Вывод:" + C);
    }
    public static void Error () {
        System.out.println("Операция не распознана");
    }

}