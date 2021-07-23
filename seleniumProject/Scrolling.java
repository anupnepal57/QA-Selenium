package seleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Scrolling {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","E://QA//geckodriver-v0.29.1-win64//geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.countries-ofthe-world.com/flags-of-the-world.html");
		driver.manage().window().maximize();
		
		
		JavascriptExecutor js=(JavascriptExecutor)driver;//syntax
	
		//----scrolling by pixel----//
		//js.executeScript("window.scrollBy(0,1000)", "");
		
		//---scrolling page till we find element----//
		WebElement flag=driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div[2]/div[2]/div[2]/table[2]/tbody/tr[93]/td[1]/img"));
		js.executeScript("arguments[0].scrollIntoView(true)", flag);
		Thread.sleep(3000);

		//-------scrolling page till bottom-----/
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}

}
