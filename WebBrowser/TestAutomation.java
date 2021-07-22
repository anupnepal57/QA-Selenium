package WebBrowser;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TestAutomation {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "E://QA//geckodriver-v0.29.1-win64//geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
	
		driver.get("http://demo.automationtesting.in/Register.html");
		
		//----------input text------------//
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input")).sendKeys("Anup");
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input")).sendKeys("Nepal");
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea")).sendKeys("Jhapa-03,Nepal");
		driver.findElement(By.xpath("//*[@id=\"eid\"]/input")).sendKeys("hello@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[4]/div/input")).sendKeys("1234567890");
		
		//----------------Radio Button---------------//
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[5]/div/label[1]/input")).isDisplayed();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[5]/div/label[1]/input")).click();
		
		//--------------------CheckBox-----------------//
		WebElement check= driver.findElement(By.xpath("//*[@id=\"checkbox1\"]"));
		check.click();
		WebElement check1= driver.findElement(By.xpath("//*[@id=\"checkbox2\"]"));
		check1.click();
		
		
		//-------- Language -------------//
		
		//driver.findElement(By.xpath("//*[@id=\"msdd\"]")).sendKeys("Dutch");
		//Select l =new Select(driver.findElement(By.xpath("//*[@id=\"msdd\"]")));
		//l.selectByVisibleText("English");
		
		
		//---------------DropDown------------//
		
		Select l =new Select(driver.findElement(By.xpath("//*[@id=\"Skills\"]")));
		l.selectByIndex(1);
		Thread.sleep(3000);
		l.selectByValue("Analytics");
		
		
		Select C =new Select(driver.findElement(By.id("countries")));
		//C.selectByIndex(4);
		Thread.sleep(3000);
		C.selectByVisibleText("Nepal");
		
		/*Select cot =new Select(driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[10]/div/span/span[1]/span")));
		cot.selectByVisibleText("Denmark");*/
		
		Select d= new Select(driver.findElement(By.xpath("//*[@id=\"yearbox\"]")));
		d.selectByValue("1997");
		Select e= new Select(driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[11]/div[2]/select")));
		e.selectByIndex(7);
		Select f= new Select(driver.findElement(By.xpath("//*[@id=\"daybox\"]")));
		f.selectByIndex(1);
		Thread.sleep(2000);
		
		
		WebElement m=driver.findElement(By.id("firstpassword"));
		m.sendKeys("Dddd1d");
		
	WebElement n=driver.findElement(By.id("secondpassword"));
	n.sendKeys("Dddd1d");

	
	

	
	//--------------browsing files-----------//	
	driver.findElement(By.xpath("//*[@id=\"imagesrc\"]")).sendKeys("C:\\Users\\Anup\\Desktop\\git lab.docx");
	Thread.sleep(1000);
	
	//-----------Button click-----------//
	driver.findElement(By.xpath("//*[@id=\"submitbtn\"]")).click();
	

	//---------------------Navigate--------------//
	driver.navigate().to("https://www.youtube.com/");
	Thread.sleep(3000);
	driver.navigate().back();
	driver.navigate().refresh();
	
	//-----------Close Browser------------//
	driver.close();
		
	}
	}
	

	
