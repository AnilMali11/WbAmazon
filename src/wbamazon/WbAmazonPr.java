package wbamazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WbAmazonPr {
	
	public static void main(String args[]) throws InterruptedException
	{
		
		System.setProperty("webdriver.driver.chrome","D:\\Drivers\\ChromeDriver106\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//launch url
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
	}

}
