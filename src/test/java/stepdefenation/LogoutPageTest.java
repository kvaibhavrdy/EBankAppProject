package stepdefenation;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class LogoutPageTest {
    WebDriver driver = Hooks.driver;
    WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));



    @And("I Click On The Logout Button")
    public void IClickOnTheLogoutButton(){
        wait1.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".logout-button")));
        driver.findElement(By.className("logout-button")).click();
    }

    @Then("I Should Go To The Login Page")
    public void IShouldGoToTheLoginPage(){
        String expectedUrl = "https://qaebank.ccbp.tech/ebank/login";
        wait1.until(ExpectedConditions.urlToBe(expectedUrl));

        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualUrl, expectedUrl);
    }

    @After
    public void close(){
        driver.quit();
    }

}
