package ar.com.practicacollections;

import java.util.Collection;
import java.util.Iterator;

public class MainCollections {

	public static void main(String[] args) throws IdiomaDuplicadoException{
		
		/*EJERCICI DE JAVA HASHMAP + COLLECTIONS
		 * DESARROLLAR UNA APLICACION QUE PERMITA
		 * GESTIONAR LOS IDIOMAS QUE HABLA UNA PERSONA
		 * UNA PERSONA HABLA UN IDIOMA NATIVO
		 * UNA PERSONA ES CAPAZ DE APRENDER NUEVOS IDIOMAS
		 * NO ES POSIBLE QUE UNA PERSONA APRENDA DOS VECES EL MISMO IDIOMA
		 * DE OCURRIR ESTO LA APP DEBE LANZAR UNA EXCEPTION (DEFINIR NOMBRE)
		 * LA APLICACION DEBE PODER LISTAR TODAS LAS PERSONAS
		 * QUE HABLAN UN DETERMINADO IDIOMA
		 * UTILIZAR LAS COLLECTIONS APRENDIDAS
		 * 
		 * PERSONA
		 * -nombre:String
		 * -edad: int
		 * -idiomaNativo :IIdioma
		 * -nuevosIdiomasAprendidos: Collection<IIdioma>
		 * 
		 * <<interface>>
		 * IIDioma
		 * +hablar(): void
		 * 
		 * lueo cada idioma que se cree debe implementar la interfaz idioma
		 * 
		 * --------------------------------------------------------------------
		 * 
		 * 
		 * */
		String palabra= "hola";
		Persona persona = new Persona("Francisco", 30, new Espanol());
		
		persona.aprender(new Ingles());
		persona.aprender(new Italiano());
		System.out.println(persona.toString());
		
		persona.decir(palabra);
		
		DBUtil db = new DBUtil();
		db.agregarPersona(persona);
		
		//////////////////////////////////////////////////////////////////////
		System.out.println("===========================================");
		
		
		Persona otraPersona = new Persona("Mileydi", 30, new Espanol());
		otraPersona.aprender(new Ingles());
		System.out.println(otraPersona.toString());
		otraPersona.decir(palabra);
		
		db.agregarPersona(otraPersona);
		
		Collection<Persona> personas = db.getListadoPersonas();
		for (Persona p : personas) {
			System.out.println(p);
		}
		
		
	}

}
