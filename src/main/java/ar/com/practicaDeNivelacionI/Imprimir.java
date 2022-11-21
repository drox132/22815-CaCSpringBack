package practicaDeNivelacionI;

import java.util.TimerTask;

public class Imprimir extends TimerTask{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		imprimirEstadoAnimo();
		imprimirNivel();
	}
	
	public void imprimirEstadoAnimo () {
		ModeloMascotaVirtual modelo = new ModeloMascotaVirtual();
		System.out.println("Estoy "+ (modelo.getEstadoAnimo()));
	}

	public void imprimirNivel() {
		ModeloMascotaVirtual modelo = new ModeloMascotaVirtual();
		System.out.println("Mi nivel actual es: "+ (modelo.getNivel()));	
	}
}
