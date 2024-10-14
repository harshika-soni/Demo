package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BigBasket {

	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver= new ChromeDriver();
		 driver.manage().window().maximize();
		 
		 driver.get("https://www.bigbasket.com/");
		 Thread.sleep(1000);
 // driver.findElement(By.xpath("(//input[@placeholder='Search for Products...'])[2]")).sendKeys("mango");
		 
  driver.findElement(By.xpath("(//input[@placeholder='Search for Products...'])[2]")).sendKeys("Apple",Keys.ENTER);
		 
 // driver.findElement(By.xpath("(//input[@placeholder='Search for Products...'])[2]")).sendKeys("Apple");
//List<WebElement> AppleSuggestion = driver.findElements(By.xpath("//li[@class='QuickSearch___StyledMenuItem-sc-rtz2vl-4 ibNDA-d']"));
 // driver.findElement(By.xpath("(//*[name()='svg' and @class='mx-2.5 w-4 h-4 text-appleGreen-500 fill-appleGreen-500'])[2]")).click();
  
/* List<WebElement> Mango = driver.findElements(By.xpath("//span[@class='Label-sc-15v1nk5-0 QuickSearch___StyledLabel2-sc-rtz2vl-7 gJxZPQ gFDEBU']"));
		
 Thread.sleep(2000);
 for(WebElement ele:Mango) {
	 System.out.println(ele.getText());
	 if(ele.getText().contains("Raspuri/Gola Man")) {
		 ele.click();
		 break;
		 
	 }*/
//Thread.sleep(2000);
  // for(WebElement Autosuggestion: AppleSuggestion) {
	//   System.out.println(Autosuggestion.getText());
   //}
	
	}
	

	}

	
