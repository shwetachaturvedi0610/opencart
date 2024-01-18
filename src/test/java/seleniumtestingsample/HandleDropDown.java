package seleniumtestingsample;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleDropDown {
public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://the-internet.herokuapp.com/javascript_alerts");
//	driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[2]/button")).click();
////	WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(10));
////	Alert alertwindow = mywait.until(ExpectedConditions.alertIsPresent());
////	alertwindow.accept();
//	driver.switchTo().alert().accept();
	driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[3]/button")).click();
	Alert alert = driver.switchTo().alert();
	Thread.sleep(3000);
	System.out.println("alert.getText()");
	alert.sendKeys("welcome");
	alert.accept();
	
	String actual = driver.findElement(By.xpath("//*[@id=\"result\"]")).getText();
	System.out.println(actual);
	String expected = "You entered: welcome";
	
	if(actual.equals(expected)) {
		System.out.println("working fine");
	}
	else {
		System.out.println("not working fine");
		
	}
	
	
	
	

	
	
	
	
	
	
}
}
