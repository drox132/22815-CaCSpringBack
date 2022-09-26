package practicaDeNivelacionI;

import java.util.TimerTask;

public class PonerHambrienta extends TimerTask{

	private String hambre= "Hambrienta";
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		ponerHambrienta();
	}
	
	public void ponerHambrienta() {
		ModeloMascotaVirtual model = new ModeloMascotaVirtual();
		model.setEstadoAnimo(hambre);
	}
	
	

}
