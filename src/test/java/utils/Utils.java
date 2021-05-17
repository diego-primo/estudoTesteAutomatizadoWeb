package utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class Utils {
	
	public static WebDriver driver;

	public static void acessarNavegador() {

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/");

	}
	
	public static void fecharNavegador() {
		driver.quit(); 

	}
	
	public static <T> T Na(Class<T> classe) {
		return PageFactory.initElements(driver, classe);
	}
}
