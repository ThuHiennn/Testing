package newpakage;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriverBuilder;

public class DemoTable {
	private WebDriver driver;
	private static String url;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","D:\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		url= "http://demo.guru99.com/test/web-table-element.php";
		driver.manage().window().maximize();
		driver.get(url);
		
		getTotalRowNumber(driver);
		getTotalColumnNumber(driver);
		getRowNumberByValue(driver,"Escorts Ltd.");
		getTableCellValue(3,2,driver);		
	}
	
	public static void getTotalRowNumber (WebDriver driver) {
		
		List <WebElement> rows = driver.findElements(By.xpath("//*[@id='leftcontainer']/table/tbody/tr/td[1]"));
        System.out.println("Total row: " + rows.size());
	}
	
	public static void getTotalColumnNumber (WebDriver driver) {
		List <WebElement> cols = driver.findElements(By.xpath("//*[@id='leftcontainer']/table/thead/tr/th"));
        System.out.println("Total column: " + cols.size());
	}
	
	public static void getRowNumberByValue (WebDriver driver, String value) {
		List <WebElement> findEl = driver.findElements(By.xpath("//*[@id='leftcontainer']/table/tbody/tr/td[1]"));
		for (int i = 0; i < findEl.size(); i++) {
        	if (findEl.get(i).getText().equals(value)) {
      
        		System.out.println("Find value at row: " + (i+1));
        		
        		}
            System.out.println("Item can not find at row: " +(i+1));
        	}
        }
	public static void getTableCellValue(int row, int col ,WebDriver driver) {
        List <WebElement> rows = driver.findElements(By.xpath("//*[@id='leftcontainer']/table/tbody/tr"));
        WebElement SelectedRow = rows.get(row);
        List <WebElement> cols = SelectedRow.findElements(By.xpath("//*[@id='leftcontainer']/table/tbody/tr/td[4]"));
        System.out.println("Ket qua:" + cols.get(col).getText());
    
	}
}


