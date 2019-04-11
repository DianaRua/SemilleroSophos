package co.com.bing.certificacion.misegundoproyectoserenity.stepsdefinitions;

import co.com.bing.certificacion.misegundoproyectoserenity.steps.EndUserStep;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class BusquedaEnBingStepsDefinitions {
	
	@Steps
	EndUserStep diana;
	
	@Given("^Diana esta en el sitio bing$")
	public void dianaEstaEnElSitioBing()  {
	    // Write code here that turns the phrase above into concrete actions
		diana.is_the_home_page();
	    
	}


	@When("^el busca la palabra \"([^\"]*)\" y \"([^\"]*)\"$")
	public void elBuscaLaPalabraY(String arg1, String arg2) {
	    // Write code here that turns the phrase above into concrete actions
		diana.looks_for(arg1 + " "+ arg2);
		
	   
	}

	@Then("^el verifica que la palabra \"([^\"]*)\" este en los resultados$")
	public void elVerificaQueLaPalabraEsteEnLosResultados(String arg1)  {
	    // Write code here that turns the phrase above into concrete actions
	   
	}



}
