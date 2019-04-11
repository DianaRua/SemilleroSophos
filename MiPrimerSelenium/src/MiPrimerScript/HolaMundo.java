package MiPrimerScript;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HolaMundo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver Diana = new ChromeDriver();
		Diana.get("http:\\www.google.com.uy");
		Diana.findElement(By.name("q")).sendKeys("selenium get screen");
		Diana.findElement(By.name("btnK")).submit();
		
		TakesScreenshot ts = (TakesScreenshot)Diana;
			 
		try {
			FileHandler.copy(ts.getScreenshotAs(OutputType.FILE), new File("C:\\Selenium\\Imagen\\Screenshot.png"));
		}	catch (WebDriverException e) {
			
		} catch (IOException e){
			}
		Diana.quit();
			}
		
}