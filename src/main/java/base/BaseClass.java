package base;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	@BeforeMethod
	public void preConditions() {
		ChromeDriver driver=new ChromeDriver();

	}
	@AfterMethod
	public void postConditions() {
		// TODO Auto-generated method stub

	}
}
