package testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class NewTest{
	@Test
	public void f() throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "../Selenium.TestNG.Maven3/src/test/java/testscript/chromedriver.exe");
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		capabilities.setJavascriptEnabled(true);
		WebDriver driver = new ChromeDriver(capabilities);
		driver.get("http://www.amazon.in/");
		funLib f=new funLib(driver);
	}
}
