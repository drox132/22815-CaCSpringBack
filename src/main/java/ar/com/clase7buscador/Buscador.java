package clase7buscador;

import java.util.ArrayList;
import java.util.Collection;

public class Buscador {

	private String claveBusqueda;
	private Collection<Articulo> resultados;
	private IFiltro filtro;//MasVendidos,MayorPrecio..
	
	public Buscador(String claveBusqueda) {
		setResultados(new ArrayList<>());
		setClaveBusqueda(claveBusqueda);
		setFiltro(new MasVendidos(new ArrayList<>()));
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
	}
	public void mostrarResultados() {
		System.out.println("Mostrando "+this.cantidadResultados()+ " resultados para "+ getClaveBusqueda()+" :");
		for(Articulo a : getResultados()) {
			System.out.println(a);
		}
	}
	
	public void ordenar(String claveOrden) {
		switch (claveOrden) {
		case "MASVENDIDOS": 
				setFiltro(new MasVendidos(getResultados()));
			break;
			
		case "MAYORPRECIO":
				setFiltro(new MayorPrecio(getResultados()));
			break;
		default:
			System.out.println("La clave de oredenamiento no existe");
		}
		
		getFiltro().ordenar();
	}
	
	private int cantidadResultados() {
		return getResultados().size();
	}
	

}
