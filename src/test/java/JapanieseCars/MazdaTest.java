package JapanieseCars;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class MazdaTest {

	@Test (enabled=false)
	public void Mazda_3_Test() {
		System.out.println("Mazda_3_Test");
	}
	
	@Test
	public void Mazda_6_Test() {
		System.out.println("Mazda_6_Test");
	}
	
	@Test
	public void Mazda_CX5_Test() {
		System.out.println("Mazda_CX5_Test");
	}
	@BeforeSuite
	public void Mazda_Before_Suite() {
		System.out.println("This text coming from MazdaTest BeforeSuite annotation");
	}
}
