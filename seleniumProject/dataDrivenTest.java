	package seleniumProject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class dataDrivenTest {
	public static void main(String[] args) throws IOException
	{
		FileInputStream file=new FileInputStream("E://QA//Book1.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		XSSFSheet sheet=workbook.getSheetAt(0);//proving sheet name
		//XSSFSheet sheet=workbook.getSheet("Sheet1");
		int rowCount=sheet.getLastRowNum();// returns the row count
		int colCount=sheet.getRow(0).getLastCellNum();// returns the cell/column count
		for(int i=0;i<=rowCount;i++)
		{
			XSSFRow currentRow=sheet.getRow(i);//focussed in current row
			for(int j=0;j<colCount;j++)
			{
			String value=currentRow.getCell(j).toString();//read the value from a cell
			System.out.print(" " +value);
			}
			System.out.println();
		}
		
	}
	

}
