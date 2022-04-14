package Command;

public class Oficina {
	
	private ITratamientoPedido pedido;
	
	public void setCommand ( ITratamientoPedido pedido ) {
		
		this.pedido = pedido;
		
	}
	
	public void run () {
		
		this.pedido.tratar ();
		
	}

}
