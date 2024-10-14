package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartExeTraversing {

	public static void main(String[] args) throws InterruptedException {
		
		 WebDriver driver= new ChromeDriver();
		 driver.manage().window().maximize();
		 
		 driver.get("https://www.flipkart.com/");
		 Thread.sleep(1000);
		 
driver.findElement(By.xpath("//input[@name='q']")).sendKeys("iphone");

 driver.findElement(By.xpath("//button[@type='submit']")).click();
 
 //String phnprice = driver.findElement(By.xpath("//div[text()='Apple iPhone 14 Plus (Blue, 128 GB)']/../../div[2]//div[@class='cN1yYO']")).getText();
//	System.out.println(phnprice);
	List<WebElement> iphoneprice = driver.findElements(By.xpath("//div[@class='Nx9bqj _4b5DiR']"));
	
	for(WebElement phnprice:iphoneprice) {
		String PriceText=phnprice.getText();
		PriceText=PriceText.replace("₹", "").replace(",","").trim();
		int price=Integer.parseInt((PriceText));
		if(price>60000) {
			System.out.println("₹"+price);
		}
		
	}
	}

}