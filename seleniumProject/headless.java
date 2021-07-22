package seleniumProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class headless {
	public static void main(String[] args)
	{
		System.setProperty("webdriver.gecko.driver","E://QA//geckodriver-v0.29.1-win64//geckodriver.exe");// select the driver of the browser  and driver location must set properly
		FirefoxOptions options=new FirefoxOptions();// must set for headless  browser
		options.setHeadless(true);//options.addArguments("--headless");  //open browser in background(ie headless)
		WebDriver driver= new FirefoxDriver(options); //open the browser
		driver.get("http://demo.nopcommerce.com/");//launch the URL
		System.out.println("Title of the page:"+ driver.getTitle());// print the title of the browser
	}
}
