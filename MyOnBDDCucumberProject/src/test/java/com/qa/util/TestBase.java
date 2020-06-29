package com.qa.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;



	//TestBase class constructor to read the properties from properties file
	public TestBase() {
		try {
			prop = new Properties();
			FileInputStream fis = new FileInputStream("C:/Eclicpse Selenium WorkSpace/MyOnBDDCucumberProject/src/main/java/com/qa/config/config.properties");
			prop.load(fis);			
		} catch (IOException e) {
			e.getMessage();
		}
	}

public static void initialization() {
	String browserName = prop.getProperty("browser");
	
	if(browserName.equals("chrome")) {
		String projectPath = System.getProperty("user.dir");
		System.out.println("projectPath : " +projectPath);
		System.setProperty("webdriver.chrome.driver", projectPath+"/Driver/chromedriver.exe");
	}
	else if(browserName.equals("FF")){
		String projectPath = System.getProperty("user.dir");
		System.out.println("projectPath : " +projectPath);
		System.setProperty("webdriver.gecko.driver", projectPath+"/Driver/geckodriver.exe");
		
	}
	else if(browserName.equals("ie")){
		String projectPath = System.getProperty("user.dir");
		System.out.println("projectPath : " +projectPath);
		System.setProperty("webdriver.ie.driver", projectPath+"/Driver/IEdriver.exe");
   }
	
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);

	driver.get(prop.getProperty("url"));
  }  

}
