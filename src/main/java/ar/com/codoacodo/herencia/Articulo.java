package ar.com.codoacodo.herencia;

public class Articulo {
	
	//ATRIBUTOS DE LA CLASE
	
	private String titulo;
	private String autor;
	private String img;
	private float precio;
	
	
	//CONSTRUCTORES DE LA CLASE
	
	


	public Articulo(String titulo, String autor, String img, float precio) {
		this.setNombre(titulo) ;
		this.setAutor(autor);
		this.setImg(img);
		this.setPrecio(precio);
	}

	
	//GETTER AND SETTER DE LA CLASE



	public String getNombre() {
		return titulo;
	}



	public void setNombre(String nombre) {
		this.titulo = nombre;
	}



	public String getAutor() {
		return autor;
	}



	public void setAutor(String autor) {
		this.autor = autor;
	}



	public String getImg() {
		return img;
	}



	public void setImg(String img) {
		this.img = img;
	}



	public float getPrecio() {
		return precio;
	}



	public void setPrecio(float precio) {
		this.precio = precio;
	}



	//metodos de la clase
	
	@Override
	public String toString() {
		return "Articulo [titulo=" + titulo + ", autor=" + autor + ", img=" + img + ", precio=" + precio + "]";
	}
	


}
