package ar.com.poo;

public class MasVendidos extends Ordenador implements IFiltro {
	

	public MasVendidos(Articulo[] lista) {
		super(lista);
		// TODO Auto-generated constructor stub
	}

	
	
	public Articulo[] ordenar(Articulo[] lista) {
		System.out.println("Ordenando mas Vendidos");

		return lista;
	}

	
}
