package ar.com.juegodelucha;

public class MascaraDeLuz extends Artefacto {
	private Integer nivelDeLuz;
	
	public MascaraDeLuz(String nombre, Integer unidadLucha, Integer nivelDeLuz) {
		super(nombre, unidadLucha);
		setNivelDeLuz(nivelDeLuz);
		setUnidadLucha(this.calculoDePoder());
		
	}

	public Integer getNivelDeLuz() {
		return nivelDeLuz;
	}

	public void setNivelDeLuz(Integer nivelDeLuz) {
		this.nivelDeLuz = nivelDeLuz;
	}

	private Integer calculoDePoder() {
		return getNivelDeLuz()*2;
	}
	
}
