package clase6;

import clase5.Articulo;


public class DBUtil {
	
	
	
	
	public Articulo[] obtenerResultados(String claveBusqueda) {
		Articulo a1 = new Articulo("soy una imagen1", "soy un titulo1" + claveBusqueda, "soy un autor1", 1000f);
		Articulo a2 = new Articulo("soy una imagen2", "soy un titulo2"+claveBusqueda, "soy un autor2", 2000f);
		Articulo a3 = new Articulo("soy una imagen3", "soy un titulo3"+claveBusqueda, "soy un autor3", 2000f);
		
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
		
		
		
		
		
		return new Articulo [] {a1,a2,a3,l1,l2,m1,m2,p1,p2};
	}

}
