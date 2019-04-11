package co.com.google.qa.googlesearchwhitdatafeature.stepdefinitions;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import co.com.googlepom.GoogleHomePage;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GoogleSearchWhitDataStepDefinitions {
	
	WebDriver driver;
	private GoogleHomePage googleHomePage;
	private Scenario scenario;
	
	@Before
	public void before(Scenario scenario) {
		this.scenario = scenario;
	}
	
	
	@Given("Diana esta en el sitio google")
	public void dianaEstaEnElSitioGoogle() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Diana abre su navegador");
		System.setProperty("webdriver.chrome.driver" , "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		googleHomePage = new GoogleHomePage(driver);
		System.out.println("Diana abre la página inicio google");
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		System.out.println("El abre la pagina de inicio");
		
	}

	@When("el busca la palabra {string} y {string}")
	public void elBuscaLaPalabraY(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("En la barra de busqueda Diana escribe una palabra");
		System.out.println("Diana da click en el botón buscar");
		googleHomePage.EscribirTextoBuscar(string + string2);
		googleHomePage.darClickEnBucar();
	}

	@Then("el verifica que la palabra {string} este en los resultados")
	public void elVerificaQueLaPalabraEsteEnLosResultados(String string) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("El actor captura los resultados");
		System.out.println("El actor verifica que la busqueda sea exitosa");
		googleHomePage.realizarCaptura("imagen");
		assertEquals("cucumber Selenium Serenity - Buscar con Google" , driver.getTitle());
	}
		
		@After 
		public void embedScreenshot(Scenario scenario) {
					
			try {
				if(!scenario.isFailed()) {	
					byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
					scenario.embed(screenshot, "image/png");
				}				
					
				
			} catch (Exception e) {
				// TODO: handle exception
			}
		
		driver.quit();
	  
	}

}
