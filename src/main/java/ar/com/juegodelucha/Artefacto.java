package ar.com.juegodelucha;

public  class Artefacto {

	protected String nombre;
	protected Integer unidadLucha;
	
	public Artefacto(String nombre, Integer unidadLucha) {
		setNombre(nombre);
		setUnidadLucha(unidadLucha);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getUnidadLucha() {
		return unidadLucha;
	}

	public void setUnidadLucha(Integer unidadLucha) {
		this.unidadLucha = unidadLucha;
	}
	
	
	
	

}
