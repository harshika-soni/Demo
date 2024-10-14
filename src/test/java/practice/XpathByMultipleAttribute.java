package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByMultipleAttribute {

	public static void main(String[] args) {
		
		 WebDriver driver= new ChromeDriver();
		 
		 driver.get(("https://www.amazon.in"));
		 driver.manage().window().maximize();
		 
//htmltag[@AttributeName='AttributeValue'and @AttributeName='AttributeValue']		
//driver.findElement(By.xpath("//a[@data-csa-c-content-id='nav_cs_help' and @data-csa-c-slot-id='nav_cs_6']")).click();
	
//htmltag[@AttributeName='AttributeValue'or @AttributeName='AttributeValue']
//driver.findElement(By.xpath("//a[@data-csa-c-content-id='nav_cs_help' or @data-csa-c-slot-id='nav_cs_6']")).click();

	//htmltag[@AttributeName='AttributeValue' and text()='AttributeValue']
//driver.findElement(By.xpath("//a[@data-csa-c-type='link' and text()='Amazon miniTV']")).click();
	
//htmltag[contains(@AttributeName,'AttributeValue' and @AttributeName='AttributeValue']	
//	driver.findElement(By.xpath("//a[contains(@data-csa-c-typ,'link')or@data-csa-c-slot-id='nav_cs_4']")).click();
	
	driver.findElement(By.xpath("//a[contains(@data-csa-c-type,'link')and@data-csa-c-slot-id='nav_cs_4']")).click();
	
	}

}
