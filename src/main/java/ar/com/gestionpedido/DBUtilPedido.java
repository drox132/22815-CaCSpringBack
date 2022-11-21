package ar.com.gestionpedido;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.TreeSet;

public class DBUtilPedido implements IDBUtil<Pedido> {
	
	private Collection<Pedido> listaDePedidos;
	
	

	public DBUtilPedido(Collection<Pedido> listaDePedidos) {
	setListaDePedidos(new ArrayList<Pedido>());
	}



	//GETTER AND SETTER
	public Collection<Pedido> getListaDePedidos() throws ListaPedidoVaciaException {
		if(this.listaDePedidos ==null) {
			throw new ListaPedidoVaciaException("La lista de Pedidos esta Vacia");
		}
		return listaDePedidos;
	}

	public void setListaDePedidos(Collection<Pedido> listaDePedidos) {
		this.listaDePedidos = listaDePedidos;
	}

	
	//METODOS IMPLEMENTADOS
	@Override
	public void agregar(Pedido algo) throws ListaPedidoVaciaException {
		this.listaDePedidos.add(algo);
	}

	@Override
	public Pedido obtenerMayorUnidades() {
		
		return null;
	}

	@Override
	public Double totalFacturado() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<Pedido> obtenerPedidosFechas(Date f1, Date f2) {
		// TODO Auto-generated method stub
		return null;
	}

	public DBUtilPedido() {
		// TODO Auto-generated constructor stub
	}

}
