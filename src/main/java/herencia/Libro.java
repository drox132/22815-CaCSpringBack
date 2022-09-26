package herencia;

import ar.com.poo.Articulo;

public class Libro extends Articulo{
	//atributos propios del hijo
	private int numeroPaginas;
	private String isbn;

	//constructor vacio
	public Libro() {
		super();
		// TODO Auto-generated constructor stub
	}
	//constructor con atributos del padre
	public Libro(String img, String titulo, String autor, float precio) {
		super(img, titulo, autor, precio);
		// TODO Auto-generated constructor stub
	}
	
	//constructor con los datos del padre mas el hijo
	public Libro(String img, String titulo, String autor, float precio, int numeroPagina,String isbn) {
		super(img, titulo, autor, precio);
		this.setNumeroPaginas(numeroPagina);
		this.setIsbn(isbn);
		// TODO Auto-generated constructor stub
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
		return super.toString() +  "Libro [numeroPaginas=" + numeroPaginas + ", isbn=" + isbn + "]";
	// ene este caso estariamos sobreescribiendo el metodo toString del padre  pero lo estariamos configurando para que muestre solo los datos attr del hijo
		//y nosotros queremos que los muestre todos para eso debemos agregarle el super 
		
	}
	
	

	
	

}
