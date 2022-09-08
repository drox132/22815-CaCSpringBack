package ar.com.codoacodo;
//la primer letra de las clases van en mayusculas
public class Auto {
	/*
	 atributos
	*/
	boolean encendido; //tipos de datos?//false
	float velocidadActual;//alt+shit+r// > 0 
	String marcas;//null
	String modelo;//null
	int anio;//0
	float velocidadMaxima;//0
	
	//todas las clases tienen un constructor por defecto
	//contructor por defecto/explicito
	Auto() {
		//aca va el codigo cuando nace el auto
		this.encendido = false;//esta apagado
		this.velocidadMaxima = 200;
		this.velocidadActual = 0;
	}
	
	//new Auto(250)
	Auto(final float velocidadMaxima) {// const algo = "";
		//this
		this.velocidadActual = 0;
		this.velocidadMaxima = velocidadMaxima;
	}
		
	//metodos
	void encender() {
		if(!encendido) {
			System.out.println("se ha encendido");
			encendido = true;
		}else {
			System.out.println("ya esta encendido");
		}
	}
	
	void apagar() {
		
	}
	
	void acelerar() {
		if(this.encendido) {
			if(this.velocidadActual < velocidadMaxima) {
				System.out.println("acelerando");
				this.velocidadActual++;
			}else {
				System.out.println("se quema el auto");	
			}
		}else {
			System.out.println("debe encender el auto");
		}
	}
	
	void frenar() {
		
	}
	
	void mostrarInfo() {
		System.out.println("encendido:" + encendido);
	}
}
