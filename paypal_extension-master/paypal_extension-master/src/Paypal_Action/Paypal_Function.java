package Paypal_Action;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Paypal_Function {

	public static String driverPath = "/Users/trung/Desktop/chromedriver";
	public static WebDriver driver;
	public static WebDriverWait expWait;

	public void openBrowser(String address) {
		System.out.println("launching chrome browser");
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		driver.navigate().to(address);

		// Khoi tao expWait
		expWait = new WebDriverWait(driver, 30);
	}

	public void clickButtonSignUp() throws InterruptedException {
		System.out.println("Click button SignUp ");
		driver.findElement(By.id("signup-button")).click();

		// Delay time 3 seconds to load page
		TimeUnit.SECONDS.sleep(3);
	}

	public void clickButtonGetStarted() throws InterruptedException {
		System.out.println("Click button Get Started of Buy With Paypal");
		driver.findElement(
				By.xpath("//div[@class='signup-account']//a[@class='btn btn-medium'][contains(text(),'Get Started')]"))
				.click();

		// Doi den khi element xuat hien
		expWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[contains(@class,'vx_text-2')]")));
	}

}
