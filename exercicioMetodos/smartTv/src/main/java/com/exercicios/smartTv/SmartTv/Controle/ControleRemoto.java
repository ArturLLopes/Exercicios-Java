package com.exercicios.smartTv.SmartTv.Controle;

import com.exercicios.smartTv.SmartTv.SmartTv;

public class ControleRemoto {
    private final SmartTv tv;

    public ControleRemoto(SmartTv tv) {
        this.tv = tv;
    }

    public void  ligar(){
        tv.ligada = true;
    }
    public void desligar(){
        tv.ligada = false;
    }

    public void aumentarVolume() {
        tv.aumentarVolume();
    }
    public void diminuirVolume() {
        tv.diminuirVolume();
    }

    public void aumentarCanal() {
        tv.aumentarCanal();
    }
    public void diminuirCanal() {
        tv.diminuirCanal();
    }
    public void mudarCanal (int novoCanal){
        tv.mudarCanal(novoCanal);
        System.out.println("Voce esta no canal " + novoCanal);
    }
}
