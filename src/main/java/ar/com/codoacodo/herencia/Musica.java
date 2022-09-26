package ar.com.codoacodo.herencia;

import java.util.Arrays;

public class Musica extends Articulo{

	//ATRIBUTOS DE LA CLASE
	
	private String sello;
	private String[] temas;
	
	
	//CONSTRUCTORES DE LA CLASE
	
	public Musica(String titulo, String autor, String img, float precio, String sello, String[] temas) {
		super(titulo, autor, img, precio);
		this.setSello(sello) ;
		this.setTemas(temas);
	}


	public String getSello() {
		return sello;
	}


	public void setSello(String sello) {
		this.sello = sello;
	}


	public String[] getTemas() {
		return temas;
	}


	public void setTemas(String[] temas) {
		this.temas = temas;
	}


	@Override
	public String toString() {
		return super.toString()+ " Musica [sello=" + sello + ", temas=" + Arrays.toString(temas) + "]";
	}
	
	
	
	
}
