package seleniumProject;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class FirstTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","E://QA//geckodriver-v0.29.1-win64//geckodriver.exe");
		
		//System.setProperty("webdriver.chrome.driver", "E://QA//chromedriver_win32//chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com/");
		driver.findElement(By.name("email")).sendKeys("nepal");
		driver.findElement(By.name("pass")).sendKeys("root");
		driver.findElement(By.name("login")).click();
		      String exp_title="Facebook - Log In or Sign Up";
		String act_title= driver.getTitle();
		if(exp_title.equals(act_title)==true)
		{
			System.out.println("passed");
		}
		else {
			System.out.println("failed");
		}
		driver.close();
	}

}
