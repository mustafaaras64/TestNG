package GermanCars;

import org.testng.annotations.Test;

public class MercedesTest {

	@Test (groups= {"MyFavGermans"})
	public void Mercedes_S300_Test() {
		System.out.println("Mercedes_S300_Test");
	}
	
	@Test
	public void Mercedes_c63_Test() {
		System.out.println("Mercedes_c63_Test");
	}
	
	@Test (dependsOnMethods= {"Mercedes_c63_Test"})
	public void Mercedes_GLC_Test() {
		System.out.println("Mercedes_GLC_Test");
	}
}
