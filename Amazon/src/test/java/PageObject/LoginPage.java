/**
 * 
 */
package PageObject;

import org.openqa.selenium.By;

import TestBase.Base;

public class LoginPage extends Base {

	By emailtxtbox = By.xpath("//input[@id='ap_email']");
	By continuebtn = By.xpath("//input[@type='submit']");
	By passwordtxtbox = By.xpath("//input[@id='ap_password']");
	By siginbtn = By.xpath("//input[@id='signInSubmit']");
	
	public void launchURL() {
		
		launchurl();
	}
	
	public void enterEmail(String email) {
		
		driver.findElement(emailtxtbox).sendKeys(email);
	}
	
	public void enterPassword(String password) {
		
		driver.findElement(passwordtxtbox).sendKeys(password);
	}

	public void clickContinue() {
		
		driver.findElement(continuebtn).click();
	}
	
	public void clickSignin() {
		
		driver.findElement(siginbtn).click();
	}
	
}	
