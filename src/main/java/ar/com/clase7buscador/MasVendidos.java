package clase7buscador;

import java.util.Collection;

public class MasVendidos extends FiltroBase implements IFiltro {

	
	public MasVendidos(Collection<Articulo> lista) {
		super("MASVENDIDOS", lista);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Collection<Articulo> ordenar() {
		System.out.println("Ordenando por Mas Vendidos");
		
		return null;
	}

}
