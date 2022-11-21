package clase8buscadorordenadores;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MenorPrecio extends FiltroBase implements IFiltro ,Comparator<Articulo>{

	
	public MenorPrecio() {
		super("MENORPRECIO");
	}

	public MenorPrecio( Collection<Articulo> lista) {
		super("MENORPRECIO", lista);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Collection<Articulo> ordenar() {
		//como mi lista es de tipo collection y este metodo ordena listas 
		//debo crear una lista para poder ordenarlas
		
		List<Articulo> nuevaLista = new ArrayList<>();
		nuevaLista.addAll(getLista());
		//utilizo el metodo que pide una lista y un comparator
		Collections.sort(nuevaLista, new MenorPrecio(getLista()));
		return nuevaLista;
	}

	@Override
	public int compare(Articulo o1, Articulo o2) {
		//aqui estoy diciendo que quiero que los ordene de manera ascendente
		return o1.getPrecio().compareTo(o2.getPrecio());
	}

}
