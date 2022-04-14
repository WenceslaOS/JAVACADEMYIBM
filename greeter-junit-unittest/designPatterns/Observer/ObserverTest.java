package Observer;

public class ObserverTest {

	public static void main(String[] args) {
		
		StockSubjectChallenge stockSubjectChallenge =
                new StockSubjectChallenge ( new String[] {"IBM",
        "APPLE", "ORACLE", "GOOGLE", "INTEL" } );

        StockObserverChallenge stockObserverChallenge1 =
                new StockObserverChallenge ( stockSubjectChallenge );
        StockObserverChallenge stockObserverChallenge2 =
                new StockObserverChallenge ( stockSubjectChallenge );
        StockObserverChallenge stockObserverChallenge3 =
                new StockObserverChallenge ( stockSubjectChallenge );

        stockObserverChallenge1.observerConfig( new String[] { "IBM", "APPLE"} );
        stockObserverChallenge3.observerConfig( new String[] { "IBM", "ORACLE"} );
        stockObserverChallenge2.observerConfig( new String[] { "ORACLE", "GOOGLE" } );

        stockSubjectChallenge.setPrice ( "IBM" );
        System.out.println ( "\n---------------------------\n" );
        stockSubjectChallenge.setPrice ( "APPLE" );
        System.out.println ( "\n---------------------------\n" );
        stockSubjectChallenge.setPrice ( "GOOGLE" );
        System.out.println ( "\n---------------------------\n" );
        stockSubjectChallenge.setPrice ( "ORACLE" );
        System.out.println ( "\n---------------------------\n" );
        stockSubjectChallenge.setPrice ( "INTEL" );
        System.out.println ( "\n---------------------------\n" );
        stockSubjectChallenge.setPrice ( "DANONE" );

	}
	
	/* Terminal:
	 * 
	 * 	ObserverId: 1

		IBM price: 443
		APPLE price: null
		ORACLE price: null
		GOOGLE price: null
		INTEL price: null
		
		
		
		ObserverId: 3
		
		IBM price: 443
		APPLE price: null
		ORACLE price: null
		GOOGLE price: null
		INTEL price: null
		
		
		
		
		---------------------------
		
		ObserverId: 1
		
		IBM price: 443
		APPLE price: 94
		ORACLE price: null
		GOOGLE price: null
		INTEL price: null
		
		
		
		
		---------------------------
		
		ObserverId: 2
		
		IBM price: 443
		APPLE price: 94
		ORACLE price: null
		GOOGLE price: 92
		INTEL price: null
		
		
		
		
		---------------------------
		
		ObserverId: 2
		
		IBM price: 443
		APPLE price: 94
		ORACLE price: 131
		GOOGLE price: 92
		INTEL price: null
		
		
		
		ObserverId: 3
		
		IBM price: 443
		APPLE price: 94
		ORACLE price: 131
		GOOGLE price: 92
		INTEL price: null
		
		
		
		
		---------------------------
		
		
		---------------------------
		
		El stock no existe
		
	 */

}
