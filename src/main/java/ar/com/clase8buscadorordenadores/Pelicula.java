package clase8buscadorordenadores;

import java.util.Date;

public class Pelicula extends Articulo {

	private String productora;
	private String formato;
	
	public Pelicula(String img, String titulo, String autor, float precio,Integer cantidadVendidos,Date fechaPublicacion) {
		super(img, titulo, autor, precio,cantidadVendidos, fechaPublicacion);
	}

	
	public Pelicula(String img, String titulo, String autor, float precio,Integer cantidadVendidos, String productora, String formato,Date fechaPublicacion) {
		super(img, titulo, autor, precio,cantidadVendidos, fechaPublicacion);
		setProductora(productora);;
		setFormato(formato);
	}


	public String getProductora() {
		return productora;
	}

	public void setProductora(String productora) {
		this.productora = productora;
	}

	public String getFormato() {
		return formato;
	}

	public void setFormato(String formato) {
		this.formato = formato;
	}


	@Override
	public String toString() {
		return super.toString()+ " Peliculas [productora=" + productora + ", formato=" + formato + "]";
	}
	
	
	

}
