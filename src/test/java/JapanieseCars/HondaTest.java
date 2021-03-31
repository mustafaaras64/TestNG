package JapanieseCars;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class HondaTest {
	
	@Test
	public void Honda_Civic_Test() {
		System.out.println("Honda_Civic_Test");
	}
	
	@Test
	public void Honda_HRV_Test() {
		System.out.println("Honda_HRV_Test");
	}
	
	@Test (timeOut=3000)
	public void Honda_CRV_Test() {
		System.out.println("Honda_CRV_Test");
	}
	
	@AfterTest
	public void Honda_After_Test() {
			System.out.println("This text coming from HondaTest AfterTest annotation");
	}
}
