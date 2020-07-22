package com.wesley.cursojava.aula_85_100;

import com.sun.xml.internal.bind.v2.model.core.ID;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

public class Aula92TimeZone {

    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();
        TimeZone tz = calendar.getTimeZone();

        System.out.println(tz); //pt_BR

        System.out.println("*****************************");

        /*String[] fusos = TimeZone.getAvailableIDs();
        for(String fuso : fusos){
            System.out.println(fuso);
        }*/

        TimeZone tzSP = TimeZone.getTimeZone("America/Sao_paulo");

        System.out.println(tzSP.getDisplayName());

        System.out.println("*****************************");

        System.out.println(tzSP.getID());

        System.out.println("*****************************");

        Calendar agora = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy hh:mm:ss a z");
        System.out.println(sdf.format(agora.getTime()));

        System.out.println("*****************************");

        Calendar agoraSP = Calendar.getInstance(tzSP);
        System.out.println(agoraSP.getTimeZone());
        System.out.println(sdf.format(agoraSP.getTime()));

        System.out.println("*****************************");

        agoraSP.add(Calendar.HOUR_OF_DAY, tzSP.getOffset(System.currentTimeMillis()) / 1000 / 60/ 60);
        System.out.println(sdf.format(agoraSP.getTime()));


    }
}
