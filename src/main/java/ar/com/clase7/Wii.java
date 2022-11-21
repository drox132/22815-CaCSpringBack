package clase7;

public class Wii extends Consola implements IJugable {

	private boolean isChipeada;
	
	public Wii(String nombre, String marca, boolean isChipeada) {
		super(nombre, marca);
		setChipeada(isChipeada);
	}

	@Override
	public void jugar() {
		System.out.println("jugando "+ getNombre() +"-"+ getMarca()+"-"+"chipeada: "+isChipeada);

	}

	public boolean isChipeada() {
		return isChipeada;
	}

	public void setChipeada(boolean isChipeada) {
		this.isChipeada = isChipeada;
	}
	

}
