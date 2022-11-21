package clase7;

import java.util.ArrayList;
import java.util.Collection;

public class VendedorDeConsolas  {

	public IJugable vender () {
			
			Play play1 = new Play("Play", "PlayStation", 3);
		
		return play1;
	}
	
	public IJugable venderOtro() {
		
		return new Tablet("Siragon", 2022);
		
	} 
	
	public Collection<IJugable> venderVarios(){
		Play play = new Play("Play", "PlayStation", 2);
		Xbox xbox = new Xbox("Xbox 360" , "Sony", 4);
		Wii wii = new Wii("Wii", "PanaSony", true);
		Tablet tablet = new Tablet("Siragon", 2022);
		
		Collection<IJugable> varios = new ArrayList<>();
		varios.add(play);
		varios.add(xbox);
		varios.add(wii);
		varios.add(tablet);
		return varios;
		
	}
	

}
