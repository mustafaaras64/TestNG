package JapanieseCars;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NissanTest {

	@Test 
	public void Nissan_Maxima_Test() {
		System.out.println("Nissan_Maxima_Test");
	}
	
	@Test
	public void Nissan_Altima_Test() {
		System.out.println("Nissan_Altima_Test");
	}
	
	@Test (enabled=true)
	public void Nissan_Roque_Test() {
		System.out.println("Nissan_Roque_Test");
	}
	
	@BeforeMethod
	public void Nissan_Before_Method() {
		System.out.println("This text coming from NissanTest BeforeMethod annotation");
	}
}
