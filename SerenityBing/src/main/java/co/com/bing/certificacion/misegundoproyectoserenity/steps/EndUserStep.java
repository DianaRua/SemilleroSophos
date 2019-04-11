package co.com.bing.certificacion.misegundoproyectoserenity.steps;

import co.com.bing.certificacion.misegundoproyectoserenity.pages.BingHomePage;
import net.thucydides.core.annotations.Step;

public class EndUserStep {
	
	BingHomePage bingHomePage;

    @Step
    public void enters(String keyword) { //mapeo que realicé en la barra de busqueda de clase BingHomePage
    	bingHomePage.enter_keywords(keyword);
    }

    @Step // entre comillas se puede poner acá en el step lo que voy a hacer para que salga en el reporte
    public void startsSearch() {
    	bingHomePage.lookup_terms(); 
    
    }


    @Step
    public void is_the_home_page() {
    	bingHomePage.open();//este método open fue heredado de PageObject en clase BigHomePage es el que nos abre la página que está en default en BimgHomePage
    }

    @Step
    public void looks_for(String term) { //tampoco está en uso
        enters(term);
        startsSearch();
    
    }



}
