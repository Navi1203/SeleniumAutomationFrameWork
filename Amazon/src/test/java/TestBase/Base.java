package TestBase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;

public class Base {

	
	WebDriver driver;
	@BeforeClass
	public void launchBrowser() {
		
		ConfigReader configReader = new ConfigReader();
        String url = configReader.getProperty("url");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver-win64\\chromedriver.exe");
		
		ChromeOptions options =  new ChromeOptions();
		options.addArguments("--remote-allow-origins+*");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.get(url);
	}
}
