package com.practice.SeleniumTest;
import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SampleTest {
	
	public static WebDriver driver;
	/*@Test
	public void createInstance()
	{
		ChromeOptions chromeOptions = new ChromeOptions();
		WebDriverManager.chromedriver().browserVersion("102.0.5005.63").setup();
		WebDriver driver = new ChromeDriver(chromeOptions);
        //Navigate to the demoqa website
		driver.get("https://www.demoqa.com");..
		
		driver.quit();
	}*/

	@Test
	public static void createInstance()
	{
		String path = new File("Webdriver/chromedriver.exe").getAbsolutePath();
		System.setProperty("webdriver.chrome.driver", path);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		 driver.navigate().to("https://marketing.sqa-io.com/");
		
		 driver.findElement(By.xpath("/html/body/app-root/app-signin/div/div/div/form/div[1]/input")).sendKeys("mesadmin@test.com");
		
	      driver.findElement(By.xpath("/html/body/app-root/app-signin/div/div/div/form/div[2]/input")).sendKeys("fertility");
	      driver.findElement(By.className("login100-form-btn")).click();
	      System.out.println("Test performed");
	      
	      /*...  driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);

	      
	      
	      driver.findElement(By.className("fa-flask")).click();
	      driver.findElement(By.xpath("//*[@id='leftsidebar']/div/div/ul/li[4]/ul/li[2]/a")).click();
	      driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
	      driver.findElement(By.xpath("/html/body/app-root/app-control-tests/section/div/div[2]/div[2]/div[1]/div[1]/form/div/div[1]/div/input")).sendKeys("031220");
	      driver.findElement(By.xpath("html/body/app-root/app-control-tests/section/div/div[2]/div[2]/div[1]/div[1]/form/div/div[7]/div/button[1]")).click();

	      String TestID = driver.findElement(By.xpath("//*[@id='qcTable']/tbody/tr[1]/td[2]")).getText();
	      System.out.println(TestID);
		
		*/
		
		
	}
}



/*@Test
public static void createInstance()
{
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vision\\Documents\\Webdriver\\chromedriver.exe");
driver = new ChromeDriver();
driver.manage().window().maximize();
}*/