package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		
		 WebDriver driver= new ChromeDriver();
		 driver.manage().window().maximize();
		 
		 driver.get("https://www.saucedemo.com/v1/");
		 
		 //syntax id()----->AttributeName="Attributevalue"
//		driver.findElement(By.id("user-name")).sendKeys("standard_user");
	//	
	//	driver.findElement(By.id("password")).sendKeys("secret_sauce");
		
	//	driver.findElement(By.id("login-button")).click();
		 
		 //syntax name()---->
		//	driver.findElement(By.name("user-name")).sendKeys("standard_user");
		//	driver.findElement(By.name("password")).sendKeys("secret_sauce");
			
	//syntax classname()------>		
		//	driver.findElement(By.className("btn_action")).click();
			
         driver.findElement(By.cssSelector("input[type=\"text\"]")).sendKeys("standard_user");
         driver.findElement(By.cssSelector("[type='password']")).sendKeys("secret_sauce");
         driver.findElement(By.className("input#login-button")).click();
	}

}
