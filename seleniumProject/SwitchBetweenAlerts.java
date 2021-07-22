package seleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SwitchBetweenAlerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "E://QA//geckodriver-v0.29.1-win64//geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().fullscreen();
		driver.get("http://demo.automationtesting.in/Alerts.html");
	
		//----------Alerts With OK Button-----------//
		
		//----------  OK Link-----------//
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[1]/a")).click();
		Thread.sleep(3000);
		//------------Button------------//
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div[1]/button")).click();
		Thread.sleep(2000);
		//---------Switch To Alert Box-------------//
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept(); //ok button clicked and closed the alert
		Thread.sleep(3000);
		
		
		
		//----------------Alert With OK Cancel Button----------//
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"CancelTab\"]/button")).click();
		String ExpTextOK="You pressed Ok";
		String ExpTextCancel="You Pressed Cancel";
		driver.switchTo().alert().accept();
		String ActText= driver.findElement(By.xpath("//*[@id=\"demo\"]")).getText();
		if( ExpTextOK.equals(ActText)==true) {
			System.out.println("Test passed");
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"CancelTab\"]/button")).click();
		driver.switchTo().alert().dismiss();
		String ActText1= driver.findElement(By.xpath("//*[@id=\"demo\"]")).getText();
		if(ExpTextCancel.equals(ActText1)==true) {
			System.out.println("Test passed");
		}
		Thread.sleep(1000);
		
		
		
		//----------------Alert With TextBox----------//
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"Textbox\"]/button")).click();
		
		driver.switchTo().alert().sendKeys("Anup");
		
		driver.switchTo().alert().accept();
		System.out.println(driver.findElement(By.xpath("//*[@id=\"demo1\"]")).getText());
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id=\"Textbox\"]/button")).click();
		driver.switchTo().alert().dismiss();
		
		Thread.sleep(1000);
		driver.close();
	}

}
