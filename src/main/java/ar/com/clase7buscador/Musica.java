package clase7buscador;

import java.util.Arrays;

public class Musica extends Articulo {
	private String sello;
	private String [] temas;
	

	public Musica(String img, String titulo, String autor, float precio,Integer cantidadVendidos) {
		super(img, titulo, autor, precio,cantidadVendidos);
		// TODO Auto-generated constructor stub
	}


	public Musica(String img, String titulo, String autor, float precio,Integer cantidadVendidos, String sello, String[] temas) {
		super(img, titulo, autor, precio,cantidadVendidos);
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
