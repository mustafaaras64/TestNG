package AmericanCars;

import org.testng.annotations.Test;

public class JeepTest {

	@Test (priority=1)
	public void Jeep_Grandcherokee_Test() {
		System.out.println("Jeep_Grandcherokee_Test");
	}
	
	@Test (priority=2)
	public void Jeep_Cherokee_Test() {
		System.out.println("Jeep_Cherokee_Test");
	}
	
	@Test (priority=3)
	public void Jeep_Rubicon_Test() {
		System.out.println("Jeep_Rubicon_Test");
	}
}
