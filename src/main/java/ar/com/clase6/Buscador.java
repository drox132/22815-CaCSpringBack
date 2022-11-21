package clase6;

import clase5.Articulo;

public class Buscador {

	private String claveBusqueda;
	private Articulo[] resultados;
	
	public Buscador(String claveBusqueda) {
		setResultados(new Articulo[] {});
		setClaveBusqueda(claveBusqueda);
	}

	public String getClaveBusqueda() {
		return claveBusqueda;
	}

	public void setClaveBusqueda(String claveBusqueda) {
		this.claveBusqueda = claveBusqueda;
	}
	
	
	public Articulo[] getResultados() {
		return resultados;
	}

	public void setResultados(Articulo[] resultados) {
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
	
	private int cantidadResultados() {
		return getResultados().length;
	}
	

}
