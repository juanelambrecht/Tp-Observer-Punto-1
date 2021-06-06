package ar.unrn.obs;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import ar.unrn.model.Observer;

public class DiscoLecturaTemperatura implements Observer{

	@Override
	public void guardarLectura(String valor) {
		try {
			valor = "\nTemperatura: " + valor + " Fecha: " +  LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyy HH:mm:ss"));
			
			Files.write(Paths.get(new File("Lectura Temperatura.txt").getAbsolutePath()), valor.getBytes(), StandardOpenOption.APPEND);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
