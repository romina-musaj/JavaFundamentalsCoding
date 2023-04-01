package com.academy.sda.app1;

import java.util.Scanner;

public class Task1 {
    final static float pi = 3.14f;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vendos diametrin e rrethit: ");
        float diameter = scanner.nextFloat();
        Rrethi rrethi1 = new Rrethi(diameter, pi);
        Rrethi rrethi2 = new Rrethi(diameter, Math.PI);
        System.out.println(rrethi1 + " " + rrethi1.llogaritPerimeter());
        System.out.println(rrethi2  + " " + rrethi2.llogaritPerimeter());
    }
}
