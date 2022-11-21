package clase7;

public class Xbox extends Consola implements IJugable {

	private Integer cantidadMandos;
	
	public Xbox(String nombre, String marca, Integer cantidadMandos) {
		super(nombre, marca);
		setCantidadMandos(cantidadMandos);
	}

	@Override
	public void jugar() {
		System.out.println("jugando "+ getNombre() +"-"+ getMarca()+"- "+getCantidadMandos()+" mandos");

	}

	public Integer getCantidadMandos() {
		return cantidadMandos;
	}

	public void setCantidadMandos(Integer cantidadMandos) {
		this.cantidadMandos = cantidadMandos;
	}

	
}
