package com.academy.sda.app17;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Task17 {
    public static void main(String[] args) {
        //Deklarimi dhe inicializimi i scanner
        Scanner scanner = new Scanner(System.in);
        //Afishim i mesazhit te perdoruesit per te vendosur daten ne formatin e kerkuar
        System.out.println("Vendos daten ne formatin 'yyyy-MM-dd' te leksionit te ardhshem ne kursin e java sda fier 2: ");
        //Marrja e vleres qe perdoruesi do vendose dhe ruajtja ne variablin e deklaruar me emrin date
        String date = scanner.nextLine();
        //Deklarimi i nje variabli me emrin dataLeksionitArdhshem dhe inicializim me nje objekt te tipit LocalDate qe do ruaje te dhenat e dates se leksionit te ardhshem ne java
        LocalDate dataLeksionitArdhshem = LocalDate.parse(date);
        //Deklarimi e nje variabli me emrin dataAktuale dhe do e inicializojme duke perdorur metoden now me nje objekt te ktijuar te tipit LocalDate qe do ruaje te dhenat e dates se sotme
        LocalDate  dataAktuale = LocalDate.now();
        // Perdorim metoden statike between per te llogaritur periudhen midis dates aktuale dhe leksionit te ardhshem
        Period periudha = Period.between(dataAktuale, dataLeksionitArdhshem);
        int ditet = periudha.getDays();
        int muajt = periudha.getMonths();
        int vitet  = periudha.getYears();
        String rezultati = "Leksioni i ardhshem ne java eshte pas ";
        if(vitet > 0){
            rezultati += vitet + " vitesh ";
        }
        if(muajt > 0){
            rezultati += muajt+ " muajsh ";
        }
        if(ditet > 0){
            rezultati += ditet + " ditet";
        }
        System.out.println(rezultati);
    }
}
