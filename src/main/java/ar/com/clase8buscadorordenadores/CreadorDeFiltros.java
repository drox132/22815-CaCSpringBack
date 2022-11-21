package clase8buscadorordenadores;

public class CreadorDeFiltros {

	
	
public static IFiltro creadorDeFiltro (String ClaveOrdenamiento) {
	
	IFiltro filtro = null;
	
	switch (ClaveOrdenamiento) {
	
	case "MASVENDIDOS": 
		  System.out.println("=================ORDENANDO POR MAS VENDIDO=====================");

		  filtro = new MasVendidos();
		break;
		
	case "MAYORPRECIO":
		  System.out.println("=================ORDENANDO POR MAYOR PRECIO=====================");
		  filtro = new MayorPrecio();
		break;
	case "MENORPRECIO":
		  System.out.println("=================ORDENANDO POR MENOR PRECIO=====================");
		  filtro = new MenorPrecio();
		break;
	case "TITULO_A-Z":
		  System.out.println("=================ORDENANDO POR TITULO_A-Z =====================");
		  filtro = new TituloAZ();
		break;
	case "TITULO_Z-A":
		  System.out.println("=================ORDENANDO POR TITULO_Z-A =====================");
		  filtro = new TituloZA();
		break;
	default:
		System.out.println("La clave de oredenamiento no existe");
	}
	return filtro;
}

public static IFiltro crearFIltroDefauld() {
	
	return creadorDeFiltro("MASVENDIDOS");
}



}
