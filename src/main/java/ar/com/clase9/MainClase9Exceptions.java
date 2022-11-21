package clase9;


public class MainClase9Exceptions {

	public static void main(String[] args) {
	
	//==============================================
		//EXCEPTIONS NO CNTROLADAS ESTAS SON DE TIPO RUNTIMEEXCEPTIONS	
	/*	
		int valor1 = 10;
		int valor2 = 0;
		
		int resultadoDiv= valor1/valor2;
		System.out.println(resultadoDiv);
	*/	
		//exection de tipo runtimeException
		//java.lang.ArithmeticException:
	/*	
		Articulo a;
		a= new Libro(null, null, null, 0, null, null);
		
		Libro l = (Libro)a; //esto esta bien 
		Musica m = (Musica)a;//esto arroja una exception
		System.out.println(m.getAutor());
		
		//java.lang.ClassCastException:
	*/	
	/*	
		String palabras[]=new String[] {};
		palabras[0]= "Hola";
		palabras[1]= "como";
		palabras[2]= "estan";
		System.out.println(palabras[3]);
	*/	
		//java.lang.ArrayIndexOutOfBoundsException
	
	//========================================================================
		
		
		
	}

}
