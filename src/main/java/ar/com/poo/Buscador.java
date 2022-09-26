package ar.com.poo;

import herencia.DBUtilDos;

public class Buscador {

	private String claveBusqueda;
	private Articulo [] resultado; //nueva class ctrl+n
	private IFiltro filtro;
	
	

/////////////////////////////////////////////////    CONSTRUCTORES   //////////////////////////////////////////////
	public Buscador() {} //constructor por defecto
	
	
	public Buscador(String claveUsuaaario) {
		// TODO Auto-generated constructor stub
		this.setClaveBusqueda(claveUsuaaario);
		
		//para protegerme del nullpointer exception en caso de que  llamemos al buscador y no tenga 
		//informacion 
		this.setResultado(new Articulo [] {}) ;// de esta manera si no hay un articulo creado  lo inicializo aqui
		// y es preferible que devuelva en blanco a un null pointer exception
		
		setFiltro(new MasVendidos(getResultado()));
	}
	
	
//////////////////////////////////////////////// METODOS BUSCAR    ////////////////////////////////////////////////

	public void buscar() { //firma del metodo
		DBUtil db = new DBUtil();
		DBUtilDos db2 = new DBUtilDos();
		//se puede hacer de dos formas
		/*Articulo [] resultado = db.obtenerResultados(this.claveBusqueda); 
		this.resultado=resultado;*/
		
		//la otra forma de hacerlo es 
		this.setResultado(db.obtenerResultados(this.claveBusqueda)) ;
		this.setResultado(db2.obtenerResultados(this.claveBusqueda));
	}
	
	
	/////////////////////////////////////   MOSTRAR RESULTADOS   ///////////////////////////////////////////////////////
	
	public void mostrarResultados() {

		//luego porcedemos a mostrar la informacion por medio  de un bucle
		
		 System.out.println("LA CANTIDAD DE RESULTADOS POR LA PALABRA " +this.getClaveBusqueda() + " ES "+ this.getcantidadBusquedas());
		System.out.println("============================================================");
		 
		 for (Articulo valor  : this.getResultado()  ) {
			
			System.out.println(valor); //en ste caso no usamos los Getter y Setter
			//porque creamos un ToString() eso facilita para no colocar cada atributo
			
		}
	}
	///////////////////////   METODOS FILTROS ////////////
	
	public void ordenar (String claveOrdenamiento) {
		// que tipo de ordenamiento es 
		switch (claveOrdenamiento) {
			case "MASVENDIDOS":
				setFiltro(new MasVendidos(getResultado()));	
			break;
			case "MAYORPRECIO":
				setFiltro(new MayorPrecio(getResultado()));
			break;

		default:
				setFiltro(new MasVendidos(getResultado()));	
			break;
		}
		
		 this.filtro.ordenar(resultado);
	}
	
	
	public void cambiarFiltro(IFiltro nuevoFiltro) {
		setFiltro(nuevoFiltro);
	}
	
	
	
	
	
//////////////////////////////////////GETTERS AND SETTERS///////////////////////////////////////////////////////

	public int getcantidadBusquedas () {
		return resultado.length;
	}
	
	
	
	public String getClaveBusqueda() {
		return claveBusqueda;
	}


	public void setClaveBusqueda(String claveBusqueda) {
		this.claveBusqueda = claveBusqueda;
	}


	public Articulo[] getResultado() {
		return resultado;
	}


	public void setResultado(Articulo[] resultado) {
		this.resultado = resultado;
	}
	
	public IFiltro getFiltro() {
		return filtro;
	}


	public void setFiltro(IFiltro filtro) {
		this.filtro = filtro;
	}
	
	
}
