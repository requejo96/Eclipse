package Requejo;

import java.util.ArrayList;

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
	
	public void print() {
		int numEquipos = 5;

		ArrayList<String> liga = new ArrayList<>();
		ArrayList<String> liga2 = new ArrayList<>();

		System.out.println();

		for(int i = 0; i < numEquipos; i++) {
			System.out.print("Dime el equipo número " + (i + 1) + ": ");
			//liga.add(Entrada.cadena());
		}

		liga2 =  liga;

		System.out.println("\n\tArrayList liga: " + liga);
		System.out.println("\tArrayList liga2: " + liga2);

		System.out.println("\n\tCantidad de valores del ArrayList liga: " + liga.size());

		liga.remove(4);
		System.out.println("\n\tPosición 4 del ArrayList liga borrado: " + liga);

		System.out.print("\nDime un nuevo equipo para la posición 2 del ArrayList: ");
		//String posicion2 = Entrada.cadena();
		//liga.set(2, posicion2);
		System.out.println("\n\tosicón 2 del ArrayList liga sustituido: " + liga);

		System.out.print("\nDime el equipo que esta en la posicion 3 del Arralist: ");
		//String posicion3 = Entrada.cadena();
		//liga.remove(posicion3);
		System.out.println("\n\tArrayList liga con la posición 3 borrada: " + liga);

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
