package Command;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CommandTest {

	public static void main(String[] args) {
		
		List < Pedido > pedidos = new ArrayList <> ();
		
		Collections.addAll ( pedidos, new Pedido ( 100, "Si" ), new Pedido ( 1000, "Si" ),
				new Pedido ( 400, "No" ) );
		
		TratamientoPedidoPeligroso tratamientoPedidoPeligroso = new TratamientoPedidoPeligroso ();
		TratamientoPedidoMultiple tratamientoPedidoMultiple = new TratamientoPedidoMultiple ( pedidos );
		
		Oficina oficina = new Oficina ();
		oficina.setCommand( tratamientoPedidoMultiple );
		oficina.run();
		
		System.out.println ("\n------------------------------------\n" );
		
		oficina.setCommand( tratamientoPedidoPeligroso );
		oficina.run();

	}
	
	/* Terminal:
	 * 
	 * 	Peso: 100
		Es Urgente
		Peso: 1000
		Es Urgente
		Peso: 400
		No es Urgente 
		
		------------------------------------
		
		Tratar con cuidado, articulo peligroso
		Peso: 10000
		
	 */

}
