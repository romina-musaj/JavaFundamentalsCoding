package com.academy.sda.app18;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task18 {
    public static void main(String[] args) {
      // Deklarimi dhe Inicializim i nje objekti te tipit Pattern qe do permbaje regular expression qe vendosem
    Pattern pattern = Pattern.compile("acho+!");
    // Deklarim dhe Inicializim i nje objekti te tipit Scanner qe do ta perdorim me pas per te marre inpute nga perdoruesi
    Scanner scanner = new Scanner(System.in);
    // Afishim i mesazhit nga perdoruesi per te vendosur tekstin ose mesazhin
    System.out.println("Vendos mesazhin: ");
    // Marrja e vleres nga perdoruesi duke perdorur metoden nextLine dhe ruajtja e vleres tek variabli i deklaruar me emrin mesazhi
    String mesazhi = scanner.nextLine();
    // Deklarim dhe inicializim i nje objekti te tipit Matcher
    Matcher matcher =  pattern.matcher(mesazhi);
    // Verifikojme duke perdorur metoden matches nese teksti qe perdoruesi vendosi perputhet me formatin e kerkuar nga regular expression
    if(matcher.matches()){
        // Nese mesazhi perputhet do afishojme te perdoruesi mesazhin e meposhtem
        System.out.println("It sneezed!!");
    }
    }
}
