package com.sophos.main;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PaginaPrincipalOster {
	
	WebDriver objDriver;
	By popup = By.id("cerrar-popup-registro");
	By caja_busqueda = By.xpath("//fieldset[@class='busca']//input[@type='text']");
	By enter = By.xpath("//input[@value='Buscar']");
	
	
	public PaginaPrincipalOster(WebDriver objDriver) {
		this.objDriver = objDriver;

}
	
	public void CerrarPopup() {
		objDriver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		objDriver.findElement(popup).click(); //se cierra la X de ventana de descuento
		}
	
	public void IngresarArticuloCaja(String articulo) {
		objDriver.findElement(caja_busqueda).sendKeys(articulo);
		
	}
	
	public void Darclick() {
		objDriver.findElement(enter).click();
	}

}