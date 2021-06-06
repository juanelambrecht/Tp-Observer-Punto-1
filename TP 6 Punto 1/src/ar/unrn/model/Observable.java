package ar.unrn.model;

import java.util.ArrayList;
import java.util.List;

public abstract class Observable {

	private List<Observer> observadores;
	
	public Observable() {
		observadores = new ArrayList<>();
	}
	
	public void agregarObservador(Observer obs) {
		this.observadores.add(obs);
	}
	
	protected void comunicarObserver(String valor) {
		for (Observer observer : observadores) {
			observer.guardarLectura(valor);
		}
	}
}