package co.com.bing.certificacion.misegundoproyectoserenity.runners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)   
@CucumberOptions( features="src/test/resources/features",
        glue = { "co.com.bing.certificacion.misegundoproyectoserenity.stepsdefinitions" },
        snippets =  SnippetType.CAMELCASE
        )  

public class BusquedaEnBingRunner {
	
	

}
