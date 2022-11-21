package interfacePoo;

public class Wii extends Consola implements IJugable{

	private int cantidadMandos;
	
	public Wii(String nombre, String marca, int cantidadMandos) {
		super(nombre, marca);
		this.cantidadMandos= cantidadMandos;
	}

	public int getCantidadMandos() {
		return cantidadMandos;
	}

	public void setCantidadMandos(int cantidadMandos) {
		this.cantidadMandos = cantidadMandos;
	}

	public void jugar() {
		System.out.println("jugango con la "+ getNombre()+ " Marca " + getMarca());
		
	}


	
}
