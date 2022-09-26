package practicaDeNivelacionI;

public class ModeloMascotaVirtual {
	
	private final String nombre = "ONDA TAMAGOTCHI";
	private int nivel;
	private String estadoAnimo;
	
	public ModeloMascotaVirtual() {
		this.nivel= 0;
		this.estadoAnimo="Contenta";
	}

	public ModeloMascotaVirtual(int nivel, String estadoAnimo) {
		this.nivel = nivel;
		this.estadoAnimo = estadoAnimo;
	}

	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

	public String getEstadoAnimo() {
		return estadoAnimo;
	}

	public void setEstadoAnimo(String estadoAnimo) {
		this.estadoAnimo = estadoAnimo;
	}
	
	@Override
	public String toString() {
		return "ModeloMascotaVirtual [nombre=" + nombre + ", nivel=" + nivel + ", estadoAnimo=" + estadoAnimo + "]";
	}

	///////////////////////////////////////////////////////////////////////////
	//METODOS DE COMER
	 
	
	
	

	public void comer() {
		System.out.println("Estoy comiendo");
		if(this.getEstadoAnimo()=="Hambienta") {
			this.setEstadoAnimo("Contenta");
			System.out.println("ONDA TAMAGOTCHI ahora esta "+ this.getEstadoAnimo());
		}
		if(this.getEstadoAnimo()=="Contenta") {
			int nivelActual = this.getNivel();
			this.setNivel(nivelActual++);
		}
	}
	
	public void preguntarComoEsta() {
		System.out.println("Me siento  "+(this.getEstadoAnimo()));
	}
	
	
	
	
	
	///////////////////////////////////////////////////////////////////////////
	//METODOS DE JUGAR
	
	 
	

}
