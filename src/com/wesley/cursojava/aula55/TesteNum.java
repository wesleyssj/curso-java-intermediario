package com.wesley.cursojava.aula55;

public class TesteNum {

    public static void main(String[]args){

        DiaSemana[] dias = DiaSemana.values();

        for(int i = 0; i < dias.length; i++){
            System.out.println(dias[i]);
        }

        System.out.println("----------------");

        for(DiaSemana dia : DiaSemana.values()){
            System.out.println(dia);
        }
    }
}
