package flyweight;

import java.util.Random;

public class FlyweightTest {

	public static String[] level = { "NormalPower", "MediumPower", "MaxPower" };
	public static String[] enemyType = { "Koopa", "Goomba"};
	
	public static void main(String[] args) {
		
		for ( int i =0; i<20; i++ ) {
			
			IEnemy enemyFactory = EnemyFactory.getEnemy ( randomEnemy () );
			enemyFactory.setLevel ( randomLevel () );
			enemyFactory.lifePoints ();
		}

	}
	
	public static String randomEnemy () {
		
		Random enemyRandom = new Random ();
		int selecRandom = enemyRandom.nextInt( enemyType.length );
		
		return enemyType [ selecRandom ];
		
	}
	
	public static String randomLevel () {
		
		Random levelRandom = new Random ();
		int selec1Random = levelRandom.nextInt( level.length );
		
		return level [ selec1Random ];
		
	}

}
