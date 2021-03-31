package AmericanCars;

import org.testng.annotations.Test;

public class ChevyTest {

	@Test
	public void Chevy_Silverado_Test() {
		System.out.println("Chevy_Silverado_Test");
	}
	
	@Test
	public void Chevy_Impala_Test() {
		System.out.println("Chevy_Impala_Test");
	}
	
	@Test (groups= {"MyFavAmericans"})
	public void Chevy_Camaro_Test() {
		System.out.println("Cadillac_Camaro_Test");
	}
}
