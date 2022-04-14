package Observer;

import java.util.List;

public interface IObserver {
	
	void update ( List< Stock > stocks, String stockName);
    void observerConfig ( String [] stockNames );

}
