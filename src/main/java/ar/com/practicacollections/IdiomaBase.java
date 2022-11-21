package ar.com.practicacollections;

import java.util.HashMap;
import java.util.Map;

public abstract class IdiomaBase {

	//ATRIBUTOS
	protected String nombre;
	protected Map<String,String> map;
	
	
	//CONSTRUCTOR DE LA CLASE
	public IdiomaBase(String nombre) {
		this.setNombre(nombre);
		if(getMap()==null) {
			this.map = new HashMap<>();
		}
		crearGeneracionPalabras();
		
	}


	//getter y setter de la clase
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public Map<String, String> getMap() {
		return map;
	}


	public void setMap(Map<String, String> map) {
		this.map = map;
	}
	
	public abstract void crearGeneracionPalabras();
	
	

}
