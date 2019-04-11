package com.oster.certificacion.escreenplayPaginaOster.tasks;

import static com.oster.certificacion.escreenplayPaginaOster.userinterfaces.PaginaPrincipal.BUSCAR_BARRA;
import static com.oster.certificacion.escreenplayPaginaOster.userinterfaces.PaginaPrincipal.POPUP; 
import static com.oster.certificacion.escreenplayPaginaOster.userinterfaces.ResultadoDeBusqueda.BOTON_AGREGAR_CARRO;
import static com.oster.certificacion.escreenplayPaginaOster.userinterfaces.ResultadoDeBusqueda.CERRAR_BUTTON;
import static com.oster.certificacion.escreenplayPaginaOster.userinterfaces.ResultadoDeBusqueda.VER_CARRO;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import org.openqa.selenium.Keys;
import com.oster.certificacion.escreenplayPaginaOster.model.Producto;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class BuscarProducto implements Task {
	
	private String producto;
	
	public BuscarProducto(String producto) {
		this.producto = producto;
		
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				
				Click.on(POPUP),
				
				Enter.theValue(producto).into(BUSCAR_BARRA).thenHit(Keys.ENTER)
				);
		BrowseTheWeb.as(actor).waitFor(3).second();
		BOTON_AGREGAR_CARRO.resolveFor(actor).click();
		CERRAR_BUTTON.resolveFor(actor).click();
		VER_CARRO.resolveFor(actor).click();
	}
		//generar todas las interacciones o acciones para cumplir con la primera tarea
		
	
	public static BuscarProducto composedOfTheWords(Producto producto) {
		
		return instrumented(BuscarProducto.class, producto.getProducto()+" " + producto.getCaracteristica());
		
		
		
		
        }
}
