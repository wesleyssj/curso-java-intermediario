package com.wesley.cursojava.aula_85_100;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Locale;

public class Aula91DateFormat {
    public static void main(String[] args) {

        Date hoje = new Date();

        System.out.println(Locale.getDefault());

        System.out.println("****************");

        String hojeFormatado = DateFormat.getInstance().format(hoje);
        System.out.println(hojeFormatado);

        System.out.println("****************");

        hojeFormatado = DateFormat.getTimeInstance().format(hoje);
        System.out.println(hojeFormatado);

        System.out.println("****************");

        hojeFormatado = DateFormat.getDateInstance().format(hoje);
        System.out.println(hojeFormatado);

        System.out.println("****************");

        hojeFormatado = DateFormat.getDateTimeInstance().format(hoje);
        System.out.println(hojeFormatado);

        System.out.println("****************");

        hojeFormatado = DateFormat.getTimeInstance(DateFormat.SHORT).format(hoje);
        System.out.println(hojeFormatado);

        System.out.println("****************");

        hojeFormatado = DateFormat.getTimeInstance(DateFormat.MEDIUM).format(hoje);
        System.out.println(hojeFormatado);

        System.out.println("****************");

        hojeFormatado = DateFormat.getTimeInstance(DateFormat.LONG).format(hoje);
        System.out.println(hojeFormatado);

        System.out.println("****************");

        hojeFormatado = DateFormat.getDateTimeInstance(DateFormat.MEDIUM
        , DateFormat.SHORT).format(hoje);
        System.out.println(hojeFormatado);

        System.out.println("****************");

        String data = "12-02-2017 14:25";
        try {
            Date dataDate = DateFormat.getInstance().parse(data);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
