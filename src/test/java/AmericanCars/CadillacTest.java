package AmericanCars;

import org.testng.annotations.Test;

public class CadillacTest {

	@Test
	public void Cadillac_Escalade_Test() {
		System.out.println("Cadillac_Escalade_Test");
	}
	
	@Test
	public void Cadillac_XT5_Test() {
		System.out.println("Cadillac_XT5_Test");
	}
	
	@Test (dependsOnMethods= {"Cadillac_Escalade_Test"})
	public void Cadillac_CT6_Test() {
		System.out.println("Cadillac_CT6_Test");
	}
}
