package com.cg.capgemini.cap_product;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FeatureFileDefinition {
	WebDriver driver ;
	WebElement element;
	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Sanskar Modi\\Desktop\\M4\\Demos\\ChromeDriver\\chromedriver.exe" );
		
		driver= new ChromeDriver();
	}

	
	@Given("^User is in Capstore product home page$")
	public void user_is_in_Capstore_product_home_page() throws Throwable {
//	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sanskar Modi\\Desktop\\M4\\Demos\\ChromeDriver\\chromedriver.exe");
//		driver = new ChromeDriver();
		driver.navigate().to("http://localhost:4200/app-search");
	    }

	@When("^User clicks on Men$")
	public void user_clicks_on_Men() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"collapsibleNavbar\"]/ul/li[1]/a")).click();
	}

	@Then("^The user should be navigated to mens page$")
	public void the_user_should_be_navigated_to_mens_page() throws Throwable {
		driver.close();
	    
	}

}
