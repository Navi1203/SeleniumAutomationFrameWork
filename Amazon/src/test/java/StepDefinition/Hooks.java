package StepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;

public class Hooks {

	protected static WebDriver driver;
	
	@BeforeAll
	public static void setup()
	{
		driver = new ChromeDriver();
	}
	
//	@AfterAll
//	public static void teardown() {
//		driver.quit();
//	}
}
