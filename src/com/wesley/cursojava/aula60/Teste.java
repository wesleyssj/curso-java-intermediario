package com.wesley.cursojava.aula60;

public class Teste {
    public static void main(String[]args){

        EscopoVariaveis escopo = new EscopoVariaveis();
        escopo.setValor(10);

        System.out.println(escopo.getValor());//10

        System.out.println(escopo.calculaValor(20));//20 ou 30

        System.out.println(escopo.getValor());//10 ou 20

        System.out.println(escopo.teste());

        System.out.println(escopo.getValor());

    }


}
