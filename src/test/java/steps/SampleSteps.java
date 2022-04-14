package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SampleSteps {
	WebDriver driver;

	@Given("when the user in the Home page")
	public void when_the_user_in_the_Home_page() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://petstore.octoperf.com/");
		driver.findElement(By.tagName("a")).click();

	}

	@When("the user clicks on the  image fish")
	public void the_user_clicks_on_the_image_fish() {
		driver.findElement(By.xpath("//div[@id='SidebarContent']//img")).click();
	}

	@Then("he navigates to the products page")
	public void he_navigates_to_the_products_page() {
		System.out.println("he navigate to product page");
	}

}
