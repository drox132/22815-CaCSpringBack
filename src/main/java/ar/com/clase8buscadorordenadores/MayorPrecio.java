package clase8buscadorordenadores;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MayorPrecio extends FiltroBase implements IFiltro, Comparator<Articulo>{


	public MayorPrecio() {
		super("MAYORPRECIO");
	}


	public MayorPrecio( Collection<Articulo> lista) {
		super("MAYORPRECIO", lista);
		// TODO Auto-generated constructor stub
	}


	@Override
	public Collection<Articulo> ordenar() {
		List<Articulo> listaArticulo = new ArrayList<>();
		listaArticulo.addAll(getLista());
		Collections.sort(listaArticulo, new MayorPrecio(getLista()));
		return listaArticulo;
	}


	@Override
	public int compare(Articulo o1, Articulo o2) {

		return o2.getPrecio().compareTo(o1.getPrecio());
	}

}


/*METODO DE ORDENAMIENTO EN CASO DE USAR ARRAYS
 * Arrays.sort(lista,(a,b)-> Float.compare(b.getPrecio(),a.getPrecio()));
 * */
 

/*metodo de ordenamiento 
 * En versiones anteriores de Java, utilizamos normalmente Collections.sort(List) 
 * para ordenar una lista de objetos. Algunas listas implementan el interfaz RandomAccess,
 *  indicando que podemos acceder a cualquier elemento de la lista ubicado en cualquier 
 *  posición en un tiempo constante. Un ejemplo de este tipo de listas es ArrayList. 
 *  Por el contrario, LinkedList no lo es. Una búsqueda tiene una complejidad de tiempo de O(n).
 *   El método Collections.sort(List) no considera si la List implementa RandomAccess, 
 *   sino que la convierte siempre a un Array, para después ordenarlo con Arrays.sort(Object[])
 *    y volcar de nuevo en la lista con el método set() de ListIterator. La siguiente es la forma
 *     en que podríamos ordenar las listas que tenían complejidad en tiempo de O(n) para la búsqueda:
 *     
 * public static  void sort(List list) {
    Object[] a = list.toArray();
    Arrays.sort(a);
    ListIterator i = list.listIterator();
    for (int j=0; j<a.length; j++) {
      i.next();
      i.set(a[j]);
    }
  }
 * */
