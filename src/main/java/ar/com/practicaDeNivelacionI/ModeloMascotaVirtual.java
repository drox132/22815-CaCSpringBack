package practicaDeNivelacionI;

import java.util.List;

public class ModeloMascotaVirtual  {
	
	private final String nombre = "ONDA TAMAGOTCHI";
	private int nivel;
	private String estadoAnimo;
	
	PonerHambrienta ponerHambrienta = new PonerHambrienta();
	Imprimir imprimir = new Imprimir();
	
	public ModeloMascotaVirtual() {
		setNivel(0);
		setEstadoAnimo("CONTENTA");
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
		
		String estadoAnimo=getEstadoAnimo();
		
		switch (estadoAnimo) {
		case "HAMBRIENTA": 
			System.out.println("Estoy comiendo");
			this.setEstadoAnimo("CONTENTA");
			System.out.println("ONDA TAMAGOTCHI ahora esta "+ this.getEstadoAnimo());
			break;
		case "CONTENTA":
			System.out.println("Estoy comiendo");
			int nivelActual = this.getNivel();
			nivelActual++;
			this.setNivel(nivelActual);
			System.out.println("Mi nivel se incremento en 1 , nuevo nivel: " +getNivel());
			break;
		case "ABURRIDA":
				System.out.println("hay que buscar para meter los datos con DATE o TIMER");
			break;
		}	
	}
	
	

	
	///////////////////////////////////////////////////////////////////////////
	//METODOS DE JUGAR
	
	public void jugar() {
		
		String estadoAnimo=getEstadoAnimo();
		
		switch (estadoAnimo) {
		case "HAMBRIENTA": 
			System.err.println("No se puede jugar con ONDA TAMAGOTCHI porque esta HAMBRIENTA");
			break;
		case "CONTENTA":
			int nivelActual = this.getNivel();
			nivelActual+=2;
			setNivel(nivelActual);
			System.out.println("Incrementando mi nivel en 2 nuevo nivel : "+getNivel());
			break;
		case "ABURRIDA":
				System.out.println("hay que buscar para meter los datos con DATE o TIMER");
			break;
		}	
	}
	 
	

}
