package clase9;

import java.util.Date;

public class Articulo {

	private String img;
	private String titulo;
	private String Autor;
	private Float precio;
	private Integer cantidadVendidos;
	private Date fechaPublicacion;
	
	public Articulo(String img, String titulo, String autor, Float precio, Integer cantidadVendidos,
			Date fechaPublicacion) {
		this.img = img;
		this.titulo = titulo;
		Autor = autor;
		this.precio = precio;
		this.cantidadVendidos = cantidadVendidos;
		this.fechaPublicacion = fechaPublicacion;
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

	public Float getPrecio() {
		return precio;
	}

	public void setPrecio(Float precio) {
		this.precio = precio;
	}

	public Integer getCantidadVendidos() {
		return cantidadVendidos;
	}

	public void setCantidadVendidos(Integer cantidadVendidos) {
		this.cantidadVendidos = cantidadVendidos;
	}

	public Date getFechaPublicacion() {
		return fechaPublicacion;
	}

	public void setFechaPublicacion(Date fechaPublicacion) {
		this.fechaPublicacion = fechaPublicacion;
	}
	
	

	
}

