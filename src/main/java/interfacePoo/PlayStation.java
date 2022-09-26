package interfacePoo;

public class PlayStation extends Consola implements IJugable{
	private boolean chipeada;
	
	

	

	public PlayStation(String nombre, String marca, boolean chipeada) {
		super(nombre, marca);
		this.chipeada=chipeada;
	}
	public PlayStation(String nombre, String marca) {
		super (nombre,marca);
		setChipeada(false);
	}
	
	public boolean isChipeada() {
		return chipeada;
	}

	public void setChipeada(boolean chipeada) {
		this.chipeada = chipeada;
	}
	
	//un ejemplo de uso de metodos para decir si no es chipeada
	public void chipear() {
		if(!isChipeada()) {
			setChipeada(true);
		}
	}

	//en este caso se debe respetar el contrato de la implementacion y se debe implementar el metodo te obliga a hacerlo
	//la palabra reservada implements
	
	public void jugar() {
		System.out.println("jugango con la "+ getNombre()+ " Marca " + getMarca());
		
	}
	
	
	

}
