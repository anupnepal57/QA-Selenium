package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class formPage {
	WebDriver driver;
	By login=By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul/li[6]/a");
	By email=By.xpath("//*[@id=\"app\"]/div/div/div/div/form/div[1]/input");
	By pass=By.xpath("//*[@id=\"userpassword\"]");
	By btn=By.xpath("//*[@id=\"app\"]/div/div/div/div/form/div[3]/button");
 
	 formPage( WebDriver driver) {
		this.driver=driver;
	}
	public void login() {
		driver.findElement(login).click();
	}
	public void setEmail(String Email) {
		driver.findElement(email).sendKeys(Email);
	}
	public void setPass(String Pwd) {
		driver.findElement(pass).sendKeys(Pwd);
	}
	public void button() {
		driver.findElement(btn).click();
	}
}
