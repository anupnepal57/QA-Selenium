package seleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class actionClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","E://QA//geckodriver-v0.29.1-win64//geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		//-------Login-------//
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[2]/div[2]/form/div[2]/input")).sendKeys("Admin");
		driver.findElement(By.xpath("//*[@id=\"txtPassword\"]")).sendKeys("admin123");
		driver.findElement(By.name("Submit")).click();
	
		//-----------Action Class-------------//
		Actions act= new Actions(driver);
		WebElement admin= driver.findElement(By.xpath("/html/body/div[1]/div[2]/ul/li[2]/a/b"));
		WebElement admin1=driver.findElement(By.xpath("//*[@id=\"menu_pim_Configuration\"]"));
		WebElement user= driver.findElement(By.xpath("//*[@id=\"menu_pim_configurePim\"]")); 
		
		//-------MouseOver----//
		act.moveToElement(admin).build().perform();//mouseOver
		Thread.sleep(1000);
		act.moveToElement(admin1).build().perform();//mouseOver
		Thread.sleep(1000);
		act.moveToElement(user).click().build().perform();//mouseOver and Click
		Thread.sleep(3000);
		
		//-----------mouseRightclick----------//
		driver.navigate().to("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		Actions cap= new Actions(driver);
		
		WebElement button= driver.findElement(By.xpath("/html/body/div/section/div/div/div/p/span"));
		cap.contextClick(button).build().perform();
		driver.findElement(By.xpath("/html/body/ul/li[2]")).click();
		Thread.sleep(2000);
		//---------Switch To Alert--------//
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		
		//-----------drag & drop--------//
		driver.navigate().to("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		Actions drag= new Actions(driver);
		WebElement source=driver.findElement(By.id("box1"));
		WebElement target=driver.findElement(By.id("box103"));
		//drag.clickAndHold(source).moveToElement(target).release().build().perform();
		drag.dragAndDrop(source, target).build().perform();
	
		//---------Slider----------//
		driver.navigate().to("https://jqueryui.com/slider/");
		driver.switchTo().frame(0);
		WebElement s=driver.findElement(By.xpath("//*[@id=\"slider\"]/span"));
		Actions slide=new Actions(driver);
		slide.moveToElement(s).dragAndDropBy(s, 100, 0).build().perform();
		
		//-----------Resizable-----------//
		driver.navigate().to("https://jqueryui.com/resizable");
		driver.switchTo().frame(0);
		WebElement Resize=driver.findElement(By.xpath("//*[@id='resizable']/div[3]"));
		Actions size=new Actions(driver);
		size.moveToElement(Resize).dragAndDropBy(Resize, 200, 150).build().perform();
		
		
		//-----------Close Browser---------//
		Thread.sleep(3000);
		driver.close();
	}

}
