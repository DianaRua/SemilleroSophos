package co.com.google.certificacion.miprimerproyectoserenity.stepsdefinitions;

import co.com.google.certificacion.miprimerproyectoserenity.steps.EndUserStep;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;



public class BusquedaEnGoogleStepDefinition {
	
	@Steps
	EndUserStep diana;
	
	@Given("^Diana esta en el sitio google$")
	public void dianaEstaEnElSitioGoogle() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		diana.is_the_home_page();
	   
	}


	@When("^el busca la palabra \"([^\"]*)\" y \"([^\"]*)\"$")
	public void elBuscaLaPalabraY(String arg1, String arg2) throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		diana.looks_for(arg1+ "" +arg2);
			    
	}

	@Then("^el verifica que la palabra \"([^\"]*)\" este en los resultados$")
	public void elVerificaQueLaPalabraEsteEnLosResultados(String arg1) throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	  
	}

}
