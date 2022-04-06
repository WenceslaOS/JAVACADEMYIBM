package decorator;

public class DecoratorTest {

	public static void main(String[] args) {
		
		Cafe cafeNormal = new Normal ();
		System.out.println ( "Typo: " + cafeNormal.descripcion () +
				".\n Precio: "+ cafeNormal.precio () );
		
		Cafe cafeNormalConLeche = new Normal ();
		cafeNormalConLeche = new LecheDecorator ( cafeNormalConLeche );
		System.out.println ( "Typo: " + cafeNormalConLeche.descripcion () +
				".\n Precio: "+ cafeNormalConLeche.precio () );
		
		Cafe cafeDescafeinadoConLecheConAzucar = new Descafeinado ();
		cafeDescafeinadoConLecheConAzucar = new LecheDecorator ( cafeDescafeinadoConLecheConAzucar );
		cafeDescafeinadoConLecheConAzucar = new AzucarDecorator ( cafeDescafeinadoConLecheConAzucar );
		System.out.println ( "Typo: " + cafeDescafeinadoConLecheConAzucar.descripcion () +
				".\n Precio: "+ cafeDescafeinadoConLecheConAzucar.precio () );
		
	}
	
}
