package practicaDeNivelacionI;

import java.util.TimerTask;

public class ImprimirEstadoAnimo extends TimerTask{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		imprimirEstadoAnimo();
	}
	
	public void imprimirEstadoAnimo () {
		ModeloMascotaVirtual modelo = new ModeloMascotaVirtual();
		System.out.println("Estoy "+ (modelo.getEstadoAnimo()));
	}

}
