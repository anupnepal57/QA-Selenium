package seleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class DownloadFilesFromChrome {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E://QA//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("http://demo.automationtesting.in/FileDownload.html");
		driver.findElement(By.id("textbox")).sendKeys("Testings");
		driver.findElement(By.id("createTxt")).click(); //generate txt file
		//driver.findElement(By.id("link-to-download")).click();//display download,click and download the txt file
		 Thread.sleep(3000);
		 
		 driver.findElement(By.id("pdfbox")).sendKeys("Its pdf download");
		 driver.findElement(By.id("createPdf")).click();
		 driver.findElement(By.id("pdf-link-to-download")).click();
		 //driver.close();
	}

}
