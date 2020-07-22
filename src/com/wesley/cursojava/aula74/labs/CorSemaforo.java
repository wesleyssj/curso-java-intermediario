package com.wesley.cursojava.aula74.labs;

public enum CorSemaforo {

    VERDE(4000), AMARELO(1500), VERMELHO(6000);

    private int tempoEspera;

    CorSemaforo(int tempoEspera){
        this.tempoEspera = tempoEspera;
    }

    public int getTempoEspera() {
        return tempoEspera;
    }
}
