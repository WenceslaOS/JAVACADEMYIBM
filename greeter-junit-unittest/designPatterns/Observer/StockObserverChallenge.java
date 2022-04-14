package Observer;

import java.util.ArrayList;
import java.util.List;

public class StockObserverChallenge implements IObserver {
	
	private static int observerIdGenerator = 0;
    private int observerId;
    private List <String> stocks = new ArrayList <> ();
    private int k;

    public StockObserverChallenge ( ISubject stockSubject ) {

        stockSubject.register (this );
        observerId = ++observerIdGenerator;

    }

    @Override
    public void observerConfig ( String [] stockNames ) {

        k = stockNames.length;

        for ( int i = 0; i < stockNames.length; i++ ) {

            this.stocks.add ( stockNames [i] );

        }

    }

    @Override
    public void update ( List < Stock > stocks, String stockName ) {

        if ( this.stocks.contains ( stockName ) ) {

            System.out.println ( "ObserverId: " + observerId + "\n");

            for ( Stock value : stocks ) {

                System.out.println ( value.getName () + " price: " + value.getPrice () );

            }
            
            System.out.println ( "\n\n");

        }

    }

}
