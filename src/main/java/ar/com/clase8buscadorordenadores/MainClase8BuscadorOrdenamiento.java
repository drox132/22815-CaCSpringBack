package clase8buscadorordenadores;


public class MainClase8BuscadorOrdenamiento {

	public static void main(String[] args) {
		
		String claveBusqueda = "->Irom-Man ";
		Buscador buscador8 = new Buscador(claveBusqueda);

		
		  buscador8.buscar(); buscador8.mostrarResultados();
		  System.out.println("=====================================================");
		
		  String claveOrdenamiento = "MENORPRECIO";
		  IFiltro filtro =CreadorDeFiltros.creadorDeFiltro(claveOrdenamiento);
		  
		  buscador8.cambiarFiltro(filtro);
		
		  buscador8.ordenar();
		  buscador8.mostrarResultados();
		 
		
		/*
		 * Collection<Articulo> nuevaLista = new TreeSet<>(); DBUtil db = new DBUtil();
		 * nuevaLista.addAll(db.obtenerResultados(claveBusqueda));
		 * 
		 * for (Articulo articulo: nuevaLista) { System.out.println(articulo); }
		 */
		  
		  claveOrdenamiento = "MAYORPRECIO";
		  filtro =CreadorDeFiltros.creadorDeFiltro(claveOrdenamiento);
		  buscador8.cambiarFiltro(filtro);
		  buscador8.ordenar();
		  buscador8.mostrarResultados();
		  
		  
		  claveOrdenamiento= "TITULO_A-Z";
		  filtro =CreadorDeFiltros.creadorDeFiltro(claveOrdenamiento);
		  buscador8.cambiarFiltro(filtro);
		  buscador8.ordenar();
		  buscador8.mostrarResultados();
		  
		  claveOrdenamiento= "TITULO_Z-A";
		  filtro =CreadorDeFiltros.creadorDeFiltro(claveOrdenamiento);
		  buscador8.cambiarFiltro(filtro);
		  buscador8.ordenar();
		  buscador8.mostrarResultados();
		  
		  
		
	}

}
