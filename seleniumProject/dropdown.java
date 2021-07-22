package seleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {
	public static void main(String[] args)
	{
		System.setProperty("webdriver.gecko.driver","E://QA//geckodriver-v0.29.1-win64//geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
	
	
		Select speed = new Select (driver.findElement(By.xpath("//*[@id=\"speed\"]")));
		speed.selectByVisibleText("Fast");
		

	
		driver.findElement(By.id("datepicker")).click();
		for(int i=7;i>=1;i--) {
			
			driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[2]/span")).click();
			String z= driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/span[1]")).getText();
			if(z.equals("November")) {
			driver.findElement(By.linkText("20")).click();
				break;
			}
			
			
		
		//driver.close();
		
		}
		
	}
}
