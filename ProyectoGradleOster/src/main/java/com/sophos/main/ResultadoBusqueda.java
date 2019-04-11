package com.sophos.main;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

//import com.sun.tools.javac.util.Context.Key;

public class ResultadoBusqueda {
	WebDriver objDriver;
	By botonAgregarCarrito;
	By button = By.xpath("//button[@class='my_popup_close']"); 
	By verCarrito = By.xpath("//a[@class='info vcenter']");
	
	public ResultadoBusqueda(WebDriver objDriver) {
		this.objDriver = objDriver;
		}
	
	public void AgregarCarrito(String articulo) {
		botonAgregarCarrito = By.xpath("//body[@class='departamento Licuar y Mezclar os_desktop']/div[@class='row modulo listado']/div[@class='center']/div[@class='col-2']/div[@class='main']/div[@class='vitrine resultItemsWrapper']/div[@class='itemProduct']/div[@class='itemProduct n3colunas']/ul[1]/li[1]/div[1]/div[3]/a[1]");
		objDriver.findElement(botonAgregarCarrito).sendKeys(Keys.ENTER);
		
		//h2[contains(text(),'"+articulo+"')]/parent::div/div[@class='row']/a[@class='buy']// por probleams en mostar producto en carrito le cambio el xphat
	}
	
	public void CerrarButton() {
		objDriver.findElement(button).click();
	}
	
	public void VerCarrito() {
		objDriver.findElement(verCarrito).click();
	}
	

}
