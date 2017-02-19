package tests;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Test {
	
	
    private String baseUrl; 
  
	static  WebDriver  driver 	 =  getDrivers();
	
	  
@Given("^I can see the radio nav$")
public void i_can_see_the_radio_nav() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	baseUrl = "https://www.bbc.co.uk/radio";
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  driver.navigate().to(baseUrl);
  driver.manage().window().maximize();

	  Assert.assertTrue(driver.findElements(By.xpath("//div[@class= 'radionav__wrap b-g-m cf']")).size() == 1);
  
}

@When("^I select Stations in the radio nav$")
public void i_select_Stations_in_the_radio_nav() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	Thread.sleep(1000);
	driver.findElement(By.xpath("//a[@data-panelid='stations']")).click();
	//throw new PendingException();
}

@Then("^the Stations drawer is open$")
public void the_Stations_drawer_is_open() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	Thread.sleep(1000);

    Assert.assertTrue(driver.findElements(By.xpath("//div[@id='stations-panel']")).size() == 1);
    //throw new PendingException();
}

@When("^I select Stations in the radio nav again$")
public void i_select_Stations_in_the_radio_nav_again() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	Thread.sleep(1000);
	driver.findElement(By.xpath("//a[@data-panelid='stations']")).click();
	//throw new PendingException();
}

@Then("^the Stations drawer is closed$")
public void the_Stations_drawer_is_closed() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	Thread.sleep(1000);

	Assert.assertTrue(driver.findElements(By.xpath("//div[@id='stations-panel']")).size() < 1);
}

@When("^I select Categories in the radio nav$")
public void i_select_Categories_in_the_radio_nav() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	Thread.sleep(1000);
	driver.findElement(By.xpath("//a[@data-panelid='categories']")).click();
	//throw new PendingException();
}

@Then("^the Categories drawer is open$")
public void the_Categories_drawer_is_open() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	Thread.sleep(1000);
	Assert.assertTrue(driver.findElements(By.xpath("//div[@id='categories-panel']")).size() == 1);

	//throw new PendingException();
}

@When("^I select Categories in the radio nav again$")
public void i_select_Categories_in_the_radio_nav_again() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	Thread.sleep(1000);
	driver.findElement(By.xpath("//a[@data-panelid='categories']")).click();
	//throw new PendingException();
}

@Then("^the Categories drawer is closed$")
public void the_Categories_drawer_is_closed() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	Thread.sleep(1000);
	Assert.assertTrue(driver.findElements(By.xpath("//div[@id='categories-panel']")).size() < 1);

	//throw new PendingException();
}

@When("^I select Schedules in the radio nav$")
public void i_select_Schedules_in_the_radio_nav() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	Thread.sleep(1000);
	driver.findElement(By.xpath("//a[@data-panelid='schedules']")).click();
	//throw new PendingException();
}

@Then("^the Schedules drawer is open$")
public void the_Schedules_drawer_is_open() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	Thread.sleep(1000);
	Assert.assertTrue(driver.findElements(By.xpath("//div[@id='schedules-panel']")).size() == 1);

	//throw new PendingException();
}

@When("^I select Schedules in the radio nav again$")
public void i_select_Schedules_in_the_radio_nav_again() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	Thread.sleep(1000);
	driver.findElement(By.xpath("//a[@data-panelid='schedules']")).click();
	//throw new PendingException();
}

@Then("^the Schedules drawer is closed$")
public void the_Schedules_drawer_is_closed() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	Thread.sleep(1000);
	Assert.assertTrue(driver.findElements(By.xpath("//div[@id='schedules-panel']")).size() < 1);

	//throw new PendingException();
}

@Then("^the Stations drawer is open and the other drawers are closed$")
public void the_Stations_drawer_is_open_and_the_other_drawers_are_closed() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	Thread.sleep(1000);
	
		testStationsTabOpen();
	
	//throw new PendingException();
}
 boolean testStationsTabOpen() {
	// TODO Auto-generated method stub
	return driver.findElements(By.xpath("//div[@id='stations-panel']")).size() == 1 && driver.findElements(By.xpath("//div[@id='categories-panel']")).size() < 1 && driver.findElements(By.xpath("//div[@id='schedules-panel']")).size() < 1;
}


@Then("^the Categories drawer is open and the other drawers are closed$")
public void the_Categories_drawer_is_open_and_the_other_drawers_are_closed() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	Thread.sleep(2000);
	testCategoriesTabOpen();
	
	//throw new PendingException();
}
boolean testCategoriesTabOpen() {
	// TODO Auto-generated method stub
	return driver.findElements(By.xpath("//div[@id='categories-panel']")).size() == 1 && driver.findElements(By.xpath("//div[@id='stations-panel']")).size() < 1 && driver.findElements(By.xpath("//div[@id='schedules-panel']")).size() < 1;
}

@Then("^the Schedules drawer is open and the other drawers are closed$")
public void the_Schedules_drawer_is_open_and_the_other_drawers_are_closed() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	Thread.sleep(2000);
	testSchedulesTabOpen();
}
boolean testSchedulesTabOpen() {
	// TODO Auto-generated method stub
	return  driver.findElements(By.xpath("//div[@id='schedules-panel']")).size() < 1 && driver.findElements(By.xpath("//div[@id='categories-panel']")).size() < 1 && driver.findElements(By.xpath("//div[@id='stations-panel']")).size() < 1 ;
}

@When("^I select the all categories link$")
public void i_select_the_all_categories_link() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[text()='All Categories']")).click();
		//throw new PendingException();
}

@Then("^I am on the all categories page$")
public void i_am_on_the_all_categories_page() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	Thread.sleep(2000);
	Assert.assertTrue( driver.findElements(By.xpath("//div[@id='category-list']")).size() == 1 );

	//throw new PendingException();
}



@Then("^I can see the following categories$")
public void i_can_see_the_following_categories(DataTable arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    // For automatic transformation, change DataTable to one of
    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
    // E,K,V must be a scalar (String, Integer, Date, enum etc)
	
	List<WebElement> allElements = driver.findElements(By.xpath("//div[@id='categories-panel']/ul/li")); 

	for (WebElement element: allElements) {
	      System.out.println(element.getText());
	}
	
   // throw new PendingException();
}

static WebDriver getDrivers() {
	
	
	if (driver == null) {
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir")+"\\drivers\\chromedriver_win32\\chromedriver.exe");
		
		driver = new ChromeDriver();
	}
	return driver;
}

 void resetDriver() {
	driver = null;
}


}
