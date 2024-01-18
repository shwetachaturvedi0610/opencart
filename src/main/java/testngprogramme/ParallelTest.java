package testngprogramme;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import org.testng.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ParallelTest {

	WebDriver driver;

	@BeforeClass
	@Parameters({ "browser" })
	void setUp(String br) {

		if (br.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
		} else {
			WebDriverManager.chromedriver().setup();
			driver = new EdgeDriver();
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
			driver.close();
		}

	}

	@Test(priority = 1)
	void testLogo() {

		boolean status = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div[1]/div[1]/img"))
				.isDisplayed();
		Assert.assertEquals(status, true);

	}

	@Test(priority = 2)
	void testHomePageTitle() {
		System.out.println(driver.getTitle());
		Assert.assertEquals(driver.getTitle(), "Facebook – log in or sign up");

	}

	@AfterClass
	void closeApp() {
		driver.quit();
	}
}
