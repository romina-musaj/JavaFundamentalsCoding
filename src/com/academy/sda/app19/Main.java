package com.academy.sda.app19;

public class Main {
    public static void main(String[] args) {
        Poem poemaPare = new Poem(new Author("Musaj"), 20);
        Poem poemaDyte = new Poem(new Author("Lamaj"), 40);
        Poem poemaTrete = new Poem(new Author("sda academy"), 40);
        Poem[] listaPoemave = new Poem[]{poemaPare, poemaDyte, poemaTrete};
        int max = 0;
        for(Poem poem: listaPoemave){
            if(poem.getStropheNumbers() > max){
                max = poem.getStropheNumbers();
            }
        }

        System.out.println("Autori/et qe ka shkruajtur me shume vargje eshte/jane : ");

        for(Poem poem: listaPoemave){
            if(poem.getStropheNumbers() == max){
                System.out.println(poem.getCreator().getSurname());
            }
        }

    }
}
