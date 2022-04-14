package Observer;

import java.util.Random;

public class StockWatcher {
	
	private static  StockWatcher stockWatcher = null;

    private StockWatcher () {

    }

    public static StockWatcher getInstance () {

        if ( stockWatcher == null )

            return stockWatcher = new StockWatcher ();

        else

            return stockWatcher;

    }

    public static Integer generateStockPrice () {

        Random rand = new Random();
        int randPrice = rand.nextInt( 500 );

        return randPrice;
    }

}
