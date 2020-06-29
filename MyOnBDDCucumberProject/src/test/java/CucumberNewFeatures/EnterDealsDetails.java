package CucumberNewFeatures;

import java.util.List;
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

public class EnterDealsDetails {
	
WebDriver driver;
	
	@Given("^user is Already on Login Page$")
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

	@When("^title of login page is Free CRM$")
	public void title_of_login_page_is_Free_CRM () {
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Free CRM #1 cloud software for any business large or small", title);
		driver.findElement(By.xpath("//*[contains(text(),'Log In')]")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}
	
	@Then("^user enters username and password$")
	public void user_enter_username_and_password (DataTable credentials) {       //DataTable is a class in Cucumber
		List<List<String>> data = credentials.raw(); //raw is a method available in DataTable class
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(data.get(0).get(0));//0,0 means 0 Row, 0 Colum
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(data.get(0).get(1)); //0,1 0 Row, 1 Colum
		
	}
	
	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button () {
		driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div/form/div/div[3]")).click();
	}
	
	@And("^user is on home page and click Deals$")
	public void user_is__on_Home_Page_Click_Deals (DataTable dealtitle) throws InterruptedException {
		List<List<String>> dealname = dealtitle.raw();
		driver.findElement(By.xpath("//span[contains(text(),'Deals')]")).click();
		driver.findElement(By.xpath("//button[@class='ui linkedin button' and contains(text(),'New')]")).click();
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(200, TimeUnit.SECONDS);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='title']")).sendKeys(dealname.get(0).get(0));
		driver.findElement(By.xpath("//*[@id=\"top-header-menu\"]/div[3]/div[2]/div/i")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Log Out')]")).click();
		driver.close();
		
	}

}
