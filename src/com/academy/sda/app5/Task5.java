package com.academy.sda.app5;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vendos nje number pozitiv nga perdoruesi: ");
        int number = scanner.nextInt();
        while(number <= 0){
            System.out.println("Input i vendosur eshte i gabuar. Vendos nje number pozitiv nga perdoruesi: ");
            number = scanner.nextInt();
        }
        for(int i = 2; i < number; i++){
            if(eshteNumberThjeshteMenyra3(i)){
                System.out.println(i);
            }
        }


    }

    public static boolean eshteNumberThjeshteMenyra1(int number){
        int j = 2;
        while( j < number) {
            if(number % j == 0){
                return false;
            }
            j++;
        }
        return true;
    }

    public static boolean eshteNumberThjeshteMenyra2(int number){
        int j = 2;
        int myVar = 0;
        while( j < number) {
            if(number % j == 0){
                myVar = j;
                break;
            }
            j++;
        }
        return (myVar == 0);
    }

    public static boolean eshteNumberThjeshteMenyra3(int number){
        int j = 2;
        boolean isPrime = true;
        while( j < number) {
            if(number % j == 0){
               isPrime = false;
                break;
            }
            j++;
        }
        return isPrime;
    }
}
