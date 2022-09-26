package herencia;

import ar.com.poo.Articulo;

public class DBUtilDos {
	
	public Articulo[] obtenerResultados(String claveBusqueda) {
		//SIMULAMOS QUE BUSCO UNA BASE
		Libro l1 = new Libro("http://mipagina.com", "titulo1"+ claveBusqueda, "Fran", 2000,500,"soy un isbn");
		Libro l2 = new Libro("http://mipagina.com", "titulo1"+ claveBusqueda, "Fran", 2000);
		l2.setNumeroPaginas(400);
		l2.setIsbn("soy otro Isbn");

		Musica m1 = new Musica("http://mipagina.com", "titulo2"+ claveBusqueda, "kiko", 1000 ,"soy un sello", new String [] {"Soy un tema en la posicion 1"});
		Musica m2 = new Musica("http://mipagina.com", "titulo2"+ claveBusqueda, "kiko", 1000);
		m2.setSello("Soy otro sello");
		m2.setTemas(new String[] {"soy otro tema esperando estar en la posicion 2"});
		
		Pelicula p1 = new Pelicula("http://mipagina.com", "titulo3"+ claveBusqueda, "Yo", 3000,"soy una productora", "soy un formato");
		Pelicula p2 = new Pelicula("http://mipagina.com", "titulo3"+ claveBusqueda, "Yo", 3000);
		
		return new Articulo[] {l1,l2,m1,m2,p1,p2};
		
	}

}
