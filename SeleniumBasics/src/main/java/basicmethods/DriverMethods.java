package basicmethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Webdriver\\Browsedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		String title=driver.getTitle();
		String url=driver.getCurrentUrl();
		driver.get(driver.getCurrentUrl());   //refresh
		System.out.println("title"+title);
		System.out.println("url"+url);
	}
}


web element:
	particularly identify
	