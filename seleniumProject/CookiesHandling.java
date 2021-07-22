package seleniumProject;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CookiesHandling {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","E://QA//geckodriver-v0.29.1-win64//geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		//capture all the cookies from the browser//
		Set<Cookie> cookies=driver.manage().getCookies();
		
		System.out.println("Size of cookies:" +cookies.size());// print size of cookies
		
		for(Cookie cookie:cookies) {
			System.out.println(cookie.getName()+":"+cookie.getValue());//print name and value
			
		}
		
		
		//-----capturing specified cookie-------\\
		
		System.out.println(driver.manage().getCookieNamed("session-id-time"));

		
		
		//------------Adding Cookies-----------//
		
		Cookie cobj= new Cookie("hello","123");
		driver.manage().addCookie(cobj);
		 cookies=driver.manage().getCookies();
		 System.out.println("Size of cookies:" +cookies.size());
		 for(Cookie cookie:cookies) {
			System.out.println(cookie.getName()+":"+cookie.getValue());
		}
	
		 	//----------Deleting Cookie----------//
		 driver.manage().deleteCookie(cobj);
		 cookies=driver.manage().getCookies();
		 System.out.println("Size of cookies:" +cookies.size());
		 for(Cookie cookie:cookies) {
			System.out.println(cookie.getName()+":"+cookie.getValue());
		}
		 
	}

}
