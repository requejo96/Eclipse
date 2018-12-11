package Requejo;

public class Reloj {

	private int Horas;
	private int Minutos;
	private int Segundos;
	
	
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
