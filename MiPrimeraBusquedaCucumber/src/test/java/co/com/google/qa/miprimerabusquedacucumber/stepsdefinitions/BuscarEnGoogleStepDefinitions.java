package co.com.google.qa.miprimerabusquedacucumber.stepsdefinitions;

import static org.junit.Assert.assertEquals;

import java.io.FileOutputStream;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import co.com.googlepom.GoogleHomePage;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BuscarEnGoogleStepDefinitions {
	WebDriver driver;
	private GoogleHomePage googleHomePage;
	private Scenario scenario;
	
	//By txBuscar = By.name("q");
	//By ButtonBuscar = By.name("btnK");
	

	@Before
	public void before(Scenario scenario) {
		this.scenario = scenario;
	}
	
	
			
		@Given("Diana is on google home page")
		public void diana_is_on_google_home_page() {
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

		@When("She make the search")
		public void she_make_the_search() {
		    // Write code here that turns the phrase above into concrete actions
			System.out.println("En la barra de busqueda Diana escribe una palabra");
			System.out.println("Diana da click en el botón buscar");
			googleHomePage.EscribirTextoBuscar("cucumber Selenium Serenity");
			googleHomePage.darClickEnBucar();
			
			//driver.findElement(ButtonBuscar).submit();
			
		    
		}

		@Then("she validate that the result successful")
		public void she_validate_that_the_result_successful() {
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



