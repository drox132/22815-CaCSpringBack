package ar.com.practicacollections;

import java.util.Map;

public class Espanol extends IdiomaBase implements IIdioma {

	//constructor obligado por el padre
	public Espanol() {
		super("Espanol");
		// TODO Auto-generated constructor stub
	}

	@Override
	public void hablar(String palabra) {
		if(getMap().containsKey(palabra)) {
			String valorDeLaKey= getMap().get(palabra);
			System.out.println("Diciendo en "+ getNombre() +" "+ palabra+ "-> "+valorDeLaKey);
		}else {
			System.out.println("Aun no he aprendido la palabra "+ palabra + " en "+ getNombre());
		}
	}

	@Override
	public void crearGeneracionPalabras() {
		getMap().put("hola", "hola");
		getMap().put("gracias", "gracias");
		getMap().put("adios", "adios");
		getMap().put("bienvenido", "bienvenido");
		getMap().put("feliz", "feliz");
	}

}
