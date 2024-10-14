package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethods {

	public static void main(String[] args) {
		
		//launching empty browser
		 WebDriver driver= new ChromeDriver();
		 
// Method 1:- get()------->  Used to launch an application
		   driver.get("https://www.flipkart.com/");
 //Method 2:-getTitle()------>Fetch the Title of the webpage		  
		  String title = driver.getTitle();
		  System.out.println(title);
		  
//Method 3:-getCurrentUrl()----->Fetch the current  Url of the webpage
		  String Url = driver.getCurrentUrl();
		  System.out.println(Url);
		  
//Method 4:-getPageSource()------>	Fetching the PageSource of the webPage
		  String source = driver.getPageSource();
		 System.out.println(source);
		 
//Method 5:-manage()----->used for window action like(maximize,minimize)
//		 Options opt=driver.manage();
	//	 Window win =opt.window();
	//	 win.maximize();//or
		driver.manage().window().maximize();
		driver.manage().window().minimize();
		driver.manage().window().fullscreen();
//Method 6:-close()------>close the single window where driver is currently in focus
		driver.close();
//Method 7:-quit()----->close  all the	window including browser
		driver.quit();

	}

}
