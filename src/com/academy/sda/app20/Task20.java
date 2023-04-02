package com.academy.sda.app20;

import java.util.Random;
import java.util.Scanner;

public class Task20 {
    public static void main(String[] args) {
        Random randon = new Random();
        int numerRastesor = randon.nextInt(101);
        Scanner scanner = new Scanner(System.in);
        int input;
        do{
            System.out.println("Vendos nje numer cfaredo: ");
            input = scanner.nextInt();

            if(input > numerRastesor){
                System.out.println("Too much");
            }
            else if (input < numerRastesor){
                System.out.println("Too little");
            }

        } while(input > numerRastesor  || input < numerRastesor);

        System.out.println("Congratulations!");
    }
}
