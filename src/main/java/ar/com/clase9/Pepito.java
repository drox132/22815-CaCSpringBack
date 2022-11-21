package clase9;

public class Pepito extends MedioDePago implements IPagador {
	
private String nombre;
	
	public Pepito() throws ExcepcionMedioPagoInvalido {
		for(String medio : getmediosDePago()) {
		
			if(!getmediosDePago().contains("Pepito")) {
				throw new ExcepcionMedioPagoInvalido("El medio de Pago es Invalido");
			}
			if(medio.equals("Pepito")) {
				setNombre(medio);
			}
		}
	}

	
	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	@Override
	public void pagar(Double montoAPagar) throws ExcepcionMontoPagoInvalido {
		// TODO Auto-generated method stub

	}

}
