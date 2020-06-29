package CucumberNewFeatures;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import cucumber.annotation.en.And;
import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;
import cucumber.table.DataTable;
import junit.framework.Assert;

//data table with maps : for paramterization of test cases

public class EnterDealsDetailsUsingMap {

	WebDriver driver;
	
	@Given("^user is Already on Login Page Using Map$")
	public void user_alreadr_on_page_using_Map () {


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

	@When("^title of login page is Free CRM Using Map$")
	public void title_of_login_page_is_Free_CRM_using_Map () {
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Free CRM #1 cloud software for any business large or small", title);
		driver.findElement(By.xpath("//*[contains(text(),'Log In')]")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@Then("^user enters username and password Using Map$")
	public void user_enter_username_and_password_using_Map(DataTable credentials) {       
		for(Map<String,String> data : credentials.asMaps(String.class, String.class)) {
			
			driver.findElement(By.xpath("//input[@name='email']")).sendKeys(data.get("username"));
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys(data.get("password"));
		}


		}

		@Then("^user clicks on login button _Using_Map$")
		public void user_clicks_on_login_button_using_Map () {
			driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div/form/div/div[3]")).click();
		}

		@And("^user is on home page and click Deals Using Map$")
		public void user_is__on_Home_Page_Click_Deals_using_Map (DataTable dealtitle) throws InterruptedException {
			for(Map<String,String> data : dealtitle.asMaps(String.class, String.class)) {
			driver.findElement(By.xpath("//span[contains(text(),'Deals')]")).click();
			driver.findElement(By.xpath("//button[@class='ui linkedin button' and contains(text(),'New')]")).click();
			driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(200, TimeUnit.SECONDS);
			Thread.sleep(5000);
			driver.findElement(By.xpath("//input[@name='title']")).sendKeys(data.get("title"));
			driver.findElement(By.xpath("//*[@id=\"top-header-menu\"]/div[3]/div[2]/div/i")).click();
			driver.findElement(By.xpath("//span[contains(text(),'Log Out')]")).click();
			driver.close();
			}

	}
}
		
		