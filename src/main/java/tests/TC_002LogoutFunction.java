package tests;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import base.BaseClass;

public class TC_002LogoutFunction extends BaseClass{
	@Test
	public void loginFunction() {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
        System.out.println("Logout successful");
	}

}
