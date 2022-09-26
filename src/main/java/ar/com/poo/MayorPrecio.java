package ar.com.poo;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class MayorPrecio extends Ordenador implements IFiltro {

	

	public MayorPrecio(Articulo[] lista) {
		super(lista);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Articulo[] ordenar(Articulo[] lista) {
		System.out.println("Ordenando mas Vendidos");
		Buscador resul = new Buscador();
		lista= resul.getResultado();
		 
		Arrays.sort(lista);

		return lista;
	}

}
