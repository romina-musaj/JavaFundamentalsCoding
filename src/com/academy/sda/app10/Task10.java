package com.academy.sda.app10;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vendos numrin pozitive : ");
        int numer = scanner.nextInt();
        while(numer < 0){
            System.out.println("Numri i vendosur nuk eshte i sakte. Vendos nje numer pozitiv te sakte!");
            numer = scanner.nextInt();
        }

        System.out.println("Shuma e shifrave te vendosura eshte: "+ llogaritShumaShifrave(numer));
    }

    public static int llogaritShumaShifrave(int numri){
        int shuma = 0;
        while(numri > 0){
            shuma += numri%10;
            numri /= 10;
        }
        return shuma;
    }
}
