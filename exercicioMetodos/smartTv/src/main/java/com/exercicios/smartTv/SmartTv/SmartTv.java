package com.exercicios.smartTv.SmartTv;


public class SmartTv {
    public boolean ligada;

    public int canal = 1;
    private static final int MAX_CANAL = 100;
    private static final int MIN_CANAL = 1;
    public int volume = 25;
    private static final int MAX_VOLUME = 100;
    private static final int MIN_VOLUME = 0;



    public void aumentarVolume() {
        if (volume < MAX_VOLUME) volume++;
    }
    public void diminuirVolume() {
        if (volume > MIN_VOLUME) volume--;
    }

    public void aumentarCanal(){
        if (volume < MAX_CANAL) canal++;
    }
    public void diminuirCanal(){
        if (volume > MIN_CANAL) canal--;
    }

    public void mudarCanal (int novoCanal){
        canal = novoCanal;
    }
}
