package ar.com.codoacodo.herencia;

public class Buscador {
	
	// ATRIBUTOS
	
	private String palabraClave;
	private Articulo[] resultados;
	
	//CONSTRUCTORES DE LA CLASE
	
	public Buscador() {
		
	}

	public Buscador(String palabraClave) {
		this.setResultados(new Articulo[] {});
		this.setPalabraClave(palabraClave);
	}

	//GETTER AND SETTER DE LA CLASE

	public String getPalabraClave() {
		return palabraClave;
	}



	public void setPalabraClave(String palabraClave) {
		this.palabraClave = palabraClave;
	}



	public Articulo[] getResultados() {
		return resultados;
	}



	public void setResultados(Articulo[] resultados) {
		this.resultados = resultados;
	}
	
	
	//METODOS DE LA CLASE
	
	public void buscar() {
		DBUtil db = new DBUtil();
		//una forma de hacerlo es 
		/*Articulo [] resul=db.obtenerResultados(this.getPalabraClave());
		setResultados(resul);*/
		//otra forma de hacerlo es 
		setResultados(db.obtenerResultados(this.getPalabraClave()));
	}
	
	public void mostrarResultados() {
		
		/*
		 * for(Articulo articulo : this.getResultados()) {
		 * System.out.println(articulo.toString()); }
		 */
		
		// TAMBIEN PODEMOS MOSTRAR RESULTADOS FILTRADOS  USANDO LA HERENCIA
			
			for(Articulo aux : this.getResultados()) {
				
			//MOSTRANDO RESULTADOS DE INSTANCIA DE ARTICULO
				if(aux instanceof Articulo) { //
					System.out.println("Mostrando resultados de la instancia de Articulo");
					System.out.println("================================================");
					System.out.println(aux.toString());
				}
				
				//MOSTRANDO RESULTADOS DE INSTANCIA DE ARTICULO
				
				if(aux instanceof Libro) {
					System.out.println("Mostrando resultados de la instancia de Libro");
					System.out.println("================================================");
					System.out.println(aux.toString());
				}

				//MOSTRANDO RESULTADOS DE INSTANCIA DE ARTICULO
				
				if(aux instanceof Musica) {
					System.out.println("Mostrando resultados de la instancia de Musica");
					System.out.println("================================================");
					System.out.println(aux.toString());
				}

				//MOSTRANDO RESULTADOS DE INSTANCIA DE ARTICULO
				
				if(aux instanceof Pelicula) {
					System.out.println("Mostrando resultados de la instancia de Pelicula");
					System.out.println("================================================");
					System.out.println(aux.toString());
				}
			
			
		}
	}

}
