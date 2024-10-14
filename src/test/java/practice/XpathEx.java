package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathEx {

	public static void main(String[] args) {
		
		 WebDriver driver= new ChromeDriver();
		
		 driver.get("https://www.flipkart.in");
		 
		 driver.manage().window().maximize();
		 //syntax 1
		// driver.findElement(By.xpath("//a[@data-csa-c-content-id='nav_cs_mobiles']")).click();
//syntax 2
		// driver.findElement((By.xpath(null))
		 driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Samsung");
		 driver.findElement(By.xpath("//button[@type='submit']")).click();
	//	List<WebElement> name = driver.findElement(By.xpath("//a[@title='SAMSUNG Back Cover for Galxy Z Flip4 Silicone Cover with Ring, Navy']")).getText();
	//System.out.println(name); 
	List<WebElement>Phonname = driver.findElements(By.xpath("//a[@class='wjcEIp']"));
	List<WebElement>Phonprice = driver.findElements(By.xpath("//div[@class='Nx9bqj']"));
	
	for(int i=0;i<Phonname.size();i++) {
		System.out.println(Phonname.get(i).getText()+"....."+Phonprice.get(i).getText());
	}
	
	
	
  // int count=0;
//	for(WebElement name: Phonname ) {
//		System.out.println(name.getText());
//	count++;
//	}
	//System.out.println("total num of phone"+count);
	}
//List<WebElement>Phonprice = driver.findElements(By.xpath("//div[@class='Nx9bqj']"));
	
//	int count=0
	//for(WebElement price: Phonprice ) {
		//System.out.println(price.getText());
		//count++;
	//}
	//System.out.println("total num of phone"+count);
	//}
}
