package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchingEmptyBrowser {

	public static void main(String[] args) {
		//launching empty browser
		
		//case1:
		//selenium version:-3.141.59 
		
		//String key="webdriver.chrome.driver";
		//String value = "/BasicSelenium/src/main/resources/chromedriver.exe";
		
	//	System.setProperty(key, value);
		
	//	WebDriver driver=new ChromeDriver();
		
		//case:2-Selenium version-3.141.59 WebdriverManager 5.9.1
		
	// WebDriverManager.chromedriver().setup();
	//	WebDriver driver1=new ChromeDriver();
		
	//	WebDriverManager.edgedriver().setup();
	//	WebDriver driver= new EdgeDriver();
		
	//	case3 selenium version 4.22.0 webdriverManager:5.9.1
		
	//	 WebDriverManager.chromedriver().setup();
	//	WebDriver driver1=new ChromeDriver();
			
	//	WebDriverManager.edgedriver().setup();
	 //  WebDriver driver= new EdgeDriver();
	
		//case 4:- Selenium version:-4.22.0
		
		WebDriver driver=new ChromeDriver();
	//	WebDriver driver=new EdgeDriver();
		

	}

}
