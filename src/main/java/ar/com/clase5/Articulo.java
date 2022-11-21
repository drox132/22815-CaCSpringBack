package clase5;

public class Articulo {

	private String img;
	private String titulo;
	private String Autor;
	private float precio;
	
	public Articulo(String img, String titulo, String autor, float precio) {
		this.img = img;
		this.titulo = titulo;
		Autor = autor;
		this.precio = precio;
	}
	
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return Autor;
	}
	public void setAutor(String autor) {
		Autor = autor;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Articulo [img=" + img + ", titulo=" + titulo + ", Autor=" + Autor + ", precio=" + precio + "]";
	}
	
	
	

}
