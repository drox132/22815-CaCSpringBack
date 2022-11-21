package clase7;

public class Tablet implements IJugable {

	private String nombre;
	private Integer anio;
	
	
	public Tablet(String nombre, Integer anio) {
		setNombre(nombre);
		setAnio(anio);
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public Integer getAnio() {
		return anio;
	}


	public void setAnio(Integer anio) {
		this.anio = anio;
	}


	@Override
	public void jugar() {
		System.out.println("jugando  con tablet "+ getNombre() +"-"+ "año "+getAnio());

	}

}
