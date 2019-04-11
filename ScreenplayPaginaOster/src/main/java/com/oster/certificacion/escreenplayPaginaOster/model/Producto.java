package com.oster.certificacion.escreenplayPaginaOster.model;

public class Producto {
	
	private String producto;
	private String caracteristica;
	
	public Producto(String producto, String caracteristica) {
	super();
		this.producto = producto;
		
		this.caracteristica = caracteristica;
	}
	public String getProducto() {
		return producto;
	}
	public void setProduco(String producto) {
		this.producto = producto;
	}
	public String getCaracteristica() {
		return caracteristica;
	}
	public void setpCaracteristica(String caracteristica) {
		this.caracteristica = caracteristica;
	}
	

}
