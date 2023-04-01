package com.academy.sda.app6;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ju lutem vendosni nje number pozitiv: ");
        int numriVendosurPerdoruesi = scanner.nextInt();
        while(numriVendosurPerdoruesi <= 0){
            System.out.println("Numri i vendosur nuk eshte i sakte. Ju lutem vendosni nje number pozitive te sakte: ");
            numriVendosurPerdoruesi = scanner.nextInt();
        }
        System.out.println("Shuma e serise harmonike eshte: "+ llogaritShumaHarmonike(numriVendosurPerdoruesi));
    }

    public static  double llogaritShumaHarmonike(int numri){
        double shuma = 0;
        for(int i = 1; i <= numri; i++){
            shuma += (double)1 / i;
        }
        return shuma;
    }
}
