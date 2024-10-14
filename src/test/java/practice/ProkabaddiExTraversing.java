package practice;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProkabaddiExTraversing {

	public static void main(String[] args) {
	
		 WebDriver driver= new ChromeDriver();
		 driver.manage().window().maximize();
		 
		 driver.get("https://www.prokabaddi.com/standings");
		 driver.manage().window().maximize();
		 
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter any Kabaddi name");
		         String name = sc.next();
		    // String PLaay=driver.findElement(By.xpath("//p[text()='Team']/../../div[3]//p[class='count']")).getText();  
//System.out.println(PLaay);
	
	String	won=driver.findElement(By.xpath(" //div[@class='table-data team']/../div[4]//p[text()='W']")).getText() ;     // //div[@class='table-data team']/../div[4]//p[text()='W']
	System.out.println(won);
	}

}
