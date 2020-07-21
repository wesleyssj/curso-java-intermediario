package com.wesley.cursojava.aula_85_100;

import java.util.Date;

public class Aula86Date {
    public static void main(String[] args) {

        Date hoje = new Date();

        System.out.println(hoje);

        System.out.println("Milisegundos desdes 1 de Janeiro de 1970 " + hoje.getTime());

        System.out.println(hoje.getDate());

    }
}
