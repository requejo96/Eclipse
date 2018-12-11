package Requejo;

public class Requejo {

	private String Nombre;
	private String Apellidos;
	private int DNI;
	
	public Requejo(String nombre, String apellidos, int dNI) {
		super();
		Nombre = nombre;
		Apellidos = apellidos;
		DNI = dNI;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getApellidos() {
		return Apellidos;
	}

	public void setApellidos(String apellidos) {
		Apellidos = apellidos;
	}

	public int getDNI() {
		return DNI;
	}

	public void setDNI(int dNI) {
		DNI = dNI;
	}
	
}