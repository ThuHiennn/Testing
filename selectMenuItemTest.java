package Baitap4;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;;
public class selectMenuItemTest {
	public static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","D:\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); 
		driver.get("http://demo.guru99.com/test/guru99home/");
		driver.manage().window().maximize();
		Testing("Testing",driver);

	}
	public static void Testing(String Testing, WebDriver driver) {
		
		WebElement listElement = driver.findElement(By.xpath("//div[@class='menu-block']"));
		List <WebElement> el1 = driver.findElements(By.xpath("//*[@class='item118 parent']"));
		for (int i=0; i< el1.size(); i++) {
			if (el1.get(i).getText().equals(Testing)) {
				el1.get(i).click();
			}
		}	
		
	}
}
		
  


