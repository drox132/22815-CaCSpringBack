package clase6;

import clase5.Articulo;

public class Libro extends Articulo {
	private int numeroPaginas;
	private String isbn;
	

	public Libro(String img, String titulo, String autor, float precio) {
		super(img, titulo, autor, precio);
	}
	

//sobrecarga de contructor
	public Libro(String img, String titulo, String autor, float precio, int numeroPaginas, String isbn) {
		super(img, titulo, autor, precio);
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
