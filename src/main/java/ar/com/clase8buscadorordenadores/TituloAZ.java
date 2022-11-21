package clase8buscadorordenadores;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TituloAZ extends FiltroBase implements IFiltro, Comparator<Articulo> {

	
	public TituloAZ( ) {
		super("TituloAZ");
	}

	public TituloAZ( Collection<Articulo> lista) {
		super("TITULO A-Z", lista);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Collection<Articulo> ordenar() {
		List<Articulo> nuevaLista = new ArrayList<>();
		nuevaLista.addAll(getLista());
		Collections.sort(nuevaLista, new TituloAZ(getLista()));
		return nuevaLista;
	}

	@Override
	public int compare(Articulo o1, Articulo o2) {
		
		return o1.getTitulo().compareTo(o2.getTitulo());
	}

}
