package com.academy.sda.app2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        System.out.println("Vendos peshen ne kg: ");
        float pesha = scanner.nextFloat();
        while (pesha <= 0){
            System.out.println("Pesha e vendosur nuk eshte e sakte. Vendos nje vlere te sakte: ");
            pesha = scanner.nextFloat();
        }
        System.out.println("Vendosni gjatesine ne centimeter");
        int gjatesiaNeCentimeter = scanner.nextInt();

        while (gjatesiaNeCentimeter <= 0){
            System.out.println("Gjatesia e vendosur nuk eshte e sakte. Vendos nje vlere te sakte: ");
            gjatesiaNeCentimeter = scanner.nextInt();

        }
        if(isBmiOptimal(pesha, gjatesiaNeCentimeter)){
            System.out.println("BMI eshte optimale");
        }
        else {
            System.out.println("BMI nuk eshte optimale");

        }
    }

   public static boolean isBmiOptimal(float pesha, int gjatesia){
       float gjatesiNeMeter = (float)gjatesia / 100;
       float bmi = (float) (pesha / Math.pow(gjatesiNeMeter, 2));
       if(bmi >= 18.5 && bmi <= 24.9){
           return true;
       }
       return false;
    }
}
