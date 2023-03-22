package basicmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Webdriver\\Browsedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
      
		driver.get("https://demo.guru99.com/test/radio.html");
		driver.manage().window().maximize();
		WebElement RadioButton =driver.findElement(By.xpath("//input[@id='vfb-7-))]"));
		RadioButton.click();
		String checkbox = "";
		WebElement parametrizedcheckbox = driver.findElement(By.xpath("//input[@value='"+checkbox+"']"));     
		parametrizedcheckbox.click();
		checkbox="chechbox2";
		parametrizedcheckbox = driver.findElement(By.xpath("//input[@value='"+checkbox+"']"));
		parametrizedcheckbox.click();
		
		////div[@class='_6lux']//input[@id='email']    ---> parent clid relatn
		
		//span[@id='nav-search-submit-text']//input[@class='nav-input nav-progressive-attribute']-->prent child
	}
}