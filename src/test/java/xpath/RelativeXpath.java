package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpath {

	public static void main(String[] args) {
		 WebDriver driver= new ChromeDriver();
		 driver.manage().window().maximize();
		 
		 driver.get("https://www.saucedemo.com/v1/");
		 driver.findElement(By.xpath("//input[@type='text']")).sendKeys("standard_user");
		 driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("secret_sauce");
          driver.findElement(By.xpath(("//input[@id='login-button']"))).click();
	}

}
