package GermanCars;

import org.testng.annotations.Test;

public class VolkswagenTest {

	@Test
	public void Volkswagen_Atlas_Test() {
		System.out.println("Volkswagen_Atlas_Test");
	}
	
	@Test (groups= {"MyFavGermans"})
	public void Volkswagen_Arteon_Test() {
		System.out.println("Volkswagen_Arteon_Test");
	}
	
	@Test
	public void Volkswagen_Tiguan_Test() {
		System.out.println("Volkswagen_Tiguan_Test");
	}
}
