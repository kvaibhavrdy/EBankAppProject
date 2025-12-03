package stepdefenation;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class LoginPageTest {
    WebDriver driver = Hooks.driver;
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));


    @Given("I Am On The EBank App Page")
    public void IAmOnTheEBankAppPage() {
        driver.get("https://qaebank.ccbp.tech/ebank/login");
    }

    @When("I Click On The Login Button")
    public void IClickOnTheLoginButton() {
        driver.findElement(By.className("login-button")).click();
    }

    @Then("I Should Get The Error Message Invalid user ID")
    public void IShouldGetTheErrorMessageInvalidUserID() {
        String actualText = wait
                .until(ExpectedConditions.visibilityOfElementLocated(By.className("error-message-text")))
                .getText();
        Assert.assertEquals(actualText, "Invalid user ID");
    }

    @When("I Enter The PIN")
    public void IEnterThePIN() {
        driver.findElement(By.id("pinInput")).sendKeys("231225");
    }

    @When("I Enter The UserID")
    public void IEnterTheUserID() {
        driver.findElement(By.id("userIdInput")).sendKeys("142420");
    }

    @Then("I Should Get The Error Message Invalid PIN")
    public void IShouldGetTheErrorMessageInvalidPIN() {
        String actualText = wait
                .until(ExpectedConditions.visibilityOfElementLocated(By.className("error-message-text")))
                .getText();
        Assert.assertEquals(actualText, "Invalid PIN");
    }

    @When("I Enter The Invalid UserID And Pin")
    public void IEnterTheInvalidUserIDAndPin() {
        driver.findElement(By.id("pinInput")).sendKeys("123456");
        driver.findElement(By.id("userIdInput")).sendKeys("142420");
    }

    @Then("I Should Get The Error Message User ID and PIN didn't match")
    public void IShouldGetTheErrorMessageUserIDAndPINDidNotMatch() {
        String actualTxt = wait
                .until(ExpectedConditions.visibilityOfElementLocated(By.className("error-message-text")))
                .getText();
        Assert.assertEquals(actualTxt, "User ID and PIN didn't match");
    }

    @When("I Enter The Valid UserID and Pin")
    public void IEnterTheValidUserIDandPin() {
        driver.findElement(By.id("pinInput")).sendKeys("231225");
        driver.findElement(By.id("userIdInput")).sendKeys("142420");
    }

    @Then("I Should Go To The Home Page")
    public void IShouldGoToTheHomePage() {
        String expectedUrl = "https://qaebank.ccbp.tech/";
        wait.until(ExpectedConditions.urlToBe(expectedUrl));
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualUrl, expectedUrl);
    }



}

