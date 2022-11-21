package clase7buscador;

public class MainClase7Buscador {


	public static void main(String[] args) {

		String claveBusqueda ="Iron Man";
		Buscador buscador = new Buscador(claveBusqueda);
		buscador.buscar();
		buscador.mostrarResultados();
		
		String claveOrden="MAYORPRECIO";
		buscador.ordenar(claveOrden);
		
		claveOrden ="MASVENDIDOS";
		buscador.ordenar(claveOrden);

	}

}
