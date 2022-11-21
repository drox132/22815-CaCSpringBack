package clase6;

import clase5.Articulo;

public class MainClase6 {

	public static void main(String [] args) {

		/*
		 * Articulo a1 = new Articulo("a1", "a1", "a1",100); Articulo al2 = new
		 * Libro("al1", "al1", "al1", 20, 100,"al1"); Libro l1 = new Libro("l1", "l1",
		 * "l1", 40, 20, "l1");
		 */
		//a1 solo puede ingresas a sus metodos
		// al2 solo puede acceder a los metodos publicos de papa porq del lado izquierdo esta el papa
		//l1 puede acceder a los metodos publicos del padre y el hijo porq los hereda y del lado izquierdo esta el objeto hijo
		
		// un hijo no puede tener la instancia de un padre
		//un hermano tampoco puede tener una instancia de otro hermano
		String claveBusqueda= "Francisco";
		
		Buscador buscador = new Buscador("Francisco");
		buscador.buscar();
		buscador.mostrarResultados();
	}
}
