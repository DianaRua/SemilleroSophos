import static org.junit.Assert.*;

//import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.junit.After;
//import org.junit.AfterClass;
import org.junit.Before;
//import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;

import com.sophos.main.PaginaPrincipalOster;
import com.sophos.main.ResultadoBusqueda;
import com.sophos.main.SeleniumDrive;



public class PruebasProyectoOster {

	SeleniumDrive objSeleniumDrive;
	WebDriver Driver;
	PaginaPrincipalOster objPaginaPrincipal;
	ResultadoBusqueda objResultadoBusqueda;
	

	
	@Before
	public void setUp() throws Exception {
		objSeleniumDrive = new SeleniumDrive();
        objSeleniumDrive.IrUrl("https://www.ostercolombia.com/");
        Driver = objSeleniumDrive.getObjDriver();
        objPaginaPrincipal = new PaginaPrincipalOster(Driver);
        objResultadoBusqueda = new ResultadoBusqueda(Driver);
        
		
		
	}

	@After
	public void tearDown() throws Exception {
		
		objSeleniumDrive.FinalizarWebDriver();
	}

	@Test
	public void test1() {
	
		objSeleniumDrive.CapturaPantalla("C:\\Users\\SEMILLERO10\\eclipse-workspace\\ProyectoGradleOster\\Capturas\\imagen.png");
		objPaginaPrincipal.CerrarPopup();
		objPaginaPrincipal.IngresarArticuloCaja("licuadora");
		objPaginaPrincipal.Darclick();
		Driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		objSeleniumDrive.CapturaPantalla("C:\\Users\\SEMILLERO10\\eclipse-workspace\\ProyectoGradleOster\\Capturas\\imagen2.png");
		objResultadoBusqueda.AgregarCarrito("Mezclador Personal (Licuadora)");
		objResultadoBusqueda.CerrarButton();
		objResultadoBusqueda.VerCarrito();
		objSeleniumDrive.CapturaPantalla("C:\\Users\\SEMILLERO10\\eclipse-workspace\\ProyectoGradleOster\\Capturas\\imagen3.png");
		
		
		
	
		}

	
	
}
