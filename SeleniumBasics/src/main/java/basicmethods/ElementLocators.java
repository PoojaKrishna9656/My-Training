package basicmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementLocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Webdriver\\Browsedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
      //driver.get("https://www.Amazon.in");
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		String Selection= "Mobiles";
	/*WebElement searchField = driver.findElement(By.cssSelector(".nav-input.nav-progressive-attribute"));
		searchField.sendKeys("Mobiles");
		WebElement searchField = driver.findElement(By.cssSelector("#twotabsearchtextbox"));
		searchField.click();*/
		
	/*	WebElement searchField = driver.findElement(By.tagName("select"));
		searchField.click();*/
		
		WebElement electronicsLink =driver.findElement(By.linkText(Selection));
		electronicsLink.click();
		
	/*WebElement forgottenLink =driver.findElement(By.partialLinkText("Forgotten"));
		forgottenLink.click();*/
		
		
		
		
				
		
	}
	
}