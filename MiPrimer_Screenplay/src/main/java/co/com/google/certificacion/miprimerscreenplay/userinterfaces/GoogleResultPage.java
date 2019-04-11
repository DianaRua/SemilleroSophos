package co.com.google.certificacion.miprimerscreenplay.userinterfaces;

import org.openqa.selenium.By;
import net.serenitybdd.screenplay.targets.Target;

public class GoogleResultPage {
	
public static final Target SEARCH_BAR = Target.the("la barra de busqueda")    		
            .located(By.name("q"));
public static final Target RESULT = Target.the("lista de resultados")    		
            .located(By.id("resultado"));

}
