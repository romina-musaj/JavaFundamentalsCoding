package com.academy.sda.app7;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vendos nje numer te plote pozitiv: ");
        int nrPerdoruesi = scanner.nextInt();
        while(nrPerdoruesi <= 0){
            System.out.println("Numri i vendosur nuk eshte i sakte! Vendosni nje numer te plote pozitiv te sakte: ");
            nrPerdoruesi = scanner.nextInt();
        }
        int nrParaardhes = 0;
        int nrAktual = 1;
        int nrFibonaci = 1;
        for(int i = 1; i < nrPerdoruesi; i++){
            nrFibonaci = nrParaardhes + nrAktual;
            nrParaardhes = nrAktual;
            nrAktual = nrFibonaci;
        }

        System.out.print("Elementi i " + nrPerdoruesi + "  i  vargut te fibonacit eshte: " + nrFibonaci);

    }
}
