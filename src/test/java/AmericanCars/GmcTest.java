package AmericanCars;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class GmcTest {

	@Test
	public void Gmc_Acadia_Test() {
		System.out.println("Gmc_Acadia_Test");
	}
	
	@Test (dataProvider="getData")
	public void Gmc_Yukon_Test(String username, String password) {
		System.out.println("Gmc_Yukon_Test");
		System.out.println("This text coming from GmcTest @DataProvider annotation: "+username);
		System.out.println("This text coming from GmcTest @DataProvider annotation: "+password);
	}
	
	@Test
	public void Gmc_Terrain_Test() {
		System.out.println("Gmc_Terrain_Test");
	}
	
	@DataProvider
	public Object[][] getData(){
		Object[][] data = new Object[3][2];
		//for 1st
		data[0][0]="firstUsername";
		data[0][1]="firstPassword";
		//for 2nd
		data[1][0]="secondUsername";
		data[1][1]="secondPassword";
		//for 3rd
		data[2][0]="thirdUsername";
		data[2][1]="thirdPassword";
		return data;
	}
	
}
