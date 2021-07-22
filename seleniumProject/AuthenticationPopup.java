package seleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AuthenticationPopup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "E://QA//geckodriver-v0.29.1-win64//geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		//driver.get("http://the-internet.herokuapp.com/basic_auth");
		
		//-----------Handling Popup--------------//
		//--syntax:- http://username:password@url--//  
	
		driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");	
		String text=driver.findElement(By.cssSelector(".example > p:nth-child(2)")).getText();
		System.out.println(text);
		Thread.sleep(3000);
	
		//---------closing browser------//
		driver.close();
		}

	}
