package seleniumProject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DataDrivenWithURL {
public static void main(String[] args) throws IOException, InterruptedException
	{
	System.setProperty("webdriver.gecko.driver","E://QA//geckodriver-v0.29.1-win64//geckodriver.exe");
	WebDriver driver= new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("http://parashbhandari.com.np/webapp/cinterest/");
	FileInputStream file= new FileInputStream("E://QA//SimpleBook1.xlsx");
	XSSFWorkbook workbook= new XSSFWorkbook(file);
	XSSFSheet sheet= workbook.getSheet("Sheet1");
	int rowCount= sheet.getLastRowNum();
	for(int i=1;i<=rowCount;i++)
	{
		XSSFRow row=sheet.getRow(i);
		XSSFCell principalcell=row.getCell(0);
		int pric=(int)principalcell.getNumericCellValue();//type casting
		XSSFCell ratecell=row.getCell(1);
		int rate=(int)ratecell.getNumericCellValue();
		XSSFCell durationcell=row.getCell(2);
		int duration=(int)durationcell.getNumericCellValue();
		
	driver.findElement(By.id("principal")).sendKeys(String.valueOf(pric));
	driver.findElement(By.id("rate")).sendKeys(String.valueOf(rate));
	driver.findElement(By.id("duration")).sendKeys(String.valueOf(duration));
	Thread.sleep(3000);
	driver.findElement(By.xpath("/html/body/div[3]/div/div/div[1]/div/button[1]")).click();
	

	driver.findElement(By.id("principal")).clear();
	driver.findElement(By.id("rate")).clear();
	driver.findElement(By.id("duration")).clear();
	
	
	}
	
	}
}
