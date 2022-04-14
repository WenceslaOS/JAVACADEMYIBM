package Observer;

import java.util.ArrayList;
import java.util.List;

public class StockSubjectChallenge implements ISubject{
	
	private List < Stock > stocks = new ArrayList <> ();
    private List < IObserver > observers = new ArrayList <> ();
    private String stockName;

    public StockSubjectChallenge ( String [] stockNames ) {

        for ( int i =0; i < stockNames.length; i++ ) {

            this.stocks.add ( new Stock ( stockNames [i] ) );

        }

    }

    @Override
    public void register ( IObserver observer ) {

        observers.add ( observer );

    }

    @Override
    public void ungister ( IObserver observer ) {

        observers.remove ( observer );

    }

    @Override
    public void notifyObserver () {

        observers
                .stream()
                .forEach( o -> o.update ( stocks , this.stockName ) );

    }

    public boolean setPrice ( String stockName ) {

        this.stockName = stockName;
        StockWatcher stockWatcher = StockWatcher.getInstance ();

        for ( Stock value : this.stocks ) {

            if ( stockName.equals ( value.getName () ) ) {

                value.setPrice ( stockWatcher.generateStockPrice () );
                notifyObserver ();
                return true;

            }

        }

        System.out.println ( "El stock no existe" );
        return false;

    }

}
