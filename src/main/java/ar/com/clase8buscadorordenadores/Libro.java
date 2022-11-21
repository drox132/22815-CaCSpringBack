package clase8buscadorordenadores;

import java.util.Date;

public class Libro extends Articulo {
	private int numeroPaginas;
	private String isbn;
	

	public Libro(String img, String titulo, String autor, float precio, Integer cantidadVendidos, Date fechaPublicacion) {
		super(img, titulo, autor, precio,cantidadVendidos,fechaPublicacion);
	}
	

//sobrecarga de contructor
	public Libro(String img, String titulo, String autor, float precio,Integer cantidadVendidos, int numeroPaginas, String isbn,Date fechaPublicacion) {
		super(img, titulo, autor, precio,cantidadVendidos, fechaPublicacion);
		setNumeroPaginas(numeroPaginas);
		setIsbn(isbn);
	}



	public int getNumeroPaginas() {
		return numeroPaginas;
	}


	public void setNumeroPaginas(int numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}


	public String getIsbn() {
		return isbn;
	}


	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}


	@Override
	public String toString() {
		return super.toString() + " Libro [numeroPaginas=" + numeroPaginas + ", isbn=" + isbn + "]";
	}
	
	
	
	

}
