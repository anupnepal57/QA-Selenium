package javaScriptUtil;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class JavaScriptExec {
	//to scroll upto required area//
	
	public static void scrollIntoView(WebElement element, WebDriver driver) {
	JavascriptExecutor js=((JavascriptExecutor)driver);
	js.executeScript("arguments[0].scrollIntoView(true);", element);
	}


	//to scroll down of the p[age//
	
	public static void scrollPageDown(WebDriver driver) {
	JavascriptExecutor js=((JavascriptExecutor) driver);
	js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}
}
