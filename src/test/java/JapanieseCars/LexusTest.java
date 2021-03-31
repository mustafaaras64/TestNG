package JapanieseCars;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

public class LexusTest {

	@Test
	public void Lexus_LX_Test() {
		System.out.println("Lexus_LX_Test");
	}
	
	@Test
	public void Lexus_GS_Test() {
		System.out.println("Lexus_GS_Test");
	}
	
	@Test
	public void Lexus_RC_Test() {
		System.out.println("Lexus_RC_Test");
	}
	
	@AfterSuite
	public void Lexus_After_Suite() {
		System.out.println("This text coming from LexusTest AfterSuite annotation");
	}
}
