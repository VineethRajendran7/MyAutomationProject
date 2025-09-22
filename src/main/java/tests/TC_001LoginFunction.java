package tests;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import base.BaseClass;

public class TC_001LoginFunction extends BaseClass {
	@Test
	public void loginFunction() {
		
		driver.manage().window().maximize();
        System.out.println("Login successful");
	}

}
