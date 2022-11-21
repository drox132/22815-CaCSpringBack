package clase7;

public class Play extends Consola implements IJugable {

	private Integer generacion;
	
	public Play(String nombre, String marca,Integer generacion) {
		super(nombre, marca);
		setGeneracion(generacion);
	}

	@Override
	public void jugar() {
		System.out.println("jugando "+ getNombre() +"-"+ getMarca()+"- "+getGeneracion()+" generacion");
	}

	public Integer getGeneracion() {
		return generacion;
	}

	public void setGeneracion(Integer generacion) {
		this.generacion = generacion;
	}
	

}
