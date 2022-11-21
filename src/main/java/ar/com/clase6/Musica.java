package clase6;

import java.util.Arrays;

import clase5.Articulo;

public class Musica extends Articulo {
	private String sello;
	private String [] temas;
	

	public Musica(String img, String titulo, String autor, float precio) {
		super(img, titulo, autor, precio);
		// TODO Auto-generated constructor stub
	}


	public Musica(String img, String titulo, String autor, float precio, String sello, String[] temas) {
		super(img, titulo, autor, precio);
		setSello(sello);
		setTemas(new String [] {});;
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
