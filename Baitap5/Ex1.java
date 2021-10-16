package Baitap5;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit; 
public class Ex1 {
	public static WebDriver driver;
	public static String url = "http://demo.guru99.com/test/newtours/index.php";
	public static String driverPath= "D:\\geckodriver.exe";
	public static String expected = null;
	public static String actual = null;
	
	@BeforeTest
    public void lauchBrower() {
        System.out.println("launching FireFox brower");
        System.setProperty("webdriver.firefox.driver", driverPath);
        driver = new FirefoxDriver();
        driver.get(url);
    }
	
    @BeforeMethod
    public void HomepageTitle() {
        String expectedTitle = "Welcome: Mercury Tours";
        String actualTitle = driver.getTitle();
        AssertJUnit.assertEquals(actualTitle, expectedTitle);
    }
    
    @Test(priority = 0)
    public void register() {
        driver.findElement(By.linkText("REGISTER")).click();
        expected = "Register: Mercury Tours";
        actual = driver.getTitle();
        AssertJUnit.assertEquals(actual, expected);
    }
    @Test(priority = 1)
    public void support() {
        driver.findElement(By.linkText("SUPPORT")).click();
        expected = "Under Construction: Mercury Tours";
        actual = driver.getTitle();
        AssertJUnit.assertEquals(actual, expected);
    }
    
    @AfterMethod
    public void goBackToHomepage() {
        driver.findElement(By.linkText("Home")).click();
    }
//    @AfterTest
//    public void terminatoBrowser() {
//        driver.close();
//    }
}