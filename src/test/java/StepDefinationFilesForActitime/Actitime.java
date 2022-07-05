package StepDefinationFilesForActitime;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.*;

public class Actitime {
	WebDriver driver;
@Given("user open the broswer")
public void user_open_the_broswer()
{
	System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"\\Drivers\\geckodriver.exe");
	driver = new FirefoxDriver();
}


@When("user enter the url as {string}")
public void user_enter_the_url_as(String string) {
   driver.get(string);
}

@Then("user enter the username as {string} and password as {string}")
public void user_enter_the_username_as_and_password_as(String string, String string2) {
   driver.findElement(By.name("username")).sendKeys(string+Keys.TAB+string2);
}

@Then("user click on the login")
public void user_click_on_the_login() {
    driver.findElement(By.xpath("//input[@ valign='absmiddle'] ")).click();
}

@Then("user verify the title of the webpage.")
public void user_verify_the_title_of_the_webpage() {
   Assert.assertEquals("actiTIME - Open Tasks", driver.getTitle());
}

@Then("user click on logout")
public void user_click_on_logout() {
	driver.findElement(By.className("logoutImg")).click();
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

