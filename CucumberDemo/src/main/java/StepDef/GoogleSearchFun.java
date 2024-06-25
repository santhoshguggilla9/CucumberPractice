package StepDef;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


// Glue Code or  Step Definitions
public class GoogleSearchFun {

	WebDriver driver = null;
	WebElement search;
	
	@Given("user navigates urlGoogle")
	public void user_navigates_url_google() {
	    
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
	}

	@When("user enters the text as Testing in the search")
	public void user_enters_the_text_as_testing_in_the_search() {
	    // Write code here that turns the phrase above into concrete actions
	    
		search = driver.findElement(By.name("q"));
		System.out.println("To Verify the Title : " + driver.getTitle());
	}

	@And("user clicks on search button")
	public void user_clicks_on_search_button() {
	    // Write code here that turns the phrase above into concrete actions
	   search.sendKeys("testing" + Keys.ENTER);
	}

	@Then("user should be able to see the results page")
	public void user_should_be_able_to_see_the_results_page() {
	    // Write code here that turns the phrase above into concrete actions
		
		WebElement res  = driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div[1]/div/div/span/a/h3"));
		String actual = res.getText();
			
		String expected = actual;
		
		if(actual.equals(expected)) 
			System.out.println("Test Step Passsed: user in results page");
			else 
			System.out.println("Test Step Failed.");
		
		driver.close();
  
	}
}
