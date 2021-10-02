package Baitap4;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;;
public class FileElementWithXpathAxesTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","D:\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); 
		driver.get("http://demo.guru99.com/test/guru99home/");
		driver.manage().window().maximize();
		
		//Following-sibling
		List <WebElement> el = driver.findElements(By.xpath("//h2[contains(text(),'A few of our most popular courses')]/parent::div//div[//a[text()='SELENIUM']]/following-sibling::div[@class='rt-grid-2 rt-omega']"));
		for (WebElement webElement : el) {
            System.out.println(webElement.getText());   
        
        } 
		//Following
		List <WebElement> el1 = driver.findElements(By.xpath("//*[@class='item118 parent']//following::li"));
		for (WebElement webElement : el1) {
            System.out.println(webElement.getText());   
		}
		//Preceding
		WebElement el2 = driver.findElement(By.xpath("//div[@class='canvas-middle']//preceding::h2[(contains(text(),\"Check out our newest courses\"))]"));
		//Ancestor
		WebElement el3 = driver.findElement(By.xpath("//div[@class='column col1']//ancestor::div[2]"));
		//Descendant
		WebElement el4 = driver.findElement(By.xpath("//div[@class='menu-block']//descendant::div"));
		//Parent
		WebElement el5 = driver.findElement(By.xpath("//div[@class='column col1']//parent::div"));
		//Child
		WebElement el6 = driver.findElement(By.xpath("//*[@class='menu-block']//child::div"));
		
	}

}
