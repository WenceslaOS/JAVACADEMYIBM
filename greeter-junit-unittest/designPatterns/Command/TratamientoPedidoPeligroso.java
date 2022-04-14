package Command;

public class TratamientoPedidoPeligroso implements ITratamientoPedido {
	
	private PedidoPeligroso pedido;
	
	public TratamientoPedidoPeligroso () {
		
		super();
		this.pedido = new PedidoPeligroso ();
		
	}

	@Override
	public void tratar () {
		
		System.out.println ( this.pedido.instrucciones () + 
				"\nPeso: " + this.pedido.getPeso () );
		
	}

}
