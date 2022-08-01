package com.ion.testcases;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.ion.utilities.ReadConfig;


public class BaseClass {
	
	ReadConfig rc  = new ReadConfig();
	public String base_url = rc.getApplicationURL();
	public static WebDriver driver;
	ReadConfig readConfig  = new ReadConfig();
	
	@Parameters({"browser"})
	@BeforeClass
	public void setup(String br){

	if(br.equals("chrome"))
	{
		System.setProperty("webdriver.chrome.driver",readConfig.getChromePath());
		driver = new ChromeDriver();
	}
	else if(br.equals("firefox"))
	{
		System.setProperty("webdriver.gecko.driver",readConfig.getFirefoxPath());
		driver = new FirefoxDriver();
	}
	else if(br.equals("ie")){
		System.setProperty("webdriver.ie.driver",readConfig.getIEPath());
		driver = new InternetExplorerDriver();
	}
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get(base_url);
	}
	
	@AfterClass
	public void closesetup(){
		driver.quit();
	}

	
}
