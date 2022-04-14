package chain;

public class SubNumbers implements IChain {

	private IChain nextChain;
	
	@Override
	public void setNextChain ( IChain nextChain ) {
		
		this.nextChain = nextChain;
		
	}

	@Override
	public int calculate ( Numbers request ) {
		
		if ( "sub".equals( request.getOperation () ) ) {
				
				return request.getNumb1 () - request.getNumb2 ();
				
		}
			
		return nextChain.calculate ( request );
		
	}

}
