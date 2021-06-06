package ar.unrn.model;

import java.util.List;

public class Medidor extends Observable{
	private String temperatura;
	private ClimaOnline clima;

	
	public Medidor(ClimaOnline clima, List<Observer> monitores) {
		this.clima = clima;
		
		for (Observer observer : monitores) {
	         this.agregarObservador(observer);
	     }	
	}

	public String leerTemperatura() {
		//leo la temperatura del servicio web
		this.temperatura = this.clima.temperatura();
		this.comunicarObserver(temperatura);
		return this.temperatura;
	}
	
	
}
