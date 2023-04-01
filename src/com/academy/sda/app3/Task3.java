package com.academy.sda.app3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vendos koeficentin a: ");
        int a = scanner.nextInt();
        while(a == 0){
            System.out.println("Vlera e vendosur e koeficentit a eshte e gabuar. Vendosni nje vlere te re: ");
            a = scanner.nextInt();
        }
        System.out.println("Vendos koeficentin b: ");
        int b = scanner.nextInt();
        System.out.println("Vendos koeficentin c: ");
        int c = scanner.nextInt();
        EkuacioniKuadratik ekuacioni = new EkuacioniKuadratik(a,b,c);
        ekuacioni.afishoRrenjet();
    }

}
