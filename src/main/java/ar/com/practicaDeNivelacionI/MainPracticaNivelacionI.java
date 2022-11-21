package practicaDeNivelacionI;

import java.util.Timer;

public class MainPracticaNivelacionI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Timer timer = new Timer();
		ModeloMascotaVirtual modelo = new ModeloMascotaVirtual();
	//	PonerHambrienta ponerHambrienta= new PonerHambrienta();
	//	Imprimir imprimir = new Imprimir();
		 timer.schedule(modelo.imprimir, 2000,5000);
		
	//	System.out.println(modelo.getEstadoAnimo());
	//	System.out.println(modelo.getNivel());
		System.out.println("=========llamamos al metodo comer============================");
		modelo.comer();
	//	System.out.println(modelo.getEstadoAnimo());
		System.out.println(modelo.getNivel());

		timer.schedule(modelo.ponerHambrienta, 5000, 10000);
		System.out.println("==============llamamos al metodo jugar=======================");
		modelo.jugar();
	//	System.out.println(modelo.getEstadoAnimo());
		System.out.println(modelo.getNivel());

		System.out.println("===========seteando estado hambrienta== y llamamdo a comer y jugar========================");
		modelo.setEstadoAnimo("HAMBRIENTA");
		modelo.comer();
		modelo.jugar();
	//	System.out.println(modelo.getEstadoAnimo());
		System.out.println(modelo.getNivel());

		System.out.println("=====================================");
		/*
		 * ImprimirEstadoAnimo imprimirEstadoAnimo = new ImprimirEstadoAnimo();
		 * PonerHambrienta ponerHambrienta = new PonerHambrienta();
		 * 
		 * System.out.println(modelo.getEstadoAnimo());
		 * 
		 * modelo.setEstadoAnimo("Hambrienta");
		 * 
		 * System.out.println(modelo.getEstadoAnimo());
		 * 
		 * System.out.println(modelo.toString());
		 * 
		 * */
		 
		 
	/*	ModeloMascotaVirtual mascota = new ModeloMascotaVirtual();
		mascota.preguntarComoEsta();
		System.out.println(mascota.getNivel());
		mascota.comer();
		System.out.println(mascota.getNivel());
		System.out.println(mascota.toString());
		*/
		
		

	}

}
