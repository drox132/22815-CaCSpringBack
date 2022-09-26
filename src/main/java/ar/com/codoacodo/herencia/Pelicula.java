package ar.com.codoacodo.herencia;

public class Pelicula  extends Articulo{
	
	//ATRIBUTOS DE LA CLASE
	
	private String productora;
	private String formato;

	//CONSTRUCTOR DE LA CLASE

	public Pelicula(String titulo, String autor, String img, float precio, String productora, String formato) {
		super(titulo, autor, img, precio);
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
		return super.toString()+ " Pelicula [productora=" + productora + ", formato=" + formato + "]";
	}
	
	
	
}
