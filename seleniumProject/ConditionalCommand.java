//Conditional Commands//

package seleniumProject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ConditionalCommand {
public static void main(String[] arg)
	{
	 	System.setProperty("webdriver.gecko.driver","E://QA//geckodriver-v0.29.1-win64//geckodriver.exe");
	 	WebDriver driver= new FirefoxDriver();
	 	driver.manage().window().maximize();
	 	driver.get("https://www.facebook.com/");
	 	WebElement email= driver.findElement(By.xpath(".//*[@id='email']"));
	 	WebElement pass= driver.findElement(By.xpath("//*[@id=\"pass\"]"));
	 	if(email.isDisplayed() && email.isEnabled())
	 		{
	 			email.sendKeys("nepal123@gmail.com");
	 		}
	 	if(pass.isDisplayed() && pass.isEnabled())
	 		{
	 			pass.sendKeys("nepal");
	 		}
	 	/*if(driver.findElement(By.xpath(".//*[@id='u_0_g']")).isSelected()==false)
	 		{
	 		driver.findElement(By.xpath(".//*[@id='u_0_g']")).click();
	 		}*/
	}
}


