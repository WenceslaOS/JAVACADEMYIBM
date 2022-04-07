package Facade;

public class FacadeTest {

	public static void main(String[] args) {
		
		WebFacade webFacade = new WebFacade ();
		webFacade.doSomethingBillingSystem ();
		webFacade.doSomethingCrmSystem ();
		webFacade.doSomethingEmailSystem ();
		
	}

}
