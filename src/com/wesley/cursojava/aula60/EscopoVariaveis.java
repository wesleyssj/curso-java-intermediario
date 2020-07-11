package com.wesley.cursojava.aula60;

public class EscopoVariaveis {

    private int valor;

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int calculaValor(int valor){

        valor = valor + 10;

        return valor;
    }

    public int teste(){

        int valor = 5;

        if(true){
            valor--;
        }
        return valor;
    }

    public void outroTeste(){

        for(int i = 0; i < 10; i++){
            int j;
            System.out.println(i);
        }

        //i++; //erro.

        int j;
        for(j=0; j<10; j++){
            System.out.println(j);
        }

        System.out.println(j); //j tem valor 10
    }

    public void maisUmTeste(){
        boolean flag = true;

        if(flag){
            int umaVariavel = 10;

            umaVariavel++;

            System.out.println(umaVariavel);
        }

        //System.out.println(umaVariavel);//erro de compilação
    }

    public void maisUmOutroTeste(int num){
        int total = 0;

        try{
            int outroNum = 0;

            total = num/outroNum;
        }catch (Exception e){
            e.printStackTrace();
        }finally{

            total++;
            //outroNum++; //erro de compilação
            //e.printStackTrace();//erro de compilação
        }

        num++;
        //outroNum++; //erro de compilação.
        //e.printStackTrace(); //erro de compilação.
    }
}
