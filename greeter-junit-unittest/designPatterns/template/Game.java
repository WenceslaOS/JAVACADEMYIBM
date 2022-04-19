package template;

public abstract class Game {
	
	abstract void initialize ();
	abstract void start ();
	abstract void end ();
	
	public void play () {
		
		initialize ();
		start ();
		end ();
		
	}

}
