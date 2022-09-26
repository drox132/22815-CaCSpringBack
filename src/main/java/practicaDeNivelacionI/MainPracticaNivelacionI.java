package practicaDeNivelacionI;

import java.util.Timer;

public class MainPracticaNivelacionI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Timer timer = new Timer();
		ModeloMascotaVirtual modelo = new ModeloMascotaVirtual();
		ImprimirEstadoAnimo imprimirEstadoAnimo = new ImprimirEstadoAnimo();
		PonerHambrienta ponerHambrienta = new PonerHambrienta();
		
		System.out.println(modelo.getEstadoAnimo()); 

		modelo.setEstadoAnimo("Hambrienta");

		System.out.println(modelo.getEstadoAnimo());
		
		System.out.println(modelo.toString());
		
		
		timer.schedule(imprimirEstadoAnimo, 5000 ,3000 );
	/*	ModeloMascotaVirtual mascota = new ModeloMascotaVirtual();
		mascota.preguntarComoEsta();
		System.out.println(mascota.getNivel());
		mascota.comer();
		System.out.println(mascota.getNivel());
		System.out.println(mascota.toString());
		*/
		
		

	}

}
