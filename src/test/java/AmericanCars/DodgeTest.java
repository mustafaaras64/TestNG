package AmericanCars;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class DodgeTest {

	@Test
	public void Dodge_Durango_Test() {
		System.out.println("Dodge_Durango_Test");
	}
	
	@Test
	public void Dodge_Challenger_Test() {
		System.out.println("Dodge_Challenger_Test");
	}
	
	@Test (groups= {"MyFavAmericans"})
	public void  Dodge_Charger_Test() {
		System.out.println("Dodge_Charger_Test");
	}
	
	@AfterTest
	public void Dodge_After_Test() {
		System.out.println("This text coming from DodgeTest AfterTest annotation");
	}
}
