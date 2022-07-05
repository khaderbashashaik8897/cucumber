			package StepDefinationFilesFornopcommerce;
			
			import java.util.concurrent.TimeUnit;
		
		import org.junit.Assert;
			import org.openqa.selenium.By;
			import org.openqa.selenium.Keys;
			import org.openqa.selenium.WebDriver;
			import org.openqa.selenium.firefox.FirefoxDriver;
		import org.openqa.selenium.support.ui.ExpectedConditions;
		import org.openqa.selenium.support.ui.WebDriverWait;
		
		import io.cucumber.java.en.*;
			
			public class StepDefinationCass {
				WebDriver driver;
				WebDriverWait wait ;
				@Given("user open the broswer")
				public void user_open_the_broswer()
				{
					System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"\\Drivers\\geckodriver.exe");
					driver = new FirefoxDriver();
					driver.manage().window().maximize();
					driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
					
			
				}
			
			@When("user pass the url as {string}")
			public void user_pass_the_url_as(String string) {
			    driver.get(string);
			}
			
			@Then("user pass the email as  {string}  and password as {string}")
			public void user_pass_the_email_as_and_password_as(String string, String string2) {
				
					driver.findElement(By.name("Email")).clear();
				    driver.findElement(By. name("Email")).sendKeys(string);
				    driver.findElement(By.id("Password")).clear();
				    driver.findElement(By.id("Password")).sendKeys(string2); 
			}
			
			@Then("user click on the login button.")
			public void user_click_on_the_login_button() {
				boolean status = driver.findElement(By.className("button-1")).isEnabled();
				if(status)
				{
					   driver.findElement(By.className("button-1")).click();
				}
				else {
					System.out.println("logout Element is not enable");
				}
			}
			
			@Then("user verfiy the title of the dashboard")
			public void user_verfiy_the_title_of_the_dashboard() throws InterruptedException {
			   String title = driver.getTitle();
			   Thread.sleep(3000);
			  Assert.assertEquals("Dashboard / nopCommerce administration", title);
			}
			
			@Then("user click on logout button")
			public void user_click_on_logout_button() throws InterruptedException {
				try {
					Thread.sleep(3000);
			   driver.findElement(By.linkText("Logout")).click();
			}
				catch(Exception ex)
				{
					
					   driver.findElement(By.linkText("Logout")).click();
				}
				}
			
			@Then("user close the broswer")
			public void user_close_the_broswer() {
			   driver.close();
			}
		
		@Then("user click on projects and customers")
		public void user_click_on_projects_and_customers() {
		   driver.findElement(By.linkText("Projects & Customers")).click();
		}
		@Then("user click on addnewcustomerbutton")
		public void user_click_on_addnewcustomerbutton() {
		  driver.findElement(By.xpath("//input[@ value='Add New Customer']")).click();
		}
		@Then("user enter the customer name as {string}")
		public void user_enter_the_customer_name_as(String customername) {
			driver.findElement(By.name("name")).clear();
			driver.findElement(By.name("name")).sendKeys(customername);
		}
		@Then("user click on create customer")
		public void user_click_on_create_customer() {
		  driver.findElement(By.name("createCustomerSubmit")).click();
		}
		@Then("user retrive the success message")
		public void user_retrive_the_success_message() {
		  String data = driver.findElement(By.className("successmsg")).getText();
		  System.out.println(data);
		  
		}
			
			}
