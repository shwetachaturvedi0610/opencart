package testngprogramme;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviderTest {
	
	WebDriver driver;
	@BeforeClass
	void login() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		}
	
	@Test(dataProvider="dp")	
	void testLogin(String email, String password) {
		driver.get("https://www.facebook.com/");
		driver.findElement(By.name("email")).sendKeys(email);
		driver.findElement(By.name("pass")).sendKeys(password);
		driver.findElement(By.name("login")).click();
		
			
			}
	@AfterClass
	void close() {
		driver.close();
	}
	
	@DataProvider (name = "dp")
	 String [][] loginData(){
		
		String data [][] = {
				{"abc@gmail.com", "abc"},
				{"abcak@gmail.com", "abc12"},
				{"abckedk@gmail.com", "saabc"},
				{"shwetachaturvedi0610@gmail.com", "Godisgreat6@"}
				};
		return data;
	}
	}


