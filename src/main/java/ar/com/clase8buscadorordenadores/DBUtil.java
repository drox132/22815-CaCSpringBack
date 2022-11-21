package clase8buscadorordenadores;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class DBUtil {
	
	
	
	
	public Collection<Articulo> obtenerResultados(String claveBusqueda) {
		Articulo a1 = new Articulo("soy una imagen1", "soy un titulo-X" + claveBusqueda, "soy un autor1", 1000f,400, new Date());
		Articulo a2 = new Articulo("soy una imagen2", "soy un titulo-F"+claveBusqueda, "soy un autor2", 2000f,600,new Date());
		Articulo a3 = new Articulo("soy una imagen3", "soy un titulo-K"+claveBusqueda, "soy un autor3", 3000f,500,new Date());
		
		
		Libro l1 = new Libro("imagen4", "titulo-O"+ claveBusqueda, "Fran", 5000,456,500,"soy un isbn",new Date());
		Libro l2 = new Libro("imagen5", "titulo_Q"+ claveBusqueda, "Fran", 200,630,new Date());
		l2.setIsbn("soy otro Isbn");

		Musica m1 = new Musica("http://mipagina.com", "titulo-P"+ claveBusqueda, "kiko", 100 ,250,"soy un sello", new String [] {"Soy un tema en la posicion 1"},new Date());
		Musica m2 = new Musica("http://mipagina.com", "titulo-A"+ claveBusqueda, "kiko", 100,120,new Date());
		m2.setSello("Soy otro sello");
		m2.setTemas(new String[] {"soy otro tema esperando estar en la posicion 2"});
;		
		Pelicula p1 = new Pelicula("http://mipagina.com", "titulo-H"+ claveBusqueda, "Yo", 305,0,"soy una productora", "soy un formato",new Date());
		Pelicula p2 = new Pelicula("http://mipagina.com", "titulo-G"+ claveBusqueda, "Yo", 30000,12,new Date());
		
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
