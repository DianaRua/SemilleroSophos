package co.com.google.certificacion.miprimerscreenplay.stepsdefinitions;


import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import org.openqa.selenium.WebDriver;
import co.com.google.certificacion.miprimerscreenplay.models.Phrase;
import co.com.google.certificacion.miprimerscreenplay.questions.ThePhrase;
import co.com.google.certificacion.miprimerscreenplay.tasks.LookUpPhrase;
import co.com.google.certificacion.miprimerscreenplay.userinterfaces.GoogleHomePage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.Consequence;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import static org.hamcrest.core.Is.is;
import net.thucydides.core.annotations.Steps;

import java.util.List;

import org.hamcrest.Matcher;

public class BusquedaEnGoogleStepsDefinitions {
	
	public static final int CURRENT_FRASE=0;
	GoogleHomePage googleHomePage;
	
	@Managed(driver = "chrome")
    private WebDriver hisBrowser;
    private Actor Diana = Actor.named("Señora usuaria");
    
    @Before
	 public void actorCanBrowseTheWeb() {
	        Diana.can(BrowseTheWeb.with(hisBrowser));
    }
	
	@Given("^Diana esta en el sitio de google$")
	public void diana_esta_en_el_sitio_de_google() throws Exception {
	    Diana.wasAbleTo(Open.browserOn().the(googleHomePage));
	}


	@When("^el busca la frase compuesta$")
	public void el_busca_la_frase_compuesta(List<Phrase> phrases) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
	  Diana.attemptsTo(LookUpPhrase.composedOfTheWords(phrases.get(CURRENT_FRASE)));//se crea el método de busqueda e LookUpPhrase
	}

	@Then("^el verifica que la palabra \"([^\"]*)\" este en los resultados$")
	public void elVerificaQueLaPalabraEsteEnLosResultados(String resultadoEsperado)  {
		Diana.should(seeThat(ThePhrase.searched(), is(resultadoEsperado)));
	   
	  
	}


}
