package com.academy.sda.app11;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vendos nje tekst: ");
        String inputText = "";
        String maxInputLengthText = "";

        while(!inputText.equals("Enough!")){
          inputText = scanner.nextLine();
          if(inputText.length() > maxInputLengthText.length() && !inputText.equals("Enough!")){
              maxInputLengthText = inputText;
          }
        }

        if(maxInputLengthText == ""){
            System.out.println("Perdoruesi nuk beri vendosi asnje tekst!");
        }
        else {
            System.out.println("Teksti me i gjate eshte: " + maxInputLengthText);
        }
    }
}
