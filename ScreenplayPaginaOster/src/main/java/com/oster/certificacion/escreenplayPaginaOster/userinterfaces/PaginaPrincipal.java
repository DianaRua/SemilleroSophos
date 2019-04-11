package com.oster.certificacion.escreenplayPaginaOster.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.ostercolombia.com/")

public class PaginaPrincipal extends PageObject {
	
	public static final Target POPUP = Target.the("Cerrar Propaganda")
			.located(By.xpath("//div[@class='center-popup']//button[contains(text(),'X')]"));
	
	public static final Target BUSCAR_BARRA= Target.the("la barra de busqueda")    		
            .located(By.xpath("//fieldset[@class='busca']//input[@type='text']"));
	
	
	public static final Target BUSCAR_ENTER = Target.the("enter")
	          .located(By.xpath("//input[@value='Buscar']"));
	                                  

}