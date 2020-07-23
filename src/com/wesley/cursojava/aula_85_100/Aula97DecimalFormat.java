package com.wesley.cursojava.aula_85_100;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class Aula97DecimalFormat {
    public static void main(String[] args) {

        String padrao = "###,###.##";
        DecimalFormat df = new DecimalFormat(padrao);

        //df.applyPattern(padrao);
        System.out.println(df.format(1234567890.12));

        DecimalFormatSymbols dfs = new DecimalFormatSymbols(new Locale("pt", "Brazil"));
        dfs.setDecimalSeparator(',');
        dfs.setGroupingSeparator('.');

        df = new DecimalFormat(padrao, dfs);
        System.out.println(df.format(1234567890.123));

    }
}
