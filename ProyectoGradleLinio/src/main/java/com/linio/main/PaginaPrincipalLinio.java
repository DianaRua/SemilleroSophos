package com.linio.main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class PaginaPrincipalLinio {
	
	//private WebDriverWait wait;
	WebDriver objDriver;
	By caja_Busqueda =By.xpath("//div[@class='input-group hidden-sm-down input-group-search']//input[@placeholder='Busca productos']");
	By enter = By.xpath("//div[@class='input-group-btn']//span[@class='icon icon-inverse'][contains(text(),'')]");
	
	
	public PaginaPrincipalLinio(WebDriver objDriver) {
		this.objDriver = objDriver;
	}
	
	
	public void IngresarArticulo(String articulo) {
		objDriver.findElement(caja_Busqueda).sendKeys(articulo);
		
	}
		
	public void PresionarEnter() {
		objDriver.findElement(enter).click();
	}
		
		
	
}
