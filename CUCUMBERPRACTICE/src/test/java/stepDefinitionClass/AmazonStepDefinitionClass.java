package stepDefinitionClass;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonStepDefinitionClass {
WebDriver driver;
@Given("Amazon page must be display")
public void amazon_page_must_be_display() {
  WebDriverManager.chromedriver().setup();
  WebDriver driver=new ChromeDriver();
 
  driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));

	driver.get("https://www.amazon.in/");

}

@When("search for moblie")
public void search_for_moblie() {
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("phones");

}

@When("click on search button")
public void click_on_search_button() {
 driver.findElement(By.id("nav-search-submit-button")).click(); 
}

@Then("check all  mobiles are displaed")
public void check_all_mobiles_are_displaed() {
  
	List<WebElement> phones = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
for(WebElement i:phones)
{
	System.out.println(i.getText());
}

}

}
