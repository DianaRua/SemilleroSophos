package co.com.google.certificacion.miprimerproyectoserenity.steps;

import co.com.google.certificacion.miprimerproyectoserenity.pages.GoogleHomePage;
import net.thucydides.core.annotations.Step;

public class EndUserStep {
	
	GoogleHomePage googlePage;

    @Step
    public void enters(String keyword) {
        googlePage.enter_keywords(keyword);
    }

    @Step // entre comillas se puede poner acá en el step lo que voy a hacer para que salga en el reporte
    public void startsSearch() {
    	googlePage.lookup_terms();
    
    }


    @Step
    public void is_the_home_page() {
        googlePage.open();
    }

    @Step
    public void looks_for(String term) {
        enters(term);
        startsSearch();
    
    }


}
