package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TraversingEx {

	public static void main(String[] args) {
		
		 WebDriver driver= new ChromeDriver();
		 
	 driver.get("https://www.flipkart.com/");
	 driver.manage().window().maximize();
	 driver.findElement(By.name("q")).sendKeys("iphone");
	 driver.findElement(By.xpath("//button[@class='MJG8Up']")).click();
	 
	 //Traversing using Parent Child RelationShip
	
//	 String Price= driver.findElement(By.xpath("//div[text()='Apple iPhone 15 (Black, 128 GB)']/../../div[2]//div[@class='Nx9bqj _4b5DiR']")).getText();
//System.out.println(Price);

//Traversing using Sibling
//String price= driver.findElement(By.xpath("//div[text()='Apple iPhone 15 (Black, 128 GB)']/../following-sibling::div[@class='col col-5-12 BfVC2z']//div[@class='Nx9bqj _4b5DiR']")).getText();
//	System.out.println(price);
	
	String name=driver.findElement(By.xpath("//div[text()='₹65,499']/../../../preceding-sibling::div[@class='col col-7-12']/div[text()='Apple iPhone 15 (Black, 128 GB)']")).getText();
	System.out.println(name);
	}

}
