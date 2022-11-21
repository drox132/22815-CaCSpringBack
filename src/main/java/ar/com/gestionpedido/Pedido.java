package ar.com.gestionpedido;

import java.util.Date;

public class Pedido implements Comparable<Pedido> {

	private String producto;
	private Double precioUnitario;
	private int unidades;
	private Date fechaPedido;
	
	DBUtilPedido db = new DBUtilPedido();
	
	public Pedido(String producto, Double precioUnitario, int unidades, Date fechaPedido) throws ListaPedidoVaciaException {
		this.setProducto(producto);
		this.setPrecioUnitario(precioUnitario);
		this.setUnidades(unidades);
		this.setFechaPedido(fechaPedido);
	
	}

	public String getProducto() {
		return producto;
	}

	public void setProducto(String producto) {
		this.producto = producto;
	}

	public Double getPrecioUnitario() {
		return precioUnitario;
	}

	public void setPrecioUnitario(Double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}

	public int getUnidades() {
		return unidades;
	}

	public void setUnidades(int unidades) {
		this.unidades = unidades;
	}

	public Date getFechaPedido() {
		return fechaPedido;
	}

	public void setFechaPedido(Date fechaPedido) {
		this.fechaPedido = fechaPedido;
	}

	
	@Override
	public String toString() {
		return "Pedido [producto=" + producto + ", precioUnitario=" + precioUnitario + ", unidades=" + unidades
				+ ", fechaPedido=" + fechaPedido + "]";
	}

	@Override
	public int compareTo(Pedido o) {
		
		return 0;
	}

	
	
}
