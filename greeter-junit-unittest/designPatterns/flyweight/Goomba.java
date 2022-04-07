package flyweight;

public class Goomba implements IEnemy {
	
	public String level;
	public final String life;
	
	public Goomba () {
		
		this.life = "300";
		
	}

	@Override
	public void setLevel ( String level ) {
		
		this.level = level;
		System.out.println ("Level: " + this.level );
		
	}

	@Override
	public void lifePoints () {
		
		System.out.println ( "Life Points: " + this.life + "\n" );
		
	}

}
