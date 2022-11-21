package ar.com.juegodelucha;

public class Armadura extends Artefacto {
	private Integer cantidadDePartes;
	
	public Armadura(String nombre, Integer unidadLucha, Integer cantidadDePartes) {
		super(nombre, 10);
		setCantidadDePartes(cantidadDePartes);
		setUnidadLucha(this.calculoDePoder());
	}

	public Integer getCantidadDePartes() {
		return cantidadDePartes;
	}

	public void setCantidadDePartes(Integer cantidadDePartes) {
		this.cantidadDePartes = cantidadDePartes;
	}
	
	private Integer calculoDePoder() {
		return getUnidadLucha()+ (getCantidadDePartes()/2);
	}

}
