package tests;

import org.junit.Before;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Drivers {
	protected static WebDriver driver;
	  private boolean acceptNextAlert = true;
	  protected StringBuffer verificationErrors = new StringBuffer();

	protected WebDriver getDriver() {
		
		
		if (driver == null) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir")+"\\drivers\\chromedriver_win32\\chromedriver.exe");
			
			System.setProperty("webdriver.ie.driver",
					System.getProperty("user.dir")+"\\drivers\\IEDriverServer_x64_2.53.1\\IEDriverServer.exe");
			
			System.setProperty("phantomjs.binary.path",
					System.getProperty("user.dir")+"\\drivers\\phantomjs-2.1.1-windows\\phantomjs-2.1.1-windows\\bin\\phantomjs.exe");

			
			
			
			//driver = new FirefoxDriver();
			driver = new ChromeDriver();
		}
		return driver;
	}


	  private String closeAlertAndGetItsText() {
	    try {
	      Alert alert = driver.switchTo().alert();
	      String alertText = alert.getText();
	      if (acceptNextAlert) {
	        alert.accept();
	      } else {
	        alert.dismiss();
	      }
	      return alertText;
	    } finally {
	      acceptNextAlert = true;
	    }
	  }
}