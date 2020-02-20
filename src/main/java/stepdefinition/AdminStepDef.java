package stepdefinition;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AdminStepDef extends Base{
	//static WebDriver driver;
	@Given("^User is in Organisation page$")
    public void user_is_in_organisation_page() throws Throwable {
		
		driver.switchTo().defaultContent();
		driver.findElement(By.id("admin")).click();
		 
    }

    @When("^user is in general information page$")
    public void user_is_in_general_information_page() throws Throwable {
    	
         
    }

    @Then("^Enter the details$")
    public void enter_the_details() throws Throwable {
    	driver.findElement(By.id("btnSaveGenInfo")).click();
		 driver.findElement(By.id("organization_name")).sendKeys("walmart");
		
		 
		 driver.findElement(By.id("organization_taxId")).sendKeys("123456");
		 driver.findElement(By.id("organization_registraionNumber")).sendKeys("123456");
		 driver.findElement(By.id("organization_phone")).sendKeys("7702329105");
		 driver.findElement(By.id("organization_email")).sendKeys("soumya@gmail.com");
		 Select dpcountry = new Select(driver.findElement(By.id("organization_country")));
		 dpcountry.selectByVisibleText("Algeria");
		
		 
        
    }

    @And("^click on save button$")
    public void click_on_save_button() throws Throwable {
    	 driver.findElement(By.id("btnSaveGenInfo")).click();
    }

}
