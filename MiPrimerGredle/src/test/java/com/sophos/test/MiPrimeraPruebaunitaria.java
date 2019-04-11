package com.sophos.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//animal-sniffer

public class MiPrimeraPruebaunitaria {
	WebDriver Diana;//se declara

		@Before
	public void setUp() throws Exception {
		 System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		  Diana = new ChromeDriver();//se inicializa
		  	 
			
	}

	@After
	public void tearDown() throws Exception {
		Diana.close();//se cierra
	}

	@Test
	public void test() {
				
		Diana.get("http:\\www.google.com.uy");
		Diana.findElement(By.name("q")).sendKeys("selenium get screen");
		Diana.findElement(By.name("btnK")).submit();
		//assert.
	}

	@Test
	public void test2() {
				
		Diana.get("http:\\www.google.com.uy");
		Diana.findElement(By.name("q")).sendKeys("el colombiano");
		Diana.findElement(By.name("btnK")).submit();
	}

}
