package toscaPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginTosca {

	WebDriver driver = null;

	@Before
	public void beforeScenario()
	{
		System.out.println("Executing before scenario");
		
	}
	
	@Given("user is on the login page")
	public void user_is_on_the_login_page() {
	    // Write code here that turns the phrase above into concrete actions
	    driver = new ChromeDriver();
	    driver.get("https://demowebshop.tricentis.com/");
	    driver.manage().window().maximize();
	    
	}
	@Then("user should click on the login link")
	public void user_should_click_on_the_login_link() {
	    // Write code here that turns the phrase above into concrete actions
		WebElement loginLink = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a"));
	    loginLink.click();
	}
	@When("^user enter valid (.*) and (.*)$")
	public void user_enter_valid_username_and_password(String uname, String pwd) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("Email")).sendKeys(uname);
		driver.findElement(By.id("Password")).sendKeys(pwd);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
	}
	
	@Then("user should able to see the dashboard")
	public void user_should_able_to_see_the_dashboard() {
		System.out.println(driver.getTitle());
		System.out.println("User is on dash board page");
	}
	@Then("user should click on logout button")
	public void user_should_click_on_logout_button() {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.xpath("//a[@class='ico-logout']")).click();
	}
	@Then("user should able to see the login page")
	public void user_should_able_to_see_the_login_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println(driver.getTitle());
		System.out.println("User is on login page");
	}
	@When("^user enter invalid (.*) and (.*)$")
	public void user_enter_invalid_username_and_password(String uname, String pwd) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("Email")).sendKeys(uname);
		driver.findElement(By.id("Password")).sendKeys(pwd);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
	}
	@Then("user should able to see error message")
	public void user_should_able_to_see_error_message() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("user getting the error message");
	}
	
	@After
	public void afterScenario()
	{
		System.out.println("Executing after scenario");
		driver.close();
	}
	
}
