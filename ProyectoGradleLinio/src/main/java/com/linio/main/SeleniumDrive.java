package com.linio.main;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class SeleniumDrive {
	
	WebDriver objedriver;
	
	public SeleniumDrive() {//constructor
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		objedriver = new ChromeDriver();
		objedriver. manage().window().maximize();
		
		}
	
	public void IrUrl(String url) { //método para obtener la url de Linio

		objedriver.get(url);
	}
	
     public void CapturaPantalla(String ruta) {
		
		TakesScreenshot ts = (TakesScreenshot)objedriver;//Convertir el objeto del controlador web a TakeScreenshot
		 
	 	 
		 try { //Llama al método getScreenshotAs para crear un archivo de imagen y Copie el archivo a la ubicación deseada
			 FileHandler.copy(ts.getScreenshotAs(OutputType.FILE), new File(ruta));//guarda la imagen
			 
				 
		 } catch (WebDriverException e) {
			 
		 } catch (IOException e) {
			 
		 }
		 
}      public void FinalizarWebDriver() {
	    objedriver.close();
	
}

	
	
	

}
