package ar.com.juegodelucha;

public class MainJuegoDeLucha {

	public MainJuegoDeLucha() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		String nombre= "Francisco";
		
		Espada espada = new Espada("Espada Simple",100);
		
		  CollarDivino collarDivino=new CollarDivino("Collar Divino 1", 20, 10);
		  MascaraDeLuz mLuz = new MascaraDeLuz("Mascara Resplandor", 30, 6); Armadura
		  armadura=new Armadura("Armadura Sencilla", 40,10);
		 
		Jugador jugador = new Jugador(nombre);
		jugador.agregarArtefacto(espada);
		
		  jugador.agregarArtefacto(collarDivino); jugador.agregarArtefacto(mLuz);
		  jugador.agregarArtefacto(armadura);
		 
		Integer poderTotal=jugador.getPoderTotal();
		System.out.println(poderTotal);
		
		Integer cantidadArtefactos = jugador.obtenerNumeroArtefactos();
		System.out.println(cantidadArtefactos);
		
		
	}

}
