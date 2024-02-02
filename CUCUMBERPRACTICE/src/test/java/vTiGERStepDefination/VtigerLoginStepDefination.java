package vTiGERStepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class VtigerLoginStepDefination {
WebDriver driver;
@Given("Login Page should display")
public void login_page_should_display() {
   
	WebDriverManager.chromedriver().setup();
	 driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("http://localhost:8888/");
	
}

@When("Fill the Vusername")
public void fill_the_vusername() {
   driver.findElement(By.name("user_name")).sendKeys("admin");
}

@When("Fill the Vpassword")
public void fill_the_vpassword() {
	   driver.findElement(By.name("user_password")).sendKeys("admin");

}

@When("Click on VLogin button")
public void click_on_v_login_button() {
    driver.findElement(By.id("submitButton")).click();
}

@Then("VHome Page Must be display")
public void v_home_page_must_be_display() {
   System.out.println("home pgage");
}
}