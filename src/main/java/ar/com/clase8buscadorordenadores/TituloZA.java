package clase8buscadorordenadores;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TituloZA extends FiltroBase implements IFiltro, Comparator<Articulo> {

	
	public TituloZA() {
		super("TituloZA");
	}

	public TituloZA( Collection<Articulo> lista) {
		super("TITULO Z-A", lista);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Collection<Articulo> ordenar() {
		List<Articulo>listaNueva = new ArrayList<>();
		listaNueva.addAll(getLista());
		Collections.sort(listaNueva, new TituloZA(getLista()));
		return listaNueva;
	}

	@Override
	public int compare(Articulo o1, Articulo o2) {
		
		return o2.getTitulo().compareTo(o1.getTitulo());
	}

}
