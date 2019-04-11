package co.com.linio.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import com.linio.main.PaginaPrincipalLinio;
import com.linio.main.SeleniumDrive;

public class TestLinio {

	SeleniumDrive objselenium;
	WebDriver objdriver;
	PaginaPrincipalLinio objpaginaprincipalLinio;
	
	

	@Before
	public void setUp() throws Exception {
		objselenium = new SeleniumDrive();
		objselenium.IrUrl("https://www.linio.com.co/");
		objpaginaprincipalLinio = new PaginaPrincipalLinio(objdriver);
		
			
	}

	@After
	public void tearDown() throws Exception {
		objselenium.FinalizarWebDriver();
		
	}
	
	

	@Test
	public void test() {
		objselenium.CapturaPantalla("C:\\Users\\SEMILLERO10\\eclipse-workspace\\ProyectoGradleLinio\\Imagenes");
        objpaginaprincipalLinio.IngresarArticulo("zapatos");
        objpaginaprincipalLinio.PresionarEnter();
		
		
	}

}
