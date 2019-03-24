import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MyTest {

	@Test
	@Parameters({"name"})
	public void FirstTest(@Optional("TNT") String name) {
		System.setProperty("webdriver.chrome.driver","C:/Selenium/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		System.out.print("Gia tri lay trong testng la " + name);
		driver.close();
		
	}
}
