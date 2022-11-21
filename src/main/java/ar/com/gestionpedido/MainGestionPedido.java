package ar.com.gestionpedido;

import java.util.Collection;
import java.util.Date;
import java.util.Iterator;

public class MainGestionPedido {

	public MainGestionPedido() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws ListaPedidoVaciaException{

		DBUtilPedido db = new DBUtilPedido();
		db.agregar(new Pedido("Dorito", 500D, 100, new Date()));
		db.agregar(new Pedido("Refles", 600D, 50, new Date()));
		db.agregar(new Pedido("Cheetos", 450D, 80, new Date()));
		db.agregar(new Pedido("CheseTress", 750D, 150, new Date()));
		db.agregar(new Pedido("Pixis", 150D, 60, new Date()));
		db.agregar(new Pedido("Snaks", 300D, 20, new Date()));
		db.agregar(new Pedido("Palitos", 150D, 30, new Date()));
		
		Collection<Pedido>listaPedido = db.getListaDePedidos();
		
		 for(Pedido p: listaPedido) {
			 System.out.println(p.toString());
		 }
	}

}
