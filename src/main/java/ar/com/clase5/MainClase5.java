package clase5;

public class MainClase5 {

	public MainClase5() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		String claveBusqueda = "Iron man";
		Buscador busscador = new Buscador(claveBusqueda);
		busscador.buscar();
		busscador.mostrarResultados();

	}

}
