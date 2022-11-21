package clase5;

public class DBUtil {
	
	
	
	
	public Articulo[] obtenerResultados(String claveBusqueda) {
		Articulo a1 = new Articulo("soy una imagen1", "soy un titulo1" + claveBusqueda, "soy un autor1", 1000f);
		Articulo a2 = new Articulo("soy una imagen2", "soy un titulo2"+claveBusqueda, "soy un autor2", 2000f);
		Articulo a3 = new Articulo("soy una imagen3", "soy un titulo3"+claveBusqueda, "soy un autor3", 2000f);
		return new Articulo [] {a1,a2,a3};
	}

}
