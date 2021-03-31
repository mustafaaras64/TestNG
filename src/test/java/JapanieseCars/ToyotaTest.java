package JapanieseCars;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ToyotaTest {

	@Test
	public void Toyota_Corolla_Test() {
		System.out.println("Toyota_Corolla_Test");
	}
	
	@Test
	public void Toyota_Camry_Test() {
		System.out.println("Toyota_Camry_Test");
	}
	
	@Test
	public void Toyota_Rav4_Test() {
		System.out.println("Toyota_Rav4_Test");
	}
	
	@BeforeTest
	public void Toyota_Before_Test() {
			System.out.println("This text coming from ToyotaTest BeforeTest annotation");
	}
}
