package co.com.googlepom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import UtilidadesDeDesarrollo.BasePage;

public class GoogleHomePage {
	
	private WebDriver driver;
	private BasePage basepage;
	private By txBuscar = By.name("q");
	private By ButtonBuscar = By.name("btnK");
	
	
	public GoogleHomePage(WebDriver driver) {//constructor conexión al drive
	this.driver = driver;
	basepage = new BasePage(driver);
	
	}
	
	public void EscribirTextoBuscar(String texto) {
		basepage.writeText(txBuscar, texto);
	}
	
	public void darClickEnBucar() {
		basepage.click(ButtonBuscar);
	}
	
			
	public void realizarCaptura(String nombre) {
		try {
			basepage.getEvidence(nombre);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	}

}
