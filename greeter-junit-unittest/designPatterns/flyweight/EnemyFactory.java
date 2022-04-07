package flyweight;

import java.util.HashMap;

public class EnemyFactory {

	private static HashMap < String, IEnemy > enemies = new HashMap <>();
	
	public static IEnemy getEnemy ( String type ) {
		
		IEnemy enemy = null;
		
		if ( enemies.containsKey( type ) ) {
			
			enemy = enemies.get( type );
			System.out.println ( "Re Used " + type );
			
		}
		else {
			
			switch ( type ) {
			
			case "Koopa":
				
				System.out.println ( "Koopa Created" );
				enemy = new Koopa ();
				break;
				
			case "Goomba":
				
				System.out.println ( "Goomba Created" );
				enemy = new Goomba ();
				break;
				
			default:
			
				System.out.println ( "There isnt new enemies created" );
				break;
				
			}
			
			enemies.put( type, enemy );
			
		}
		
		
		return enemy;
		
	}
	
}
