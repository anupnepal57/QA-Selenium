package seleniumProject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Gurucase {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.gecko.driver","E://QA//geckodriver-v0.29.1-win64//geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.demo.guru99.com/v4/");
		
		FileInputStream file= new FileInputStream("E://QA//GuruBook1.xlsx");
		XSSFWorkbook workbook= new XSSFWorkbook(file);
		XSSFSheet sheet= workbook.getSheet("Sheet1");
		int rowCount= sheet.getLastRowNum();
		for(int i=1;i<=rowCount;i++)
		{
			XSSFRow row=sheet.getRow(i);
			XSSFCell UserNamecell=row.getCell(0);
			String user=UserNamecell.getStringCellValue();
			XSSFCell Passwordcell=row.getCell(1);
			String pass= Passwordcell.getStringCellValue();
			
			
			driver.findElement(By.xpath("/html/body/form/table/tbody/tr[1]/td[2]/input")).sendKeys(String.valueOf(user));
			driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input")).sendKeys(String.valueOf(pass)); 
			
			Thread.sleep(3000);
			driver.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input[1]")).click();
			driver.findElement(By.xpath("/html/body/form/table/tbody/tr[1]/td[2]/input")).clear();
			driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input")).clear();
			
		}
	}

}
