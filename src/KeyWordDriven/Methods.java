package KeyWordDriven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Methods 
{
	
	
	public static WebDriver driver;
	 public static void openBrowser()
	 { 
	 System.setProperty("webdriver.chrome.driver", "./driver/chromedriver");
		 //System.setProperty("webdriver.chrome.driver","./KDF/driver/chromedriver");

	 driver=new ChromeDriver();
	 }
	 
	 public static void navigate()
	 { 
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 driver.get("https://www.facebook.com");
	 driver.manage().window().maximize();
	 }
	 
	 public static void input_Username()
	 {
	 driver.findElement(By.name("email")).sendKeys("9158472761"); 
	 }
	 
	 public static void input_Password()
	 {
	 driver.findElement(By.name("pass")).sendKeys("Snehal@1234");
	 }
	 
	 public static void click_Login()
	 {
	 driver.findElement(By.xpath("//input[@id='u_0_a']")).click();
	 }
	 
	@Test
	 public static void verify_login()
	 {
//	 String pageTitle = driver.getTitle();
//     Assert.assertEquals(pageTitle, "Messenger: Chats:");
// 
	 }
	
	 public static void closeBrowser()
	 {
	 driver.quit();
	 }
	}


