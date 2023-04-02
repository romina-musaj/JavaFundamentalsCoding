package com.academy.sda.app14;

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        //1.Deklarim I nje variabli te tipit scanner dhe inicializim1.	Deklarim I nje variabli te tipit scanner dhe inicializim
        Scanner scanner = new Scanner(System.in);
       // 2.Te marrim inputin e pare nga perdoruesi dhe te llogarisin ascii code
        System.out.println("Vendos karakterine pare te alfabetin latin ne shkronje te vogel: ");
        char shkronjaEPare = scanner.next().charAt(0);
        int asciiCodeShkronjaPare = shkronjaEPare;
        //3. Verfikojme nese inputi i pare qe perdoruesi ka vendosur eshte i sakte - nuk eshte me shkronje te madhe ose nje karakter qe nuk perfshihet ne alfabetin latin
        while(eshteKarakterIVlefshem(asciiCodeShkronjaPare)){
            //4. I kerkojme perdoruesit te rivendosi inputin e pare nese nuk i sakte dhe rillogarisin ascii code
            System.out.println("Karakteri i pare i vendosur nuk eshte i sakte! Ju lutem vendosni nje karakter te sakte!");
            shkronjaEPare = scanner.next().charAt(0);
            asciiCodeShkronjaPare = shkronjaEPare;
        }
        //5. I kerkojme perdoruesit te vendosi inputin e dyte dhe te llogarisim ascii code
        System.out.println("Vendos karakterin e dyte te alfabetit latin ne shkronje te vogel: ");
        char shkronjaEDyte = scanner.next().charAt(0);
        int asciiCodeShkronjaDyte = shkronjaEDyte;
        //6. Verifikojme nese inputi i dyte qe perdoruesi ka vendosur eshte i sakte
        while(eshteKarakterIVlefshem(asciiCodeShkronjaDyte)){
            // 7. I kerkojme ta rivendose nese inputi i dyte qe perdoruesi ka vendosur eshte i sakte dhe rillogarisim ascii code
            System.out.println("Karakteri i dyte i vendosur nuk eshte i sakte! Ju lutem vendosni nje karakter te sakte!");
            shkronjaEDyte = scanner.next().charAt(0);
            asciiCodeShkronjaDyte = shkronjaEDyte;
        }

        //8. Afishim i mesazhit te perdoruesi
        System.out.println("Midis shkronjave "+shkronjaEPare + " dhe "+shkronjaEDyte + " ka " + llogaritShkronjatMidis(asciiCodeShkronjaPare, asciiCodeShkronjaDyte) + " shkronja");

    }


    public static boolean  eshteKarakterIVlefshem(int kodi){
        return (kodi < 97 || kodi > 122);
    }

    public static int llogaritShkronjatMidis(int kodiPare, int kodiDyte){
        return Math.abs(kodiDyte - kodiPare - 1);

    }

}
