package seleniumProject;// GET COMMANDS

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class WebDriverCommands {
	public static void main(String[] arg) {
		
		System.setProperty("webdriver.gecko.driver","E://QA//geckodriver-v0.29.1-win64//geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		//System.setProperty("webdriver.chrome.driver", "E://QA//chromedriver_win32//chromedriver.exe");
			//	WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Register.html");//opens the URL
		
		System.out.println("The title of the page:"+ driver.getTitle());//returns the title of the page
		System.out.println("The URL of page:"+ driver.getCurrentUrl());
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input")).sendKeys("Anup");
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input")).sendKeys("Nepal");
		driver.findElement(By.xpath("//*[@id=\"eid\"]/input")).sendKeys("nepalanup57@gmail.com");
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[4]/div/input")).sendKeys("9876543210");
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[5]/div/label[1]/input")).click();
		driver.findElement(By.id("checkbox1")).click();
		driver.findElement(By.id("checkbox2")).click();   
	    //driver.findElement(By.id("msdd")).click();
	   // driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[7]/div/multi-select/div[2]/ul/li[8]/a")).click();
	    Select dropdown = new Select(driver.findElement(By.id("Skills")));  
		dropdown.selectByValue("Android");
		Select down = new Select(driver.findElement(By.id("countries")));  
		down.selectByValue("Australia");
	    
		driver.findElement(By.xpath("//*[@id=\"submitbtn\"]")).click();
		
		//---------NAVIGATE COMMAND---------//
		
		/*driver.navigate().to("http://facebook.com");
		driver.navigate().back();
		//driver.navigate().forward();
		driver.navigate().refresh();
		//driver.close();
	*/
	}

}
