package api.cucumber.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LoginAction {
    private WebDriver driver;
    @Given("User is on Home Page")
    public void userIsOnHomePage() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
    }

    @When("User Navigate to Login Page")
    public void userNavigateToLoginPage() {
        System.out.println("Navigate to Login Page");
    }

    @And("user Enters{string} and {string}")
    public void userEntersAnd(String UserName, String Password) {
        System.out.println("Checking Changes in feature branch");
        System.out.println("Username is: "+ UserName+" Password is: "+ Password);
        driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(UserName);
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys(Password);
        driver.findElement(By.xpath("//input[@id='login-button']")).click();
    }

    @Then("Message Displayed Login Successfully")
    public void messageDisplayedLoginSuccessfully() {
        System.out.println("Successfully logged in ");
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.close();
    }
}
