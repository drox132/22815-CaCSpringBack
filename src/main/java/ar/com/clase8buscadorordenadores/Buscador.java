package clase8buscadorordenadores;

import java.util.ArrayList;
import java.util.Collection;

public class Buscador {

	private String claveBusqueda;
	private Collection<Articulo> resultados;
	private IFiltro filtro;//MasVendidos,MayorPrecio..
	
	public Buscador(String claveBusqueda) {
		setResultados(new ArrayList<>());
		setClaveBusqueda(claveBusqueda);
		setFiltro(CreadorDeFiltros.crearFIltroDefauld());
	}

	public IFiltro getFiltro() {
		return filtro;
	}

	public void setFiltro(IFiltro filtro) {
		this.filtro = filtro;
	}

	public String getClaveBusqueda() {
		return claveBusqueda;
	}

	public void setClaveBusqueda(String claveBusqueda) {
		this.claveBusqueda = claveBusqueda;
	}
	
	
	

	public Collection<Articulo> getResultados() {
		return resultados;
	}

	public void setResultados(Collection<Articulo> resultados) {
		this.resultados = resultados;
	}

	public void buscar() {
		DBUtil db = new DBUtil();
		setResultados(db.obtenerResultados(getClaveBusqueda()));

		this.ordenar();
	}
	public void mostrarResultados() {
		System.out.println("Mostrando "+this.cantidadResultados()+ " resultados para "+ getClaveBusqueda()+" :");
		for(Articulo a : getResultados()) {
			System.out.println(a);
		}
	}
	
	public void ordenar() {
		//Dowcastin de iFILTRO a filtroBase
		((FiltroBase)(getFiltro())).setLista(getResultados());
		setResultados(getFiltro().ordenar()); 
	}
	
	private int cantidadResultados() {
		return getResultados().size();
	}

	public void cambiarFiltro(IFiltro nuevoFiltro) {
		setFiltro(nuevoFiltro);
		
	}
	

}
