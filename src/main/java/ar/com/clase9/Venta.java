package clase9;

public class Venta {
	
	private String nombreComprador;
	private Double montoVendido;
	private IPagador medioDePago;
	
	public Venta(String nombreComprador, Double montoVendido, IPagador medioDePago) {
		this.nombreComprador = nombreComprador;
		this.montoVendido = montoVendido;
		this.medioDePago = medioDePago;
	}

	public String getNombreComprador() {
		return nombreComprador;
	}

	public void setNombreComprador(String nombreComprador) {
		this.nombreComprador = nombreComprador;
	}

	public Double getMontoVendido() {
		return montoVendido;
	}

	public void setMontoVendido(Double montoVendido) {
		this.montoVendido = montoVendido;
	}

	public IPagador getMedioDePago() {
		return medioDePago;
	}

	public void setMedioDePago(IPagador medioDePago) {
		this.medioDePago = medioDePago;
	}
	
	
	

}
