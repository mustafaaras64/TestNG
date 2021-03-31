package AmericanCars;

import org.testng.annotations.Test;

public class ChryslerTest {

	@Test (priority=2)
	public void Chrysler_300S_Test() {
		System.out.println("Chrysler_300S_Test");
	}
	
	@Test(priority=1)
	public void Chrysler_200_Test() {
		System.out.println("Chrysler_200_Test");
	}
	
	@Test
	public void Chrysler_Pacifica_Test() {
		System.out.println("Chrysler_Pacifica_Test");
	}
}
