package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Testform {
	@Test
public void  Verify(){
	System.setProperty("webdriver.gecko.driver","E://QA//geckodriver-v0.29.1-win64//geckodriver.exe");
	WebDriver driver= new FirefoxDriver();
	driver.manage().window().maximize();
	formPage p=new formPage(driver);
	driver.get("https://www.lambdatest.com/blog/selenium-java-tutorial-automation-testing-of-user-signup-form/");
	
	p.login();
	p.setEmail("hello@gmail.com");
	p.setPass("good1");
	p. button();
	
}

}
