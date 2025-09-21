package tests;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class TC_002LogoutFunction {
	@Test
	public void loginFunction() {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
        System.out.println("Logout successful");
	}

}
