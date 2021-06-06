package ar.unrn.obs;

import ar.unrn.model.Observer;

public class ConsoleTemperatura implements Observer{

	@Override
	public void guardarLectura(String valor) {
		String lines[] = valor.split(" ");
		System.out.println(lines[0]);
		int temperatura = Integer.parseInt(lines[0]);
		
		if(temperatura < 12) {
			System.out.println("Hace frio, se encenderá la caldera");
		}else
			if(temperatura > 17) {
				System.out.println("Hace calor, se encenderá el aire acondicionado");
			}
	}

}
