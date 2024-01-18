package seleniumtestingsample;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleCheckBoxes {
	public static void main(String[] args) {
		
	ChromeOptions options = new ChromeOptions();
	options.setHeadless(true);
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver(options);
	driver.manage().window().maximize();
	
	driver.get("https://www.opencart.com/index.php?route=account/register");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebElement drop = driver.findElement(By.xpath("//*[@id=\"input-country\"]"));
	Select dropcountry = new Select(drop);
	dropcountry.selectByVisibleText("Australia");
}
}