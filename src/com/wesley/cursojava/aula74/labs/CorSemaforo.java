package com.wesley.cursojava.aula74.labs;

public enum CorSemaforo {

    VERDE(6000), AMARELO(2500), VERMELHO(8000);

    private int tempoEspera;

    CorSemaforo(int tempoEspera){
        this.tempoEspera = tempoEspera;
    }

    public int getTempoEspera() {
        return tempoEspera;
    }
}
