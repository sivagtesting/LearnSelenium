package steps;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	
	@Before
	public void beforeScenario(Scenario sc) { //passing argument sc of type Scenario(Interface)
		System.out.println(sc.getName());
		System.out.println(sc.getId());
		System.out.println(sc.getStatus());
	}
	@After
	public void afterScenario(Scenario sc) { //passing argument sc of type Scenario(Interface)
		System.out.println(sc.getStatus());
	}


}
