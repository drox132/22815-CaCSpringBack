package clase9;

public class Visa extends MedioDePago implements IPagador {

	private String nombre;
	
	public Visa() throws ExcepcionMedioPagoInvalido {
		for(String medio : getmediosDePago()) {
		
			if(!getmediosDePago().contains("VISA")) {
				throw new ExcepcionMedioPagoInvalido("El medio de Pago es Invalido");
			}
			if(medio.equals("VISA")) {
				setNombre(medio);
			}
		}
	}

	@Override
	public void pagar(Double montoAPagar) throws ExcepcionMontoPagoInvalido  {
		System.out.println("Ejecutando Medio de Pago " +getNombre());
		if(montoAPagar<= 0) {
			throw new ExcepcionMontoPagoInvalido("El monto a pagar es Incorrecto");
		}
		
		System.out.println("Pago realizado con exito");

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
}
