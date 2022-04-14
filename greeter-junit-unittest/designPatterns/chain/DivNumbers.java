package chain;

public class DivNumbers implements IChain {

	private IChain nextChain;
	
	@Override
	public void setNextChain ( IChain nextChain ) {
		
		this.nextChain = nextChain;
		
	}

	@Override
	public int calculate ( Numbers request ) {
		
		if ( "div".equals( request.getOperation () ) ) {
			
			return request.getNumb1 () / request.getNumb2 ();
			
		}
		
		return Integer.MAX_VALUE;
	}

}
