package ar.com.poo;

public class DBUtil {
	
	public Articulo[] obtenerResultados(String claveBusqueda) {
		//SIMULAMOS QUE BUSCO UNA BASE
				// primera forma de hacerlo
			//	Articulo [] arrayArticulos = new Articulo [3] ;// se contruye un vector vacio
				Articulo primero = new Articulo("http://mipagina.com", "titulo1"+ claveBusqueda, "Fran", 2000);
				Articulo segundo = new Articulo("http://mipagina.com", "titulo2"+ claveBusqueda, "kiko", 1000);
				Articulo tercero = new Articulo("http://mipagina.com", "titulo3"+ claveBusqueda, "Yo", 3000);
				/*arrayArticulos[0]=primero;
				arrayArticulos[1]=segundo;
				arrayArticulos[2]=tercero;
		return arrayArticulos;*/
				
				//segunda forma de hacerlo
				/*Articulo[] arrayArticulos = new Articulo[] {primero,segundo,tercero};
				return arrayArticulos;*/
				
				//tercera forma de hacerlo
				
				return new Articulo[] {primero,segundo,tercero}; 
	}

}
