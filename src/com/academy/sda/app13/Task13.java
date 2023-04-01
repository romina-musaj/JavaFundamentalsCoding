package com.academy.sda.app13;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vendos tekstin: ");
        String text = scanner.nextLine();
        System.out.println("Teksti i modifikuar eshte: "+duplikoFjaletETekstit(text));
    }

    public static String duplikoFjaletETekstit(String text){
        String[] fjalet = text.split(" ");
        String textModifikuar = "";
        for(String el: fjalet){
            // repeat(2) - el + " " + el  + " "
            textModifikuar += (el + " ").repeat(2);
        }
        return textModifikuar;
    }
}
