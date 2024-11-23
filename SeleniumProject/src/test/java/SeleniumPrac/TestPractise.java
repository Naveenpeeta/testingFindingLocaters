package SeleniumPrac;

import javax.swing.text.Highlighter.Highlight;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestPractise {
      public static void main(String[] args) throws InterruptedException {
    	  WebDriverManager.chromedriver().setup();
    	  WebDriver driver= new ChromeDriver();
    	  driver.get("https://www.facebook.com/");
    	  
    	  Thread.sleep(3000);
    	  highlight(driver,driver.findElement(By.name("email")));
    	  Thread.sleep(3000);
    	  highlight(driver,driver.findElement(By.id("passContainer")));
    	  Thread.sleep(3000);
    	  highlight(driver,driver.findElement(By.partialLinkText("Password?")));
    	  Thread.sleep(3000);
    	  driver.quit();
    	  
      }
      public static void highlight(WebDriver driver, WebElement element) {
          JavascriptExecutor js = (JavascriptExecutor) driver;
          js.executeScript("arguments[0].style.border='3px solid blue'", element);
      }
}
