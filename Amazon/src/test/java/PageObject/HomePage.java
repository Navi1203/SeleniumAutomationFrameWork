package PageObject;

import org.openqa.selenium.By;

import TestBase.Base;

public class HomePage extends Base {
	
	By WelcomeMessage = By.xpath("//span[@id='nav-link-accountList-nav-line-1']");
	
	public String welcomMessage() {
		
		String welcomeMessage = driver.findElement(WelcomeMessage).getText();
		
		return welcomeMessage;
	}
}
