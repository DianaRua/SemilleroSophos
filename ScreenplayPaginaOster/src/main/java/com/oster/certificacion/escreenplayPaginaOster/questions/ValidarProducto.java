package com.oster.certificacion.escreenplayPaginaOster.questions;

import com.oster.certificacion.escreenplayPaginaOster.userinterfaces.ResultadoDeBusqueda;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;


@Subject ("validar resultado")
public class ValidarProducto implements Question<String> {

	@Override
	public String answeredBy(Actor Diana) {
		// TODO Auto-generated method stub
		return ResultadoDeBusqueda.PRODUCTO.resolveFor(Diana).waitUntilVisible().getTextContent();//me trae el texto que tiene contenido
	}

	public static ValidarProducto buscado() {
		return new ValidarProducto();
	}
	
	
	

}
