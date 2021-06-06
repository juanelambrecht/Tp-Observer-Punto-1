package ar.unrn.obs;

import java.util.List;

import ar.unrn.model.ClimaOnline;
import ar.unrn.model.Medidor;
import ar.unrn.model.Observer;

public class Temperatura {
	private List<Observer> monitores;
	private ClimaOnline climaOnline;

	public Temperatura(List<Observer> monitores, ClimaOnline climaOnline) {
		super();
		this.monitores = monitores;
		this.climaOnline = climaOnline;
	}
	
	public void lecturaTemperatura() {
		Medidor medidor = new Medidor(this.climaOnline, this.monitores);
		
		medidor.leerTemperatura();
	}
}
