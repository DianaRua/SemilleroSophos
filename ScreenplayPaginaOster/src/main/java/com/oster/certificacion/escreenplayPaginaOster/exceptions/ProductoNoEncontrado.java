package com.oster.certificacion.escreenplayPaginaOster.exceptions;

public class ProductoNoEncontrado extends AssertionError{
	
	public static final String PRODUCTO_NO_ENCONTRADO="El producto encontrado no corresponde a la busqueda";

	public ProductoNoEncontrado(String message, Throwable cause) {
		super(message, cause);	
	}

}
