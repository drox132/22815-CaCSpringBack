package clase7buscador;

import java.util.Collection;

public class MayorPrecio extends FiltroBase implements IFiltro {


	public MayorPrecio( Collection<Articulo> lista) {
		super("MAYORPRECIO", lista);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Collection<Articulo> ordenar() {
		System.out.println("Odenando por Mayor Precio");
		
		return null;
	}

}
