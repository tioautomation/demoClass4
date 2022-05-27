package com.gtplLogin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class GtplLogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ExtentReports extent;
		ExtentTest logger;
		System.getProperty("user.dir");
		ExtentHtmlReporter reporter=new ExtentHtmlReporter(System.getProperty("user.dir")+"\\target\\index.html");
		
	    extent = new ExtentReports();
	    
	    extent.attachReporter(reporter);
	    
	    logger=extent.createTest("GTPL login");

	    System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
//		WebDriverWait myDriverWait = new WebDriverWait(driver, 30);
		
		driver.navigate().to("http://demo.guru99.com/V1/index.php");
		driver.close();
		logger.pass("login test passed");
		Thread.sleep(4000);
		WebDriver driver1 = new ChromeDriver();
		logger=extent.createTest("GTPL Site launch test");
		driver1.get("http://demo.guru99.com/V1/index.php");
		driver1.close();
		logger.fail("Launch test failed");
		extent.flush();
		
	}

}
