package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class stepdefclass {

	WebDriver driver;
	
	@Given("User launch Chrome browser")
	public void user_launch_chrome_browser() {

		driver=new ChromeDriver();	
	}

	@Given("User enters URL")
	public void user_enters_url() {
		driver.get("https://www.facebook.com/");
	}

	@Then("User enters Username and password")
	public void user_enters_username_and_password() {
		driver.findElement(By.id("email")).sendKeys("Surekha");
		driver.findElement(By.id("pass")).sendKeys("pass");
			}
	

	@Then("User click login")
	public void user_click_login() {
		driver.findElement(By.name("login")).click();
	}
	
	@Then("User enters {string} and {string}")
	public void user_enters_and(String username, String password) {
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("pass")).sendKeys(password);
	}
}
