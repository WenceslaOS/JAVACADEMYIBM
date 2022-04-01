package abstractFactory;

public class AbstractFactoryTest {

	public static void main(String[] args) {

		ProviderFactory providerFactory = new ProviderFactory ();
		providerFactory.getFactory ( "Relacional", 1, 1);
		providerFactory.getFactory ( "NoSql", 2, 2 );
		
	

	}

}
