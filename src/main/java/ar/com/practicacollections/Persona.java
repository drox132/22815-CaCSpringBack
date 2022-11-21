package ar.com.practicacollections;

import java.util.ArrayList;
import java.util.Collection;

public class Persona {

	/*ATRIBUTOS*/
	private String nombre;
	private int edad;
	private IIdioma idiomaNativo;
	private Collection<IIdioma> nuevosIdiomasAprendidos;
	
	
	/*CONSTRUCTOR DE LA CLASE*/
	public Persona(String nombre, int edad, IIdioma idiomaNativo) {
		this.setNombre(nombre);
		this.setEdad(edad);
		this.setIdiomaNativo(idiomaNativo);
		if(getNuevosIdiomasAprendidos()==null) {
			this.nuevosIdiomasAprendidos = new ArrayList<>();
		}
		
	}
	/*GETTER Y SETTER*/
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public IIdioma getIdiomaNativo() {
		return idiomaNativo;
	}
	public void setIdiomaNativo(IIdioma idiomaNativo) {
		this.idiomaNativo = idiomaNativo;
	}
	public Collection<IIdioma> getNuevosIdiomasAprendidos() {
		return nuevosIdiomasAprendidos;
	}
	public void setNuevosIdiomasAprendidos(Collection<IIdioma> nuevosIdiomasAprendidos) {
		this.nuevosIdiomasAprendidos = nuevosIdiomasAprendidos;
	}
	
	
	@Override
	public String toString() {
		return "Persona [\n nombre=" + nombre + ",\n edad=" + edad + ",\n idiomaNativo=" + idiomaNativo.getClass().getSimpleName()
				+ ",\n nuevosIdiomasAprendidos=" + nuevosIdiomasAprendidos.size() + "\n]";
	}
	/*METODOS DE LA CLASE PERSONA*/
	public void aprender(IIdioma nuevoIdioma) throws IdiomaDuplicadoException {
		
		if(getIdiomaNativo().getClass().equals(nuevoIdioma.getClass())) {
			throw new IdiomaDuplicadoException("El Idioma que intenta aprender ya es nativo");
		}
		
		for(IIdioma idioma : getNuevosIdiomasAprendidos()) {
		
			if(idioma.getClass().equals(nuevoIdioma.equals(nuevoIdioma))) {
				throw new IdiomaDuplicadoException("El idioma que intenta aprender ya ha sido aprendido");
			}
		}
		getNuevosIdiomasAprendidos().add(nuevoIdioma);
		
	}
	public void decir(String palabra) {
		/*decir la palabra en el idioma nativo*/
		getIdiomaNativo().hablar(palabra);
		
		/*tambien debe dewcir la palabra en todos los idiomas que conozca*/
		for(IIdioma idioma: getNuevosIdiomasAprendidos()) {
			idioma.hablar(palabra);
		}
	}
	
}
