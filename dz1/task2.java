package com.company;

public class task2 {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        int c = 4;
        int R = 10;
        int H = 3;
        int r = 2;

        ParallelepipedV(a,b,c);
        BallV(R);
        CylinderV(r,H);

    }
    static void ParallelepipedV(int a, int b, int c) {
        int Vp = a*b*c;
        System.out.println("Объём параллелепипеда: " + Vp);
    }
    static void BallV(int R) {
        double Vb = (4*3.14*Math.pow(R,3))/3;
        System.out.println("Объём шара: " + Vb);
    }
    static void CylinderV(int r, int H) {
        double Vc = 3.14*Math.pow(r,2)*H ;
        System.out.println("Объём цилиндра: " + Vc);
    }
}