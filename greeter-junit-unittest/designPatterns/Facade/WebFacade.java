package Facade;

public class WebFacade {
	
	ISystem billingSystem;
	ISystem crmSystem;
	ISystem emailSystem;
	
	public WebFacade () {
		
		billingSystem = new BillingSystem ();
		crmSystem = new CrmSystem ();
		emailSystem = new EmailSystem ();
		
	}

	public void doSomethingBillingSystem () {
		
		billingSystem.doSomething ();
		
	}
	
	public void doSomethingCrmSystem () {
		
		crmSystem.doSomething ();
		
	}

	public void doSomethingEmailSystem () {
	
		emailSystem.doSomething ();
	
	}
	
}
