package com.company;

import java.util.Arrays;

public class task6 {
    public static void main(String[] args) {
        String[] strArray = new String[] {"a","s","s","d","f","g","h","j","l","l","q","w","e","r","t"};
        System.out.println("Массив до сортировкой: ");
        System.out.println(Arrays.toString(strArray));

        System.out.println("Массив после сортировки: ");
        Arrays.sort(strArray);
        System.out.println(Arrays.toString(strArray));

        System.out.println("Новый массив: ");
        String[] strArray2 = new String[10];
        for (int i = 0; i<strArray2.length; i++){
            if (i<5) {
                strArray2[i] = strArray[i];
            } else {
                strArray2[i] = strArray[i+5];
            }
        }
        System.out.println(Arrays.toString(strArray2));


    }
}