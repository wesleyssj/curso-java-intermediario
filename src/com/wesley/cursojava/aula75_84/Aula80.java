package com.wesley.cursojava.aula75_84;

public class Aula80 {
    public static void main(String[] args) {

        String teste = "Isso é um Teste.";

        System.out.println(teste);
        System.out.println(teste.substring(10));
        System.out.println(teste.substring(10, 15));

        String ola = "olá";
        String mundo = " mundo";
        String olaMundo = ola.concat(mundo);
        System.out.println(olaMundo);

        String espacos = "i s pa ç o";
        String semEspacos = espacos.replace('i', 'e');
        System.out.println(semEspacos);

        semEspacos = semEspacos.replaceAll(" ", "");
        System.out.println(semEspacos);

        String nome = " meu nome é: ";
        System.out.println(nome);
        System.out.println(nome.trim());

    }
}
