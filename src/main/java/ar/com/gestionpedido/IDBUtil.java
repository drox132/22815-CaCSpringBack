package ar.com.gestionpedido;

import java.util.Collection;
import java.util.Date;

public interface IDBUtil<T> {
	
	public void agregar(T algo) throws ListaPedidoVaciaException;
	public T obtenerMayorUnidades();
	public Double totalFacturado();
	public Collection<T> obtenerPedidosFechas(Date f1,Date f2);
}
