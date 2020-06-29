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

public class HomePageStepDefinition {
	
	WebDriver driver;
	
	@Given("^user is Already on Login Pageone$")
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

	@When("^title of login page is Free CRMone$")
	public void title_of_login_page_is_Free_CRM () {
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Free CRM #1 cloud software for any business large or small", title);
		driver.findElement(By.xpath("//*[contains(text(),'Log In')]")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}
	
	@Then("^user enters username and passwordone$")
	public void user_enter_username_and_password () {
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("dhiraj.gogawale08@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("DhirajCRM");
		
	}
	
	@Then("^user clicks on login buttonone$")
	public void user_clicks_on_login_button () {
		driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div/form/div/div[3]")).click();
	}
	
	@Given("^user is Already on Home Page$")
	public void user_is_Already_on_Home_Page () {
		driver.findElement(By.xpath("//span[contains(text(),'Companies')]")).click();
	}
	
	
	@Then ("^user clicks on Calendar$")
	public void user_clicks_on_calender () {
		driver.findElement(By.xpath("//span[contains(text(),'Calendar')]")).click();;
	}
	
	@And ("^user clicks on Contacts$")
	public void user_clicks_on_Contacts () {
		driver.findElement(By.xpath("//span[contains(text(),'Contacts')]")).click();
		driver.findElement(By.xpath("//*[@id=\"top-header-menu\"]/div[3]/div[2]/div/i")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Log Out')]")).click();
		driver.close();
		
	}
	

}
