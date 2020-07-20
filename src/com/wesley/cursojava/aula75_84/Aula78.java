package com.wesley.cursojava.aula75_84;

import javax.sound.midi.Soundbank;

public class Aula78 {
    public static void main(String[] args) {

        String ola = "Olá";
        String ola2 = "OLÁ";
        String ola3 = "Olá";
        String ola4 = new String(ola);

        System.out.println("ola equals ola2 = " + ola.equals(ola2)); //false
        System.out.println("ola equals ola2 = " + ola.equals(ola3)); //true

        System.out.println("ola equals ola2 = " + ola.equalsIgnoreCase(ola2)); //true

        System.out.println("ola == ola1" + (ola == ola2)); //false
        System.out.println("ola == ola3" + (ola == ola3));//True

        System.out.println("ola == ola4 " + (ola == ola2));
        System.out.println("ola equals ola4 = " + ola.equals(ola4));

        String banana = "banana";
        String ana = "ana";
        String ban = "ban";

        System.out.println(banana.regionMatches(1, ana, 0, 3));
        System.out.println(banana.regionMatches(2, ana, 1, 2));
        System.out.println(banana.regionMatches(true, 0, ban, 0, 3));

        System.out.println(banana.endsWith(ana));
        System.out.println(banana.startsWith(ban));

        String a = "a";
        String b = "b";
        String aMaiusculo = "A";

        System.out.println(a.compareTo(b));
        System.out.println(a.compareTo(a));
        System.out.println(a.compareTo("b"));
        System.out.println(a.compareTo(aMaiusculo));

    }

}
