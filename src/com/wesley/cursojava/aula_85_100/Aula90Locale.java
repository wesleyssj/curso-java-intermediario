package com.wesley.cursojava.aula_85_100;

import java.text.NumberFormat;
import java.util.Locale;

public class Aula90Locale {
    public static void main(String[] args) {

        //dd/MM/yyyy no Brasil
        //MM/dd/yyyy no EUA

        //1.000,02 no Brasil
        //1,000.00 no EUA

        Locale locale = Locale.getDefault();

        System.out.println(locale);

        Locale[] locales = Locale.getAvailableLocales();
        for(Locale loc : locales){
            System.out.println("Nome: " + locale.getDisplayName());
            System.out.println("Código da Língua: " + locale.getLanguage());
            System.out.println("Língua: " + locale.getDisplayName());
            System.out.println("Cód País: " + loc.getDisplayCountry());

            System.out.println("********************************************");
        }

        Locale br = new Locale("pt", "Brazil");

        System.out.println(br);

        Locale.setDefault(br);

        System.out.println(Locale.getDefault());

        NumberFormat nf = NumberFormat.getCurrencyInstance();
        System.out.println(nf.format(5000000000000000d));

        NumberFormat nf1 = NumberFormat.getCurrencyInstance(Locale.US);
        System.out.println(nf1.format(5000000000000000d));
    }
}
