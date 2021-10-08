package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;


public class dz2 {

    public static void main(String[] args) {
        boolean cheak;
        cheak = false;
        String[] nameArray = new String[] {"Maxim","Vladimir","Vasiliy","Artyom","Leonid"};
        System.out.println(Arrays.toString(nameArray));

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите имя:");
        String name = sc.nextLine();

        for (int i = 0; i<nameArray.length; i++) {
            if (name.equals(nameArray[i])) {
                cheak = true;
                break;
            }
        }
        if (cheak == true) {
            System.out.println("Введённое имя есть в массиве");
        }else{
            System.out.println("Введённого имени нет в массиве");
        }

    }

}