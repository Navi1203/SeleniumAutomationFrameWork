package StepDefinition;

import org.junit.Assert;

import PageObject.HomePage;
import PageObject.LoginPage;
import io.cucumber.java.en.*;

public class Amazon_StepDefinition {

	LoginPage loginpage = new LoginPage();
	HomePage homepage = new HomePage();
	
	@Given("Launch the Web page")
	public void launch_the_web_page() {
	    
		loginpage.launchURL();
	}
	@Then("Enter username {string} and password {string}")
	public void enter_username_and_password(String email, String password) {

		loginpage.enterEmail(email);
		loginpage.clickContinue();
		loginpage.enterPassword(password);
	}
	@Then("Click on submit button")
	public void click_on_submit_button() {
	    
		loginpage.clickSignin();
	}
	@Then("Verify the login is successful by checking {string}")
	public void verify_the_login_is_successful_by_checking(String title) {

		Assert.assertEquals(title, homepage.welcomMessage());
	}
	

}
