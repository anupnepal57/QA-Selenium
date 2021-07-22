package javaScriptUtil;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class JavaScriptExec {
	/*public static void scrollIntoView(WebElement element, WebDriver driver) {
	JavascriptExecutor js=((JavascriptExecutor)driver);
	js.executeScript("arguments[0].scrollIntoView(true);", element);
	}*/



	public static void scrollPageDown(WebDriver driver) {
	JavascriptExecutor js=((JavascriptExecutor) driver);
	js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}
}