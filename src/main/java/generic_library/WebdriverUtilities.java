package generic_library;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebdriverUtilities {
	//dropdown
	public void dropDown(WebElement ele,String text) {
		Select s=new Select(ele);
		s.selectByVisibleText(text);
	}
	
	//mouseover
		public void mouseovering(WebDriver driver,WebElement ele) {
			Actions a =new Actions(driver);
			a.moveToElement(ele).perform();
		}
		
		//handling right click
		public void rightclick(WebDriver driver,WebElement ele) {
			Actions a =new Actions(driver);
			a.contextClick(ele).perform();
		}
		
		//handling doubleclick
		public void doubleclick(WebDriver driver,WebElement ele) {
			Actions a=new Actions(driver);
			a.doubleClick(ele).perform();
		}
		
		//drag and drop
		public void dragAnddrop(WebDriver driver,WebElement ele1,WebElement ele2) {
			Actions a =new Actions(driver);
			a.dragAndDrop(ele1,ele2).perform();
		}
		
		//frames
		public void frames(WebDriver driver,String value) {
			driver.switchTo().frame(value);
		}
		
		//default content
		public void frames(WebDriver driver) {
			driver.switchTo().defaultContent();
		}
		
		//handling child browser
		public void childBrowser(WebDriver driver) {
			Set<String> child=driver.getWindowHandles();
			for(String b:child) {
				driver.switchTo().window(b);
			}
		}
		
		//scrolling
		public void Scrolling(WebDriver driver,WebElement ele) {
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("arguments[0].scrollIntoView;",ele);
		}
		
		//pop up
		public void popup(WebDriver driver) {
			driver.switchTo().alert().accept();
		}
		
		

}
