package seleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class DownloadFileFromFirefox {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","E://QA//geckodriver-v0.29.1-win64//geckodriver.exe");
		
		
		//creating browser profile//
		FirefoxProfile profile= new FirefoxProfile();
		profile.setPreference("browser.helperApps.neverAsk.saveToDisk","text/plain");//set MIME type- https://www.sitepoint.com/mime-types-complete-list/
		profile.setPreference("browser.download.manager.showWhenStarting", false);
		
		FirefoxOptions option=new FirefoxOptions();
		option.setProfile(profile);
		WebDriver driver= new FirefoxDriver(option);
		driver.get("http://demo.automationtesting.in/FileDownload.html");
		
		driver.findElement(By.id("textbox")).sendKeys("Testing hello");
		driver.findElement(By.id("createTxt")).click();
		driver.findElement(By.id("link-to-download")).click();

	}

}
