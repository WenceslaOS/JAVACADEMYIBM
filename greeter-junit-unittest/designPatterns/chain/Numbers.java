package chain;

public class Numbers {

	private int numb1;
	private int numb2;
	private String operation;
	
	public Numbers ( int numb1, int numb2, String operation ) {
		super();
		this.numb1 = numb1;
		this.numb2 = numb2;
		this.operation = operation;
	}

	public int getNumb1() {
		return numb1;
	}

	public int getNumb2() {
		return numb2;
	}

	public String getOperation() {
		return operation;
	}
	
}
