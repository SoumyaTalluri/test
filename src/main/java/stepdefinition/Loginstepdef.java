package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Loginstepdef extends Base{
	
 
	 @Given("^User is login page$")
	    public void user_is_login_page() throws Throwable {
		 //Base b = new Base();
            launchingDriver();
	        
	    }

	    @When("^title of page is orangehrm$")
	    public void title_of_page_is_orangehrm() throws Throwable {
	    	String title= driver.getTitle();
       	 System.out.println(title);
	        
	    }

	    @Then("^Enter Username and password$")
	    public void enter_username_and_password() throws Throwable {
	    	 driver.findElement(By.id("txtUsername")).sendKeys("opensourcecms");
             driver.findElement(By.id("txtPassword")).sendKeys("opensourcecms");
	    }

	    @And("^click on button$")
	    public void click_on_button() throws Throwable {
	    	
	    	driver.findElement(By.xpath("//input[@name=\"Submit\"]")).click();
	    	Thread.sleep(2000);
			 
	    }




}
