package com.oster.certificacion.escreenplayPaginaOster.stepsdefinitions;

import java.util.List;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import com.oster.certificacion.escreenplayPaginaOster.tasks.BuscarProducto;
import com.oster.certificacion.escreenplayPaginaOster.userinterfaces.PaginaPrincipal;
import com.oster.certificacion.escreenplayPaginaOster.exceptions.ProductoNoEncontrado;
import com.oster.certificacion.escreenplayPaginaOster.model.Producto;
import com.oster.certificacion.escreenplayPaginaOster.questions.ValidarProducto;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import static org.hamcrest.CoreMatchers.containsString;


public class buscarEnOsterStepDefinitions{
	
	public static final int PRODUCTO_ACTUAL=0;

	PaginaPrincipal paginaPrincipal;
	
	@Managed(driver = "chrome")
	private WebDriver herBrowser;
	
	private Actor Diana = Actor.named("Diana");
	
	//se crea un método donde se relaciona tanto el driver con el actor
	
	@Before
	public void ActorCanBrowseTheWeb() {
		Diana.can(BrowseTheWeb.with(herBrowser)); //Diana puede navegar con su navegador
		
		//a partir de acá ya no se habla del driver sino del actor Diana
		
	}
	
		
	@Given("^Diana esta en la pagina de Oster$")
	public void dianaEstaEnLaPaginaDeOster()  {
	    // Write code here that turns the phrase above into concrete actions
		//precondiciones
		Diana.wasAbleTo(Open.browserOn().the(paginaPrincipal));//Diana fue capaz de abrir su browser en la pagina principal
		      //este método recibe tareas en este caso de abrir el navegador
	    
	}
	
	@When("^ella busca y agrega un producto al carro de compras$")
	public void ellaBuscaYAgregaUnProductoAlCarroDeCompras(List<Producto> productos) {//Clase Producto de model
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
		//condiciones
		Diana.attemptsTo(BuscarProducto.composedOfTheWords(productos.get(PRODUCTO_ACTUAL)));// tarea
	  
	    
	}

	@Then("^ella verifica que el producto agregado este en el \"([^\"]*)\"$")
	public void ellaVerificaQueElProductoAgregadoEsteEnEl(String Resultado)  {
	    // Write code here that turns the phrase above into concrete actions
		//postcondiciones
		
		Diana.should(seeThat(ValidarProducto.buscado(), containsString(Resultado)).orComplainWith(ProductoNoEncontrado.class, ProductoNoEncontrado.PRODUCTO_NO_ENCONTRADO));
		    //debería ver el producto buscado en clase validarProducto
	    
	}
}
