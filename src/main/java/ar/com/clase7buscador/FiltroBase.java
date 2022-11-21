package clase7buscador;

import java.util.Collection;

public class FiltroBase {

	private String nombreFiltro;
	private Collection<Articulo> lista;
	
	public FiltroBase(String nombreFiltro, Collection<Articulo> lista) {
		this.nombreFiltro = nombreFiltro;
		this.lista = lista;
	}

	public String getNombreFiltro() {
		return nombreFiltro;
	}

	public void setNombreFiltro(String nombreFiltro) {
		this.nombreFiltro = nombreFiltro;
	}

	public Collection<Articulo> getLista() {
		return lista;
	}

	public void setLista(Collection<Articulo> lista) {
		this.lista = lista;
	}
	
	

}
