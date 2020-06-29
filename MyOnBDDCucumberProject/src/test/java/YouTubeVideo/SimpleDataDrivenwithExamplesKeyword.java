package YouTubeVideo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.annotation.en.And;
import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;
import junit.framework.Assert;

public class SimpleDataDrivenwithExamplesKeyword {
	
WebDriver driver;
	
	@Given("^user is Already on Login Page With Examples Keyword$")
	public void user_alreadr_on_page () {


		String projectPath = System.getProperty("user.dir");
		System.out.println("projectPath : " +projectPath);
		System.setProperty("webdriver.chrome.driver", projectPath+"/Driver/chromedriver.exe");	
		driver = new ChromeDriver();
		driver.get("https://freecrm.co.in/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(200, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

	@When("^title of login page is Free CRM With Examples Keyword")
	public void title_of_login_page_is_Free_CRM () {
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Free CRM #1 cloud software for any business large or small", title);
		driver.findElement(By.xpath("//*[contains(text(),'Log In')]")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}
	
	//Regular Expresstion :
		//1) \"(.*)\"
		//2) \"([^\"]*)\"
	
	@Then("^user enters \"(.*)\" and \"(.*)\" With Examples Keyword$")
	public void user_enter_username_and_password (String username, String password) {
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
		driver.close();
		
	}

}
