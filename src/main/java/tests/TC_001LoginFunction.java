package tests;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_001LoginFunction {
	@Test
	public void loginFunction() {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
        System.out.println("Login successful");
	}

}
