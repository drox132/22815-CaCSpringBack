package ar.com.practicacollections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class DBUtil {
	//ATRIBUTOS
	private Collection<Persona> listadoPersonas;
	//private Map<IIdioma, Collection<Persona>> reporte;
	
	
	
	//CONSTRUCTOR
	public DBUtil() {
		this.listadoPersonas = new ArrayList<>();
		//this.reporte = new HashMap<>();
	}

	
	public Collection<Persona> getListadoPersonas() {
		return listadoPersonas;
	}


	public void setListadoPersonas(Collection<Persona> listadoPersonas) {
		this.listadoPersonas = listadoPersonas;
	}


	/*
	 * public Map<IIdioma, Collection<Persona>> getReporte() { return reporte; }
	 * 
	 * 
	 * public void setReporte(Map<IIdioma, Collection<Persona>> reporte) {
	 * this.reporte = reporte; }
	 */

	public void agregarPersona (Persona newPersona) {
			listadoPersonas.add(newPersona);
	}
	
	/*
	 * private void agregarListadoPersonasMapa(IIdioma idioma) { for (Persona p:
	 * listadoPersonas) {
	 * if(p.getIdiomaNativo().getClass().equals(idioma.getClass())||
	 * p.getNuevosIdiomasAprendidos().getClass().equals(idioma.getClass())) {
	 * getReporte().put(idioma, ) ) } } }
	 */
	
	
}
