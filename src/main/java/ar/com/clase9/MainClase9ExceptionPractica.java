package clase9;

public class MainClase9ExceptionPractica {

	public static void main(String[] args) {
		
		/*
		 * Venta venta1;
		 * 
		 * Pepito pepito; try { venta1 = new Venta("Francisco", 500d, new Pepito());
		 * pepito = new Pepito(); pepito.pagar(venta1.getMontoVendido()); } catch
		 * (ExcepcionMedioPagoInvalido| ExcepcionMontoPagoInvalido e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */
		
		Venta venta2;
		Visa visa;
		try { 
			venta2 = new Venta("Francisco", 500d, new Visa());
			visa = new Visa();
			visa.pagar(venta2.getMontoVendido()); 
		} catch (ExcepcionMedioPagoInvalido| ExcepcionMontoPagoInvalido e) { 
			
		  e.printStackTrace(); }

		
	}

}
