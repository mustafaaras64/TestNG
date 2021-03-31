package AmericanCars;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TeslaTest {

	@BeforeTest
	public void Tesla_Before_Test() {
		System.out.println("This text coming from Tesla BeforeTest annotation");
	}

	@Test
	public void Tesla_ModelS_Test() {
		System.out.println("Tesla_ModelS_Test");
	}
	
	@Test
	public void Tesla_Model3_Test() {
		System.out.println("Tesla_Model3_Test");
	}
	
	@Test(groups={"MyFavAmericans"})
	public void Tesla_ModelX_Test() {
		System.out.println("Tesla_ModelX_Test");
	}
	
}
