package interfacePoo;

import java.util.Iterator;

public class interfacePooMain {

	public static void main(String[] args) {

		PlayStation play = new PlayStation("Play 3", "Sony");
		Xbox xbox = new Xbox("Xbox One", "Xbox");
		Wii wii = new Wii("Wii", "Nintendo", 2);
		
		play.jugar();
		xbox.jugar();
		wii.jugar();

		System.out.println("==================================================");
		System.out.println("SEGUNDO SUPUESTO");
		
		VendedorDeConsolas vc = new VendedorDeConsolas();
		IJugable algo= vc.vender();
		algo.jugar();
		
		System.out.println("==================================================");
		System.out.println("TERCER  SUPUESTO");
		
		Table tb = new Table();
		tb.jugar();
		
		IJugable[] varios =vc.venderVarios();
		for(IJugable uno : varios) {
			uno.jugar();
		}
		
	}

}
