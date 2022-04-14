package chain;

public interface IChain {
	
	void setNextChain ( IChain nextChain );
	int calculate ( Numbers request );

}
