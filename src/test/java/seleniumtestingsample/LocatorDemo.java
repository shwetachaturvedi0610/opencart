package seleniumtestingsample;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorDemo {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
//		driver.findElement(By.linkText("Shweta Satyendra Mishra")).click();
		driver.findElement(By.partialLinkText("Shweta")).click();
	}
}
