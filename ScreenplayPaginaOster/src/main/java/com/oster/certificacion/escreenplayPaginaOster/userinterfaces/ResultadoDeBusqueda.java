package com.oster.certificacion.escreenplayPaginaOster.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class ResultadoDeBusqueda {
	
	public static final Target BOTON_AGREGAR_CARRO = Target.the("Agregar al carro")
			.located(By.xpath("//a[@class='buy']"));
	
	public static final Target CERRAR_BUTTON = Target.the("Cerrar el botón")
			.located(By.xpath("//button[@class='my_popup_close']"));
	
	public static final Target VER_CARRO = Target.the("Ver carro de compra")
			.located(By.xpath("//a[@class='info vcenter']"));
	
	public static final Target PRODUCTO= Target.the("Ver carro de compra")
			.located(By.xpath("//div[@class='info']"));
	

}
