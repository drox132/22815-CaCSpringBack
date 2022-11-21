package clase7buscador;

import java.util.ArrayList;
import java.util.Collection;

public class DBUtil {
	
	
	
	
	public Collection<Articulo> obtenerResultados(String claveBusqueda) {
		Articulo a1 = new Articulo("soy una imagen1", "soy un titulo1" + claveBusqueda, "soy un autor1", 1000f,400);
		Articulo a2 = new Articulo("soy una imagen2", "soy un titulo2"+claveBusqueda, "soy un autor2", 2000f,600);
		Articulo a3 = new Articulo("soy una imagen3", "soy un titulo3"+claveBusqueda, "soy un autor3", 2000f,500);
		
		
		Libro l1 = new Libro("http://mipagina.com", "titulo1"+ claveBusqueda, "Fran", 2000,456,500,"soy un isbn");
		Libro l2 = new Libro("http://mipagina.com", "titulo1"+ claveBusqueda, "Fran", 2000,630);
		l2.setIsbn("soy otro Isbn");

		Musica m1 = new Musica("http://mipagina.com", "titulo2"+ claveBusqueda, "kiko", 1000 ,250,"soy un sello", new String [] {"Soy un tema en la posicion 1"});
		Musica m2 = new Musica("http://mipagina.com", "titulo2"+ claveBusqueda, "kiko", 1000,120);
		m2.setSello("Soy otro sello");
		m2.setTemas(new String[] {"soy otro tema esperando estar en la posicion 2"});
;		
		Pelicula p1 = new Pelicula("http://mipagina.com", "titulo3"+ claveBusqueda, "Yo", 3000,0,"soy una productora", "soy un formato");
		Pelicula p2 = new Pelicula("http://mipagina.com", "titulo3"+ claveBusqueda, "Yo", 3000,12);
		
		Collection<Articulo> varios = new ArrayList<>();
		varios.add(a1);
		varios.add(a2);
		varios.add(a3);
		varios.add(l1);
		varios.add(l2);
		varios.add(m1);
		varios.add(m2);
		varios.add(p1);
		varios.add(p2);
		
		
		return varios;
	}

}
