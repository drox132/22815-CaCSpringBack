package clase8buscadorordenadores;

import java.util.Date;

public class Articulo implements Comparable<Articulo>{

	private String img;
	private String titulo;
	private String Autor;
	private Float precio;
	private Integer cantidadVendidos;
	private Date fechaPublicacion;
	
	
	
	@Override
	public String toString() {
		return "Articulo [img=" + img + ", titulo=" + titulo + ", Autor=" + Autor + ", precio=" + precio
				+ ", cantidadVendidos=" + cantidadVendidos + ", fechaPublicacion=" + fechaPublicacion + "]";
	}

	public Articulo(String img, String titulo, String autor, Float precio, Integer cantidadVendidos,
			Date fechaPublicacion) {
		this.img = img;
		this.titulo = titulo;
		Autor = autor;
		this.precio = precio;
		this.cantidadVendidos = cantidadVendidos;
		this.fechaPublicacion = fechaPublicacion;
	}

	public Date getFechaPublicacion() {
		return fechaPublicacion;
	}

	public void setFechaPublicacion(Date fechaPublicacion) {
		this.fechaPublicacion = fechaPublicacion;
	}

	public Integer getCantidadVendidos() {
		return cantidadVendidos;
	}

	public void setCantidadVendidos(Integer cantidadVendidos) {
		this.cantidadVendidos = cantidadVendidos;
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

	

	

	@Override
	public int compareTo(Articulo o) {
		
		if (getCantidadVendidos()<o.getCantidadVendidos()) {
			return -1;
		}else {
			if(getCantidadVendidos()>o.getCantidadVendidos()) {
				return 1;
			}else {
				return 0;
			}
		}
	}


	
	

}
