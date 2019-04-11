import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.sophos.main.BusquedaExcel;
import com.sophos.main.ConexionWebDriver;

public class PruebasExcel {
	
	ConexionWebDriver driver;
	BusquedaExcel excel;
	List<String> values;
	String xpath = "//div[@id='topstuff']//*";
	
	@Before
	public void setUp() throws Exception {
		driver= new ConexionWebDriver();
		excel= new BusquedaExcel();
	}

	@After
	public void tearDown() throws Exception {
		driver.close();
	}
	
	@Test 
	public void writeExcel() {
		values = new ArrayList<String>();
	    WebDriverWait wait = new WebDriverWait(driver.getDriver(), 20);
		for(Row r : excel.getMySheet()) {
			if(r.getCell(0)!=null) {
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("q")));
		    	driver.getDriver().findElement(By.name("q")).clear();
		    	driver.getDriver().findElement(By.name("q")).sendKeys(r.getCell(0).getStringCellValue());
		    	driver.getDriver().findElement(By.name("q")).submit();
		    	driver.waitForLoad();
		    	List <WebElement> childs = driver.getDriver().findElements(By.xpath(xpath));
		    	int numofChildren = childs.size();
		    	Boolean isPresent = numofChildren==0;
		    	System.out.println(numofChildren);
		    	excel.getRow(r.getRowNum()).createCell(1).setCellValue(isPresent);
			}
		}

		excel.closeInputSt();
	    excel.writeExcel();
	    assertTrue(true);
	}

}
