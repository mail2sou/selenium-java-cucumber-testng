package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

import java.net.MalformedURLException;
import java.net.URL;

public class LoginSteps {

    WebDriver driver;

    @Given("^I navigate to the login page$")
    public void user_already_on_login_page() throws MalformedURLException {
//	 System.setProperty("webdriver.chrome.driver","/Users/naveenkhunteta/Downloads/chromedriver");
//        WebDriverManager.chromedriver().setup();
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("browserName", "chrome");

        driver = new RemoteWebDriver(new URL("http://localhost:4444"), cap);
//        driver = new ChromeDriver();
        driver.get("http://www.goal.com");
    }

//
//    @When("^I verify title$")
//    public void title_of_login_page_is_free_CRM(){
//        String title = driver.getTitle();
//        System.out.println(title);
//        Assert.assertEquals("Free CRM software for customer relationship management, sales, marketing campaigns and support.", title);
//    }
//
//    //Reg Exp:
//    //1. \"([^\"]*)\"
//    //2. \"(.*)\"
//
//    @Then("^user enters \"(.*)\" and \"(.*)\"$")
//    public void user_enters_username_and_password(String username, String password){
//        driver.findElement(By.name("username")).sendKeys(username);
//        driver.findElement(By.name("password")).sendKeys(password);
//    }
//
//
//    @Then("^Close the browser$")
//    public void close_the_browser(){
//        driver.quit();
//    }
}
