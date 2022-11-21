package ar.com.practicacollections;

public class Italiano extends IdiomaBase implements IIdioma {


	public Italiano() {
		super("Italiano");
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
		getMap().put("hola", "ciao");
		getMap().put("adios","arrivederci");
		getMap().put("gracias", "Grazie");
		getMap().put("feliz", "felice");
		
	}

}
