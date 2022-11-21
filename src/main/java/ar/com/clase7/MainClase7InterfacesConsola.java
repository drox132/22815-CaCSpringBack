package clase7;

import java.util.Collection;

public class MainClase7InterfacesConsola {

	public MainClase7InterfacesConsola() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		Play c1 = new Play("Play", "PlayStation", 2);
		Xbox c2 = new Xbox("Xbox 360" , "Sony", 4);
		Wii c3 = new Wii("Wii", "PanaSony", true);
		c1.jugar();
		c2.jugar();
		c3.jugar();
		System.out.println("Comprando al vendedr de consola");
		VendedorDeConsolas vc = new VendedorDeConsolas();
		IJugable jugable = vc.vender();
		System.out.println("Intentando jugar con eljugable que compramos");
		jugable.jugar();
		
		IJugable otroJugable = vc.venderOtro();
		otroJugable.jugar();
		
		System.out.println("========================================");
		System.out.println("Vendiendo varios Jugables");
		Collection<IJugable>variosVendidos= vc.venderVarios();
		for(IJugable jugablee : variosVendidos) {
			jugablee.jugar();
		}
	}

}
