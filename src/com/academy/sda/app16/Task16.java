package com.academy.sda.app16;

import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        //Deklarojme dhe inicializojme skanerin
        Scanner scanner = new Scanner(System.in);
        //I kerkojme perdoruesit te vendose gjatesine e array - sa elemente do kete
        System.out.println("Vendos sa elemente ka lista: ");
        int gjatesia = scanner.nextInt();
        while(gjatesia<=0){
            System.out.println("Input-i i vendosur nuk eshte i sakte! Vendos nje vlere te sakte: ");
            gjatesia = scanner.nextInt();
        }
        //Deklarojme he inicializojme nje array qe do ruaje vlera te tipit int
        int[] lista = new int[gjatesia];
        //Nepermjet nje cikli for qe do itineroje 10 here do ti kerkojme perdoruesit te vendose 10 element;
        for(int i = 0; i < gjatesia; i++){
            //4. Kerkojme perdorusit te vendose vleren e elementit ne index e i-ite dhe vleren e ruajme te array qe krijuam me siper
            System.out.println("Vendos elementin ne indeksin e "+i);
            lista[i] =  scanner.nextInt();
        }
        //5. Bejme afishimin
        System.out.println(llogaritSekuencenMeTeGjate(lista));
    }

    public static int llogaritSekuencenMeTeGjate(int[] lista){
        //1 Deklarojme dhe inicializojme 2 variabla te tipit int qe do na ruajne vleren e numrit te sekuences aktuale dhe sekuences qe ka me shume elemente
        int count = 1;
        int maxCount = 0;

        //2 Itinerojme ne cdo element te array lista nga elementi me index = 1 deri te elementi me index = length-1
        for(int i = 1; i < lista.length; i++){
            //3 Ne cdo itinerim do verifikojme nese elementi ne indeksin aktual i eshte me i madh se elementi paarardhes
            if(lista[i-1] < lista[i]){
                //4. Nese kushti eshte i sakte rrisim vleren e count me 1
                count++;
            } else {
                //5. Nese kushti nuk eshte i sakte do te thote qe sekuenca mbaroi. Do kontrollojme maxCount dhe ne te njejten
                //kohe vleren e count e kalojme ne 1 per te nisur me numrimin e sekuences se radhes.
                if(count > maxCount){
                    maxCount = count;
                }
                count = 1;
            }
        }
        if(count > maxCount){
            maxCount = count;
        }
        return maxCount;
    }
}
