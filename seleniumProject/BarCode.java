package seleniumProject;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.zxing.BinaryBitmap;
import com.google.zxing.LuminanceSource;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;

public class BarCode {

	public static void main(String[] args) throws IOException, NotFoundException {
		System.setProperty("webdriver.chrome.driver", "E://QA//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://barcode.tec-it.com/en/");
		String barCodeURL=driver.findElement(By.xpath("//*[@id=\"infoTarget\"]/div[1]/img")).getAttribute("src");
		URL url=new URL(barCodeURL);
		
		BufferedImage bufferedimage=ImageIO.read(url);
		
	//----Zxing methods---------//
		LuminanceSource luminanceSource= new BufferedImageLuminanceSource(bufferedimage);
		BinaryBitmap binaryBitmap=new BinaryBitmap(new HybridBinarizer(luminanceSource));
		Result result= new MultiFormatReader().decode(binaryBitmap);
		result.getText();
		System.out.println(result.getText());
		
		driver.quit();
	}

}
