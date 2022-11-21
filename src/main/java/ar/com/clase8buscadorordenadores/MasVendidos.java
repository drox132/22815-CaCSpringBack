package clase8buscadorordenadores;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MasVendidos extends FiltroBase implements IFiltro , Comparator<Articulo> {

	public MasVendidos() {
		super("MASVENDIDOS");
	}
	public MasVendidos(Collection<Articulo> lista) {
		super("MASVENDIDOS", lista);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Collection<Articulo> ordenar() {
		List<Articulo> listaArticulos = new ArrayList<>();
		listaArticulos.addAll(getLista());
		Collections.sort(listaArticulos, new MasVendidos(getLista()));
		
		return listaArticulos;
	}

	@Override
	public int compare(Articulo o1, Articulo o2) {
			
		return o2.getCantidadVendidos().compareTo(o1.getCantidadVendidos());
	}

}

/*METODO DE ORDENAMIENTO EN CASO DE USAR ARRAYS
 * Arrays.sort(lista,(a,b)-> Float.compare(b.getPrecio(),a.getPrecio()));
 * 


public static  void sort(List list) {
    Object[] a = list.toArray();
    Arrays.sort(a);
    ListIterator i = list.listIterator();
    for (int j=0; j<a.length; j++) {
      i.next();
      i.set(a[j]);
    }
  }
 */