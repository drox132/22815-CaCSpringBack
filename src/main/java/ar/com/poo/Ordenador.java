package ar.com.poo;

public class Ordenador {
	
	private Articulo[] lista;

	public Ordenador(Articulo[] lista) {
		this.lista = lista;
	}

	public Articulo[] getLista() {
		return lista;
	}

	public void setLista(Articulo[] lista) {
		this.lista = lista;
	}
	

}
