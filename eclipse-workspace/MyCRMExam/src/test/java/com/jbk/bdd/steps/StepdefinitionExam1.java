package com.jbk.bdd.steps;


import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;


public class StepdefinitionExam1 {
	WebDriver driver;
	@Before
	public void setUp() {
		System.out.println("Before the scenario...");
	}
	@After
	public void tearDown() {
		System.out.println("After the scenario...");
	}
	
	@Given("^user is already on login page$")
	public void user_is_already_on_login_page(){
	    
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUNIL\\Desktop\\Selenium Software\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("file:///C:/Users/SUNIL/Desktop/Selenium%20Software/Offline%20Website/index.html");
		driver.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS);
		
	}

	@When("^title of login page is Free CRM$")
	public void title_of_login_page_is_Free_CRM() {
		String title = driver.getTitle();

		System.out.println(title);
	    Assert.assertEquals("AdminLTE 2 | Log in", title);
	}
	
	/*@Then("^user enters \"(.*?)\" and \"(.*?)\"$")
	public void user_enters_and(String username, String password) throws Throwable {
	   
		   driver.findElement(By.id("email")).clear();
		   driver.findElement(By.id("password")).clear();
		   driver.findElement(By.id("email")).sendKeys(username);
		   driver.findElement(By.id("password")).sendKeys(password);
	}*/

	@Then("^user enters username and password$")
	public void username_and_password(DataTable credential) {
		
		  for(Map<String, String> data : credential.asMaps(String.class,String.class))
		  {
		   driver.findElement(By.id("email")).clear();
		   driver.findElement(By.id("password")).clear();
		   driver.findElement(By.id("email")).sendKeys(data.get("username"));
		   driver.findElement(By.id("password")).sendKeys(data.get("password"));
		  }		
		
	}
	
	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button() throws Throwable {
	    
		driver.findElement(By.xpath("//button[contains(text(),'Sign In')]")).click();
			
	}
	
	@Then("^Open the home page$")
	public void open_the_home_page() throws Throwable {
	    String title = driver.getTitle();
	    System.out.println(title);
	    Assert.assertEquals("AdminLTE 2 | Dashboard", title);
		
	}
	
	@Then("^click on user menu$")
	public void click_on_user_menu() throws Throwable {
	  
		driver.findElement(By.xpath("//span[contains(text(),'Users')]")).click();
		
	}

	@Then("^click on add user$")
	public void click_on_add_user() throws Throwable {
	   
		driver.findElement(By.xpath("//button[contains(text(),'Add User')]")).click();
	    
	}
	
	/*@Then("^fill the value in form as \"(.*?)\" and \"(.*?)\" and \"(.*?)\" and \"(.*?)\"$")
	public void fill_the_value_in_form_as_and_and_and(String uname, String mobile, String email, String pwd) throws Throwable {
	   
		  driver.findElement(By.xpath("//input[@class='form-control' and @id='username']")).clear();	
		  driver.findElement(By.xpath("//input[@class='form-control' and @id='username']")).sendKeys(uname);
		  
		  driver.findElement(By.xpath("//input[@class='form-control' and @id='mobile']")).clear();
		  driver.findElement(By.xpath("//input[@class='form-control' and @id='mobile']")).sendKeys(mobile);
		  
		  driver.findElement(By.xpath("//input[@class='form-control' and @id='email']")).clear();
	      driver.findElement(By.xpath("//input[@class='form-control' and @id='email']")).sendKeys(email);
	      
	      driver.findElement(By.xpath("//input[@name='gender' and @id='Female']")).click();
	    
	      WebElement state = driver.findElement(By.xpath("//select[@class='form-control']"));
		     Select ss = new Select(state);
		     ss.selectByVisibleText("HP");
		     
		  driver.findElement(By.xpath(("//input[@class='form-control' and @id='password']"))).clear();  
	      driver.findElement(By.xpath(("//input[@class='form-control' and @id='password']"))).sendKeys(pwd);
	      Thread.sleep(3000);
	      
	      driver.findElement(By.xpath("//button[@type='submit' and @id='submit']")).click();
	      
	        Alert alt2 = driver.switchTo().alert();
			Thread.sleep(1000);
			System.out.println(driver.switchTo().alert().getText());
			driver.switchTo().alert().accept();


	}
*/
	@Then("^fill the value in form$")
	public void fill_the_value_in_form(DataTable formdata) throws Throwable {
	   
		for(Map<String,String> data : formdata.asMaps(String.class,String.class))
	    { 
		  driver.findElement(By.xpath("//input[@class='form-control' and @id='username']")).clear();	
		  driver.findElement(By.xpath("//input[@class='form-control' and @id='username']")).sendKeys(data.get("uname"));
		  
		  driver.findElement(By.xpath("//input[@class='form-control' and @id='mobile']")).clear();
		  driver.findElement(By.xpath("//input[@class='form-control' and @id='mobile']")).sendKeys(data.get("mobile"));
		  
		  driver.findElement(By.xpath("//input[@class='form-control' and @id='email']")).clear();
	      driver.findElement(By.xpath("//input[@class='form-control' and @id='email']")).sendKeys(data.get("email"));
	      
	      driver.findElement(By.xpath("//input[@name='gender' and @id='Female']")).click();
	    
	      WebElement state = driver.findElement(By.xpath("//select[@class='form-control']"));
		     Select ss = new Select(state);
		     ss.selectByVisibleText("HP");
		     
		  driver.findElement(By.xpath(("//input[@class='form-control' and @id='password']"))).clear();  
	      driver.findElement(By.xpath(("//input[@class='form-control' and @id='password']"))).sendKeys(data.get("pwd"));
	      Thread.sleep(3000);
	      
	      driver.findElement(By.xpath("//button[@type='submit' and @id='submit']")).click();
	      
	        Alert alt2 = driver.switchTo().alert();
			Thread.sleep(1000);
			System.out.println(driver.switchTo().alert().getText());
			driver.switchTo().alert().accept();

	    }
	
	}
	
	

	/*@Then("^click on submit button$")
 	public void click_on_submit_button() throws Throwable {
	   driver.findElement(By.xpath("//button[@type='submit' and @id='submit']")).click();
	   Thread.sleep(1000);
	   
	    Alert alt2 = driver.switchTo().alert();
		Thread.sleep(1000);
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();

	}*/
	

   
	@Then("^close the browser$")
	public void close_the_browser() throws Throwable {
	    driver.close();
	}

	

}
