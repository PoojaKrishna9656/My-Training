package basicmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Webdriver\\Browsedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement emailField = driver.findElement(By.id("email"));
		emailField.sendKeys("test@gmail.com");
		emailField.clear();
		emailField.sendKeys("sample@gmail.com");
		WebElement paswordField = driver.findElement(By.id("pasword"));
		emailField.sendKeys("test@gmail.com");
		

		
	}
}
		
		
		
	
