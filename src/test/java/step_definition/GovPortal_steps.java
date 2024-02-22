package step_definition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GovPortal_steps {
	WebDriver driver;
	@Given("Given User opens chrome browser and redirect to \\(indi.gov) website")
	public void given_user_opens_chrome_browser_and_redirect_to_indi_gov_website() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.india.gov.in/user/register");
	    
	}

	@When("User will enter {string}, {string},{string}, {string}")
	public void user_will_enter(String Username, String Email, String Firstname, String Lastname) {
		driver.findElement(By.id("edit-name")).sendKeys(Username);
		driver.findElement(By.id("edit-mail")).sendKeys(Email);
		driver.findElement(By.id("edit-profile-main-field-first-name-und-0-value")).sendKeys(Firstname);
		driver.findElement(By.id("edit-profile-main-field-last-name-und-0-value")).sendKeys(Lastname);
	    
	}

	@When("{string}, {string}, {string}, {string},{string}")
	public void string_string_string_string_string(String Country, String State, String Pin_code, String Education, String Captcha) throws InterruptedException {
		WebElement Dropdown_Country = driver.findElement(By.id("edit-profile-main-field-country-und"));
		Select country =new Select(Dropdown_Country);
		country.selectByVisibleText(Country);
		Thread.sleep(1000);
		//Selecting State
		WebElement Dropdown_State = driver.findElement(By.id("edit-profile-main-field-state-und-hierarchical-select-selects-0"));
		Select state =new Select(Dropdown_State);
		state.selectByVisibleText(State);
		Thread.sleep(1000);
		//Entering Pin code
		driver.findElement(By.id("edit-profile-main-field-pin-code-und-0-value")).sendKeys(Pin_code);
		Thread.sleep(1000);
		WebElement Dropdown_Education = driver.findElement(By.id("edit-profile-main-field-education-und"));
		Select education =new Select(Dropdown_Education);
		education.selectByVisibleText(Education);
		Thread.sleep(1000);
		driver.findElement(By.id("edit-captcha-response")).sendKeys(Captcha);

	   
	}

	@When("User Click on create new account")
	public void user_click_on_create_new_account() throws InterruptedException {
	   //driver.findElement(By.id("edit-submit")).click();
	   driver.navigate().refresh();
		Thread.sleep(2000);
	   
	}

	@Then("account created successfully")
	public void account_created_successfully() throws InterruptedException {
		Alert al=driver.switchTo().alert();
     	al.accept();
		driver.close();
	  
	}
}
	

