package com.academy.sda.app8;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     System.out.println("Vendos argumentin e pare: ");
     float input1 = scanner.nextFloat();
     System.out.println("Vendos veprimin qe do te kryesh + - / * ");
    char  veprimi = scanner.next().charAt(0);
     System.out.println("Vendos argumentin e dyte: ");
     float input2 = scanner.nextFloat();
     switch(veprimi){
         case '+':
             System.out.println("Resultati: " + (input1 + input2));
             break;
         case '-':
             System.out.println("Resultati: " + (input1 - input2));
             break;
         case '/':
             System.out.println("Resultati: "+ (input1/input2));
         case '*':
             System.out.println("Resultati: " + input1*input2);
             break;
         default:
             System.out.println("Simboli eshte i pavlefshem!");
             System.out.println("Num mund ta bejme dot llogaritjen!");
     }
    }
}
