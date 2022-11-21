package ar.com.juegodelucha;

import java.util.HashSet;

public class Jugador {

	private String Nombre;
	private Integer poderTotal;
	private HashSet<Artefacto> artefactos;
	
	public Jugador(String nombre) {
		setNombre(nombre);
		setArtefactos(new HashSet<>());
		this.calculoPoderTotal();
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public Integer getPoderTotal() {
		return poderTotal;
	}

	public void setPoderTotal(Integer poderTotal) {
		this.poderTotal = poderTotal;
	}

	public HashSet<Artefacto> getArtefactos() {
		return artefactos;
	}

	public void setArtefactos(HashSet<Artefacto> artefactos) {
		this.artefactos = artefactos;
	}
	
	public void agregarArtefacto(Artefacto artefacto) {
		getArtefactos().add(artefacto);
		this.calculoPoderTotal();
	}
	
	public void calculoPoderTotal() {
		Integer poderTotal=0;
		for(Artefacto a :getArtefactos()) {
			poderTotal= a.getUnidadLucha();
		}
		setPoderTotal(poderTotal);
	}
	
	public Integer obtenerNumeroArtefactos() {
		return getArtefactos().size();
	}
	

}
