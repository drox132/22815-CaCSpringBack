package ar.com.juegodelucha;

public class CollarDivino extends Artefacto {
	private Integer numeroPerlas;
	
	public CollarDivino(String nombre, Integer unidadLucha, Integer numeroPerlas) {
		super(nombre, unidadLucha);
		setNumeroPerlas(numeroPerlas);
		setUnidadLucha(this.calculoPoder());
	}

	public Integer getNumeroPerlas() {
		return numeroPerlas;
	}

	public void setNumeroPerlas(Integer numeroPerlas) {
		this.numeroPerlas = numeroPerlas;
	}
	
	private Integer calculoPoder() {
		return getNumeroPerlas()+getUnidadLucha();
	}
	

}
