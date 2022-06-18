package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class LoginSteps {

    WebDriver driver;

    @Given("^I navigate to the login page$")
    public void user_already_on_login_page(){
//	 System.setProperty("webdriver.chrome.driver","/Users/naveenkhunteta/Downloads/chromedriver");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.freecrm.com/index.html");
    }


    @When("^I verify title$")
    public void title_of_login_page_is_free_CRM(){
        String title = driver.getTitle();
        System.out.println(title);
        Assert.assertEquals("Free CRM software for customer relationship management, sales, marketing campaigns and support.", title);
    }

    //Reg Exp:
    //1. \"([^\"]*)\"
    //2. \"(.*)\"

    @Then("^user enters \"(.*)\" and \"(.*)\"$")
    public void user_enters_username_and_password(String username, String password){
        driver.findElement(By.name("username")).sendKeys(username);
        driver.findElement(By.name("password")).sendKeys(password);
    }


    @Then("^Close the browser$")
    public void close_the_browser(){
        driver.quit();
    }
}
