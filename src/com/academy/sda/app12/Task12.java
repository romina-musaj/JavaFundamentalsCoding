package com.academy.sda.app12;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vendos tekstin: ");
        String text = scanner.nextLine();

        System.out.println("Teksti ka "+ llogaritNumrinEHapsirave(text) + " hapesira");
        System.out.println("Perqindja  e hapesires ne tekstin e vendosur eshte: "+ llogaritPerqindjenEHapesirave(text));
    }

    public static int llogaritNumrinEHapsirave(String text){
        int count = 0;
        for(int i = 0;  i < text.length(); i++){
            // text.charAt(i) == ' '
            if(Character.isSpaceChar(text.charAt(i))){
                count++;
            }
        }
        return count;
    }

    public static double llogaritPerqindjenEHapesirave(String text){
        return ((double)llogaritNumrinEHapsirave(text)/text.length())*100;
    }
}
