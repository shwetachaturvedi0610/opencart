package seleniumtestingsample;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class LocatorDemo2 {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.co.in/");
		driver.get("https://www.flipkart.com/");
		
		driver.navigate().back();
		System.out.println(driver.getCurrentUrl());
		driver.navigate().forward();
		System.out.println(driver.getCurrentUrl());
		
//		WebElement searcbox = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/img"));
//		System.out.println("stats" + searcbox.isDisplayed());
//		
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		
//		WebElement username = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"input\"]")));
//		username.sendKeys("sweta");
	}

}
