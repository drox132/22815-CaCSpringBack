package ar.com.practicacollections;

public class Ingles extends IdiomaBase implements IIdioma {


	public Ingles( ) {
		super("Ingles");
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
		getMap().put("hola", "hello");
		getMap().put("gracias", "transks");
		getMap().put("adios", "goodBye");
		getMap().put("feliz", "happy");
		
	}

}
