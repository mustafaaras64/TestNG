package GermanCars;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BmwTest {

	@Test (groups= {"MyFavGermans"})
	public void Bmw_M4_Test() {
		System.out.println("Bmw_M4_Test");
	}
	
	@Test
	public void Bmw_550i_Test() {
		System.out.println("Bmw_550i_Test");
	}
	
	@Parameters({"URL", "APIKey"})
	@Test
	public void Bmw_X5_Test(String urlname, String key) {
		System.out.println("Bmw_X5_Test");
		System.out.println("This text coming from BmwTest testNG parameterization: "+urlname);
		System.out.println("This text coming from BmwTest testNG parameterization: "+key);
	}
}
