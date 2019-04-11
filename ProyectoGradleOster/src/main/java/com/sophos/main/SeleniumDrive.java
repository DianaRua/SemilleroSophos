package com.sophos.main;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class SeleniumDrive {
	
	WebDriver objDriver;//declarar variable
	
	public SeleniumDrive() {//constructor
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		objDriver = new ChromeDriver();
		objDriver.manage().window().maximize();//ampliar página
		
	}

	public WebDriver getObjDriver() {//get automático
		return objDriver;
	}
	
	public void IrUrl(String url) { //método para obtener la url

		objDriver.get(url);
	}
	
	
	
	public void CapturaPantalla(String ruta) {
		
		TakesScreenshot ts = (TakesScreenshot)objDriver;//Convertir el objeto del controlador web a TakeScreenshot
		 
	 	 
		 try { //Llama al método getScreenshotAs para crear un archivo de imagen y Copie el archivo a la ubicación deseada
			 FileHandler.copy(ts.getScreenshotAs(OutputType.FILE), new File(ruta));//guarda la imagen
			 
				 
		 } catch (WebDriverException e) {
			 
		 } catch (IOException e) {
			 
		 }
	}
    public void FinalizarWebDriver() {
    	
    	objDriver.quit();
    }
}


	

