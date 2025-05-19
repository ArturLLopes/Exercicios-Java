package com.exercicios.smartTv;

import com.exercicios.smartTv.SmartTv.Controle.ControleRemoto;
import com.exercicios.smartTv.SmartTv.SmartTv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class ExercicioSmartTvApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExercicioSmartTvApplication.class, args);

		SmartTv smartTv = new SmartTv();
		ControleRemoto controle = new ControleRemoto(smartTv);


		System.out.println("Tv Ligada? " + smartTv.ligada);

		System.out.println("Canal atual: " + smartTv.canal);
		controle.aumentarCanal();
		System.out.println("Canal atual: " + smartTv.canal);
		controle.mudarCanal(4);

		System.out.println("Volume atual: " + smartTv.volume);

		controle.ligar();
		System.out.println("Tv Ligada? " + smartTv.ligada);

		controle.aumentarVolume();
		controle.aumentarVolume();
		System.out.println("Volume atual: " + smartTv.volume);


		controle.desligar();
		System.out.println("Tv Ligada? " + smartTv.ligada);
	}

}
