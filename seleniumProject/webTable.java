//incomplete///
package seleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class webTable {
public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver","E://QA//geckodriver-v0.29.1-win64//geckodriver.exe");
	WebDriver driver= new FirefoxDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/");
	driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[2]/div[2]/form/div[2]/input")).sendKeys("Admin");
	driver.findElement(By.xpath("//*[@id=\"txtPassword\"]")).sendKeys("admin123");
	driver.findElement(By.name("Submit")).click();
	driver.findElement(By.id("menu_admin_viewAdminModule")).click();
	driver.findElement(By.id("menu_admin_UserManagement")).click();
	driver.findElement(By.id("menu_admin_viewSystemUsers")).click();
	
}
}
