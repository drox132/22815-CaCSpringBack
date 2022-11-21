package herencia;

import ar.com.poo.Articulo;

public class Pelicula extends Articulo{
	
	private String productora;
	private String formato;

	public Pelicula() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Pelicula(String img, String titulo, String autor, float precio) {
		super(img, titulo, autor, precio);
		// TODO Auto-generated constructor stub
	}
	
	public Pelicula(String img, String titulo, String autor, float precio, String productora, String formato) {
		super(img, titulo, autor, precio);
		// TODO Auto-generated constructor stub
		this.setProductora(productora);
		this.setFormato(formato);
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
		return super.toString()+ "Pelicula [productora=" + productora + ", formato=" + formato + "]";
	}

	
	
}
