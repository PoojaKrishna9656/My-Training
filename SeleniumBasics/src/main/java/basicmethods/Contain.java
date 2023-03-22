
package basicmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Contain{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Webdriver\\Browsedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
      
		driver.get("https://demo.guru99.com/test/radio.html");
		driver.manage().window().maximize();
		WebElement emailAddress=driver.findElement(By.xpath("//input[contains(@placeholder='Email address or phone number')]");
		emailAddress.sendKeys("test Email");
		WebElement password=driver.findElement(By.xpath("//input[contains(@placeholder='Email address or phone number')]");
		emailAddress.sendKeys("test Email");
		
		
		/*WebElement forgetPassword=driver.findElement(By.xpath("//a[text()='Forgotten password?']"));     
		parametrizedcheckbox.click();
		
	//a[starts-with(@href,'/electronics/')]	*/
	}
}