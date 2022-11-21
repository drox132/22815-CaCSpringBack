package interfacePoo;

public class Consola {
	private String nombre;
	private String marca;
	private boolean encendida;
	
	public Consola(String nombre, String marca) {
		this.nombre = nombre;
		this.marca = marca;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public boolean isEncendida() {
		return encendida;
	}

	public void setEncendida(boolean encendida) {
		this.encendida = encendida;
	}
	
	
}
