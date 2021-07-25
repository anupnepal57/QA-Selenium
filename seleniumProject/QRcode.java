package seleniumProject;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.MalformedURLException;
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

public class QRcode {

	public static void main(String[] args) throws IOException, NotFoundException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\QA\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.qaautomation.co.in/2019/01/automating-qr-code-using-selenium-webdriver.html");
		
		
		String qrCodeURL= driver.findElement(By.xpath("//*[@id=\"post-body-9019981563173157788\"]/div[1]/div/div[16]/div[1]/a/img")).getAttribute("src");
		URL url=new URL( qrCodeURL);
		
		BufferedImage bufferedimage= ImageIO.read(url);
		LuminanceSource luminanceSource=new BufferedImageLuminanceSource(bufferedimage);
		BinaryBitmap binaryBitmap= new BinaryBitmap(new HybridBinarizer(luminanceSource));
		
		Result result= new MultiFormatReader().decode(binaryBitmap);
		 System.out.println(result.getText());
	}

}
