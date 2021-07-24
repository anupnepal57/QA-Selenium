package seleniumProject;


import org.apache.commons.codec.binary.Base64;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EncodeDecode {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.gecko.driver","E://QA//geckodriver-v0.29.1-win64//geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("http://demo.nopcommerce.com/login");
		
		driver.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys("hello@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys(decodeString("dGVzdDEyMw=="));
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button")).click(); 
	}
	
		static String decodeString(String password) {
		byte[] decodedString=Base64.decodeBase64(password);
		return(new String(decodedString));
		}
}
