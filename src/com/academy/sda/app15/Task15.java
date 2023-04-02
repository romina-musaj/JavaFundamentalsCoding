package com.academy.sda.app15;

import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        //1. Deklarojme dhe inicializojme skanerin
        Scanner scanner = new Scanner(System.in);
        //2. Deklarojme he inicializojme nje array qe do ruaje vlera te tipit int
        int[] lista = new int[10];
        //3. Nepermjet nje cikli for qe do itineroje 10 here do ti kerkojme perdoruesit te vendose 10 element;
        for(int i = 0; i < 10; i++){
            //4. Kerkojme perdorusit te vendose vleren e elementit ne index e i-ite dhe vleren e ruajme te array qe krijuam me siper
            System.out.println("Vendos elementin ne indeksin e "+i);
            lista[i] =  scanner.nextInt();
        }

        //5 Nepermjet nje cikli for itinerojme ne cdo element te array : index 0 - index 8
        for(int i = 0; i < 9; i++){
            boolean flag = false;
            //6 Verifikojme nese ka elemente parardhes te barbarte - do te thote qe numri eshte afishuar nje here
            for(int j = i - 1; j >= 0; j--){
                 if(lista[j] == lista[i]){
                      flag = true;
                      break;
                 }
            }
            // 7. Nese numri eshte afishuar nje here nuk eshte nevoja ta krahaasojme me elementet pasues - vazhdojme te intineri tjeter
            if(flag){
                continue;
            }

            // 8. Nese elementi nuk eshte afishuar me perpara e krahasojme me gjithe elementet pasuese
            for(int j = i + 1; j < 10; j++){
                //9. Nese gjejme nje element pasues te barabarte me elementin aktual e afishojme direkt dhe pervec afishit e nderpresim ciklin
                if(lista[i] == lista[j]){
                    System.out.println(lista[i] + " ");
                    break;
                }
            }
        }
    }
}
