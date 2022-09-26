package ar.com.poo;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//simulaaar que el usuario escribio algo
		
//		String claveUsuaaario= "Iron Man";
//		
//		Buscador miBuscador = new Buscador(claveUsuaaario);
//		
//		//luego le seteamos el valor de la vlave de busquda para que el metodo funcione y no de error
//		
//		//miBuscador.setClaveBusqueda(claveUsuaaario); esto ya no es necesario ya que creamos un constructor que reciba una clave de usuario
//		
//		 miBuscador.buscar();
//		 
//		 miBuscador.mostrarResultados();
		
		
        String claveBusqueda= "Iron Man";
		String claveOrdenamiento= "MAYORPRECIO";
        
		Buscador miBuscador = new Buscador(claveBusqueda);
		
		 miBuscador.buscar();
		miBuscador.ordenar(claveOrdenamiento); 
		claveOrdenamiento= "MASVENDIDOS";
		miBuscador.ordenar(claveOrdenamiento); 
		
		
	}

}
