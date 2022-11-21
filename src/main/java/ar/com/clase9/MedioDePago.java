package clase9;

import java.util.ArrayList;
import java.util.List;

public class MedioDePago {

	protected List<String> mediosDePago;

	public MedioDePago() {
		this.alimentarMediosPagos();
	}

	public List<String> getmediosDePago() {
		return mediosDePago;
	}

	public void setmediosDePago(List<String> mediosDePago) {
		this.mediosDePago = mediosDePago;
	}

	private void alimentarMediosPagos() {
		setmediosDePago(DBUtils.listaMediosDePago()); 
	}
	
	
}
