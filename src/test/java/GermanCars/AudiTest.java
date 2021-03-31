package GermanCars;

import org.testng.annotations.Test;

public class AudiTest {

	@Test
	public void Audi_Q7_Test() {
		System.out.println("Audi_Q7_Test");
	}
	
	@Test
	public void Audi_A6_Test() {
		System.out.println("Audi_A6_Test");
	}
	
	@Test (groups= {"MyFavGermans"})
	public void Audi_RS4_Test() {
		System.out.println("Audi_RS4_Test");
	}
}
