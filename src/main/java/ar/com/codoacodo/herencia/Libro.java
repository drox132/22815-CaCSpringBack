package ar.com.codoacodo.herencia;

public class Libro extends Articulo {
	
	// ATRIBUTOS DE LA CLASE
	
	private int nroPaginas;
	private String isbn;
	
	//CONSTRUCTOR DE LA CLASE
	
	public Libro(String titulo, String autor, String img, float precio, int nroPaginas, String isbn) {
		super(titulo, autor, img, precio);
		this.setNroPaginas(nroPaginas);
		this.setIsbn(isbn);
	}

	public int getNroPaginas() {
		return nroPaginas;
	}

	public void setNroPaginas(int nroPaginas) {
		this.nroPaginas = nroPaginas;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	//GENERAMOS EL METODO TO STRING PARA EL HIJO  AGREGAMOS EL TO STRING DEL PADRE CON EL SUPER YY LE SUMAMOS LOS ATRIBUTOIS DEL HIJO
	@Override
	public String toString() {
		return super.toString()+" Libro [nroPaginas=" + nroPaginas + ", isbn=" + isbn + "]";
	}
	
	
	

}
