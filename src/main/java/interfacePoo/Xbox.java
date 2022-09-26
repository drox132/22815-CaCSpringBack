package interfacePoo;

public class Xbox extends Consola implements IJugable {

	public Xbox(String nombre, String marca) {
		super(nombre, marca);
		// TODO Auto-generated constructor stub
	}

	public void jugar() {
		// TODO Auto-generated method stub
		System.out.println("jugango con la "+ getNombre()+ " Marca " + getMarca());
	}

	
}
