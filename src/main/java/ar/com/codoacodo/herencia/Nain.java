package ar.com.codoacodo.herencia;

public class Nain {

	public static void main(String[] args) {
		
		String ClaveBusqueda = "Iron Man";
		
		Buscador buscador = new Buscador(ClaveBusqueda);
		buscador.buscar();
		buscador.mostrarResultados();

	}

}
