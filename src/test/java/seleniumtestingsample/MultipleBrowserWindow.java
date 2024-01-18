package seleniumtestingsample;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleBrowserWindow {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[3]/div[2]/p[2]/a")).click();
		Set<String> windowid = driver.getWindowHandles();
		List<String> windowlist = new ArrayList(windowid);
		
		String parentid = windowlist.get(0);
		String childid = windowlist.get(1);
		driver.switchTo().window(childid);
		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/div[2]/ul/li[1]/a/button")).click();
		
	}

}
