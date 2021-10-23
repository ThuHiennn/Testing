package Baitap2310;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.openqa.selenium.support.ui.Select;

@Listeners(Baitap2310.TestListener.class)
public class Ex2 extends Ex1 {
	@Test(priority = 0)
	public static void VerifyRegister() {
		WebElement w = driver.findElement(By.xpath("//*[@style= 'margin-left:20px;']/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a"));
		w.click();

		List<WebElement> childElements = driver.findElements(By.xpath("//*[@style='font-family:Arial, Helvetica;font-size:13px;color:#000;padding:5px;']/input"));
	for(int i = 0; i<childElements.size();i++) {
		childElements.get(0).sendKeys("Thu");
	    childElements.get(1).sendKeys("Hien");
	    childElements.get(2).sendKeys("0123456789");
	    childElements.get(3).sendKeys("botlocchamnuocmam@gmail.com");

	    childElements.get(4).sendKeys("120 Pham Van Bach");
	    childElements.get(5).sendKeys("TP HCM");
	    childElements.get(6).sendKeys("Phuong 15");
	    childElements.get(7).sendKeys("700000");
	    
	    WebElement sort = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[11]/td[2]/select"));
		Select dropDown = new Select(sort);
		dropDown.selectByValue("VIETNAM");
		
	    childElements.get(8).sendKeys("ThuHyun");
	    childElements.get(9).sendKeys("H123456");
	    childElements.get(10).sendKeys("H123456");
	    break;
	    }

	WebElement submit = driver.findElement(By.xpath("//*[@name='submit']"));
	submit.click();
	System.out.println("Tạo thành công!");
	    
	}
	
	@Test(priority = 1)
	public static void loginPage() {
		WebElement login = driver.findElement(By.xpath("//*[@style= 'margin-left:20px;']/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[1]/a"));
        login.click();
        List<WebElement> childElements1 = driver.findElements(By.xpath("//*[@style='font-family:Arial, Helvetica;font-size:13px;color:#000;padding:5px;']/input"));
        for(int i = 0; i<childElements1.size();i++) {
            childElements1.get(0).sendKeys("ThuHyun");
            childElements1.get(1).sendKeys("H123456");
            break;
        }

        WebElement submitlogin = driver.findElement(By.xpath("//*[@name='submit']"));
        submitlogin.click();
	}
	
	@Test(priority = 2)
	public static void findFlights() {
		WebElement flights = driver.findElement(By.xpath("//*[contains(text(), 'Flights')]"));
		flights.click();
		driver.findElement(By.xpath("//div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/b/font/input[2]")).click();
		
		WebElement passengers = driver.findElement(By.xpath("//div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[3]/td[2]/b/select"));
		Select dropDown1 = new Select(passengers);
		dropDown1.selectByValue("1");
	
		WebElement departingFrom = driver.findElement(By.xpath("//div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[4]/td[2]/select"));
		Select dropDown2 = new Select(departingFrom);
		dropDown2.selectByValue("Acapulco");
	
		driver.findElement(By.xpath("//div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[9]/td[2]/font/input")).click();
	
		WebElement airline = driver.findElement(By.xpath("//div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[10]/td[2]/select"));
		Select dropDown3 = new Select(airline);
		dropDown3.selectByValue("Blue Skies Airlines");
	
		driver.findElement(By.xpath("//div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[14]/td/input")).click();
	}
}
