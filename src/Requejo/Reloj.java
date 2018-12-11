package Requejo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Reloj {

	private int Horas;
	private int Minutos;
	private int Segundos;
	
	
	public void write() {
		
		// Copiar ficheros
		File origen = new File("origen.txt");
		File destino = new File("destino.txt");

		try {
		  InputStream in = new FileInputStream(origen);
		  OutputStream out = new FileOutputStream(destino);
						
		  byte[] buf = new byte[1024];
		  int len;

		  while ((len = in.read(buf)) > 0) {
		    out.write(buf, 0, len);
		  }
				
		  in.close();
		  out.close();
		} catch (IOException ioe){
		  ioe.printStackTrace();
		}

		
	}
	
	
	public Reloj(int horas, int minutos, int segundos) {
		super();
		Horas = horas;
		Minutos = minutos;
		Segundos = segundos;
	}

	public int getHoras() {
		return Horas;
	}

	public void setHoras(int horas) {
		Horas = horas;
	}

	public int getMinutos() {
		return Minutos;
	}

	public void setMinutos(int minutos) {
		Minutos = minutos;
	}

	public int getSegundos() {
		return Segundos;
	}

	public void setSegundos(int segundos) {
		Segundos = segundos;
	}
	
}
