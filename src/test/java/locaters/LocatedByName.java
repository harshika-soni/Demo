package locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatedByName {

	public static void main(String[] args) {
		
		 WebDriver driver= new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https:/www.amazon.in");
		 driver.findElement(By.name("field-keywords")).sendKeys("puma");

	}

}
