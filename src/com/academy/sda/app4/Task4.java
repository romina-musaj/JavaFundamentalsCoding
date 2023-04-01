package com.academy.sda.app4;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vendos nje number pozitiv: ");
        int number = scanner.nextInt();
        while(number <= 0){
            System.out.println("Numri i vendosur nuk eshte i sakte! Vendos nje number pozitiv: ");
            number = scanner.nextInt();
        }
        afishoRezultatin(number);

    }

    public static void afishoRezultatin(int number){
        for(int i = 1; i <= number; i++){
            if(i%3 == 0 && i%7 == 0){
                System.out.println("Fizz buzz");
            }
            else if (i % 7 == 0){
                System.out.println("Buzz");
            }
            else if (i % 3 == 0){
                System.out.println("Fizz");
            } else {
                System.out.println(i);
            }
        }
    }
}
