package co.com.bing.certificacion.misegundoproyectoserenity.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.bing.com/")//define una pagina por defecto en mi clase Page, no hay necesidad de agregarla en todas las clases en caso de que tenga multiples venanas 
public class BingHomePage extends PageObject { //con el extends PageObject, este tiene un método open que al al instanciar la clase HomePage.open me va a abrir la url por defecto

	@FindBy(name="q")
    private WebElementFacade searchTerms;

    @FindBy(id="sb_form_go")
    private WebElementFacade lookupButton;

    public void enter_keywords(String keyword) {// las palabras de busqueda que digito 
        searchTerms.type(keyword);
    }

    public void lookup_terms() {
        lookupButton.waitUntilClickable().click();
    }
}
