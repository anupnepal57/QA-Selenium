package seleniumProject;



import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Robotapi {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver","E://QA//geckodriver-v0.29.1-win64//geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://spreadsheetpage.com/index.php/site/file/yearly_calendar_workbook");
		driver.findElement(By.xpath("/html/body/main/section/section/article/div/section[2]/div[2]/div/div/div[1]/div[5]/div/div/div[1]/div[3]/p/a")).click();
		driver.findElement(By.xpath("/html/body/main/section/section/article/section[2]/div[1]/div[3]/div[2]/div/p/a[1]")).click();
	
		Robot robot=new Robot();
		
		//TestCase=Down arrow,3times tab key enter//
	
		robot.keyPress(KeyEvent.VK_DOWN);//press down arrow
		Thread.sleep(3000);
		robot.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(3000);
		robot.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(3000);
		robot.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(3000);
		robot.keyPress(KeyEvent.VK_ENTER);//press enter and start download
	}
	
	

}
