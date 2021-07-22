package seleniumProject;


import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class BrokenLinks {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E://QA//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//System.setProperty("webdriver.gecko.driver","E://QA//geckodriver-v0.29.1-win64//geckodriver.exe");
		//WebDriver driver= new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		//Implicit wait for 20 secs//
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//launch url//
		driver.get( "http://www.zlti.com");
		
		//wait//
		Thread.sleep(2000);
		
		//capture links from webpage//
	List <WebElement>links=driver.findElements(By.tagName("a"));
	
	//numberof links//
	System.out.println(links.size());
	
	for(int i=0;i<=links.size();i++) {
		
		//by using href attribute using url of required link//
		
		WebElement a= links.get(i);
		String url= a.getAttribute("href");
		URL link= new URL(url);
		
		//create a connection using url object 'link'//
		
		HttpURLConnection httpconn= (HttpURLConnection)link.openConnection();
		Thread.sleep(2000);
		//establish connection//
		httpconn.connect();
		
		int rescode=httpconn.getResponseCode();//return response code;if response code is above 400;broken
		if(rescode>=400) {
			System.out.println(url +" - "+ " is broken link");
		}
		else
		{
			System.out.println(url +" - "+ " is valid link");
		}
		
	}
	
	
	}

}
