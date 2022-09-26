package ar.com.codoacodo.herencia;

public class DBUtil {
	
	public Articulo[] obtenerResultados (String palabraClave){
		
		Articulo a1 = new Articulo("titulo1"+palabraClave, "Francisco Burgos", "imagen/img1.jpg", 4630);
		Articulo a2 = new Articulo("titulo2"+palabraClave, "Mileydi Cabrera", "imagen/img2.jpg", 40630);
		
		Libro l1 = new  Libro ("titulo3"+palabraClave, "Melody Isabela", "imagen/img3.jpg", 90630, 100,"515585");
		Libro l2 = new  Libro ("titulo4"+palabraClave, "Desi Burgos", "imagen/img4.jpg", 9630, 10,"5944846");
		
		Musica m1 = new Musica ("titulo5"+palabraClave, "Julio Perez", "imagen/img5.jpg", 10000,"sello1", new String[] {} );
		Musica m2 = new Musica ("titulo6"+palabraClave, "Pepe Maraña", "imagen/img6.jpg", 19800,"sello2", new String[] {} );
		
		Pelicula p1 = new Pelicula ("titulo7"+palabraClave, "Pepito Feo", "imagen/img7.jpg", 10000,"Productora1", "Formato1");
		Pelicula p2 = new Pelicula ("titulo8"+palabraClave, "Pepito Lindo", "imagen/img8.jpg", 10000,"Productora2", "Formato2");
		
		
		return new Articulo [] {a1,a2,l1,l2,m1,m2,p1,p2};
	}

}
