package ar.unrn.main;

import java.util.List;

import ar.unrn.model.WeatherChannelService;
import ar.unrn.obs.ConsoleTemperatura;
import ar.unrn.obs.DiscoLecturaTemperatura;
import ar.unrn.obs.Temperatura;

public class Main {

	public static void main(String[] args) {
		new Temperatura(List.of(new DiscoLecturaTemperatura(), new ConsoleTemperatura()),
				new WeatherChannelService()).lecturaTemperatura();
	}

}
