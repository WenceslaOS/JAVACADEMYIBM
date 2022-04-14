package Command;

import java.util.ArrayList;
import java.util.List;

public class TratamientoPedidoMultiple implements ITratamientoPedido {

	private List < Pedido > pedidos = new ArrayList <> ();
	
	
	public TratamientoPedidoMultiple (List < Pedido > pedidos) {
		
		super();
		this.pedidos = pedidos;
		
	}


	@Override
	public void tratar () {
		
		for (Pedido value : this.pedidos ) {
			
			System.out.println ( "Peso: " + value.getPeso () );
			value.isUrgente ();
			
		}
		
	}

}
