package co.com.google.certificacion.miprimerscreenplay.questions;

import co.com.google.certificacion.miprimerscreenplay.userinterfaces.GoogleResultPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;


	
	@Subject("validar resultado")
	public class ThePhrase implements Question<String>  {
				
		public ThePhrase() {
			// TODO Auto-generated constructor stub
		}

		@Override
		public String answeredBy(Actor actor) {
			
			// TODO Auto-generated method stub
			return GoogleResultPage.SEARCH_BAR.resolveFor(actor).waitUntilVisible().getValue();
		}
		
		public static ThePhrase searched() {// este se hace así para que llame automaticamente la clase y devuelve el resultado
			return new ThePhrase();           // sin necesidad de instanciar, osea no crear un objeto
		}
		
	}

	



