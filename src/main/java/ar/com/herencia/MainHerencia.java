package herencia;

import ar.com.poo.Articulo;
import ar.com.poo.Buscador;

public class MainHerencia {
	public static void main(String[] args) {
		
		/*Libro libro1 = new Libro("/yosoymacho.jpg", "El macho", "Francisco B", 2022);
		//en esta intancia me permite crear este libro ya que tengo un constructor que hace esto
		//ahora quiero que me muestre los datos completos asi que le seteo los attr del libro
		libro1.setNumeroPaginas(500);
		libro1.setIsbn("soy un isbn");
		
		System.out.println(libro1); 
		//aqui aunque no tenemos el metodo tuString creado en la clase libro esta usando el del padre
		//y aunque le setee los datos del hijo no los va  amostrar ya que no esta escrito
		//si queremos que lo muestre debemos acomodar el metodo to estring en la clase libro
		
		
		Articulo articulo1 = new Articulo("/img.jpg","El macho2", "Javier Burgos",3000);
		 System.out.println(articulo1);
		 
		 Articulo a = new Libro("/imagen.jpg", "Las cotufas", "Wilie Colon", 5000, 500, "soy un isbn");
		 System.out.println(a);
		 //     a.   -> no puedo acceder a los attributos del libro ya que es un articulo de tipo articulo pero el libro
		 // se ccreo de una instancia de articulo y tiene todos sus attributos completos de libro
		 //para poder ingresar a esos atributos debo castear el objeto creado al tipo de dato del hijo . y asi podre acceder a sus atributos 
		  
		 Libro libroCasteado= (Libro)a;
		 //  libroCasteado. -> aqui si puedo acceder a los attributos y metodos del objeto libro 
		 
		 */
		
		// hacemos la prueba del profe con herencia pero en este mismo main de herencia 
		//===================================================================================
		final String palabraDeBusqueda= "soy una busqueda";
		 Buscador buscador = new Buscador(palabraDeBusqueda);
		 buscador.buscar();
		 buscador.mostrarResultados();
		 
		 
	}

}
