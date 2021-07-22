package WebBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import javaScriptUtil.JavaScriptExec;

public class fullPage {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","E://QA//geckodriver-v0.29.1-win64//geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://itera-qa.azurewebsites.net/home/automation");//launch browser
		
		
	
		
		
		driver.findElement(By.id("name")).click();
		driver.findElement(By.id("name")).sendKeys("Anup");
		Thread.sleep(3000);
		driver.findElement(By.id("phone")).sendKeys("9876543210");
		Thread.sleep(3000);
		driver.findElement(By.id("email")).sendKeys("hello@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.id("password")).sendKeys("total");
		Thread.sleep(3000);
		driver.findElement(By.id("address")).sendKeys("sfukfkhuksdghdfhgikfhgukfdhvbjkfdhvjkfhvbufdkhg");
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/button")).click();
		
		Thread.sleep(3000);
		
		//----------------Radio Button------------ //
		WebElement a= driver.findElement(By.id("female"));
		a.click();
		//WebElement b= driver.findElement(By.id("male"));
		//b.click();
		Thread.sleep(3000);
		
		WebElement c= driver.findElement(By.xpath("/html/body/div/div[5]/div[2]/div[1]/div[1]/label")); //choose days
		c.click();
		Thread.sleep(3000);
		//--------------Dropdown--------------//
		driver.findElement(By.xpath("/html/body/div/div[4]/div[2]/div/select")).click();
		Thread.sleep(3000);
		Select s=new Select (driver.findElement(By.xpath("/html/body/div/div[4]/div[2]/div/select")));
		s.selectByIndex(2);
		Thread.sleep(3000);
		//-----------checkbox------------//
		driver.findElement(By.xpath("//*[@id=\"sunday\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div/div[5]/div[2]/div[2]/div[3]/label")).click();
		
		//-------------upload file-----------//
		//driver.findElement(By.xpath("//*[@id=\"inputGroupFile02\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"inputGroupFile02\"]")).sendKeys("C:\\Users\\Anup\\Desktop\\git lab.docx");
		Thread.sleep(3000);
		//-----------scrolling--------//
		//-----------scrolling--------//
		
				JavaScriptExec.scrollPageDown(driver);
				/*WebElement checkbox= driver.findElement(By.xpath("//input[@type='checkbox']"));
				JavaScriptExec.scrollIntoView(checkbox, driver);*/
				Thread.sleep(3000);
		//
		//-------------SearchButton--------------//
				driver.findElement(By.xpath("/html/body/nav/div/form/input")).sendKeys("root");
				Thread.sleep(3000);
				driver.findElement(By.xpath("/html/body/nav/div/form/button")).click();
				
				Thread.sleep(3000);
				driver.close();
	
		
	}
}
		
		

		
		
			
		
	
