package step_def;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepdeffile {
	WebDriver driver;

	@Given("user is entering google.com")
	public void user_is_entering_google_com() throws Exception {
	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\welcome\\jar file\\chromedriver_win32\\chromedriver.exe"); 
	   driver=new ChromeDriver();
	   driver.manage().window().maximize();
	   Thread.sleep(9000);
	   driver.get("https://google.com/");
	}

	@When("user clicks the search box")
	public void user_clicks_the_search_box() throws Exception {
		Thread.sleep(3000);
		driver.findElement(By.name("q")).click();
	}

	@When("types the search term as {string}")
	public void types_the_search_term_as(String data) throws Exception {
		Thread.sleep(3000);
		driver.findElement(By.name("q")).sendKeys(data);
	}

	@Then("the user should see the search results for Krishna")
	public void the_user_should_see_the_search_results_for_krishna() throws Exception {
		Thread.sleep(3000);
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
		boolean status=driver.findElement(By.partialLinkText("Krishna")).isDisplayed();
		if(status)
		{
			System.out.println("Test case PASSED");
		
		}
	}
	@Then("Close the browser")
	public void close_the_browser() throws Exception {
	Thread.sleep(3000);
	driver.close();  
	}
}
