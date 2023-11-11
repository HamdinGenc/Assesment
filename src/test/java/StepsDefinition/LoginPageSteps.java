package StepsDefinition;

import Pages.MainPage;
import Utils.CommonMethods;
import Utils.ConfigReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPageSteps extends CommonMethods {
    String expectedUrl="https://digital.wsecu.org/banking/signin";
    String expectedError="Sorry, incorrect username.";
    @Given("User  navigates to the WSECU home page and clicks on sign in button")
    public void user_navigates_to_the_wsecu_home_page_and_clicks_on_sign_in_button() {
            doClick(mainPage.mainPageSignInButton);
    }
    @And("User is redirected to WSECU Online Banking page")
    public void user_is_redirected_to_wsecu_online_banking_page() {
       //We need to wait until page is fully loaded before extracting  the windows-handle
        waitForClickability(loginPage.loginPageSignInButton);
        String actualUrl=driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
    }
    @When("User enter wrong credentials and clicks on sign in button")
    public void user_enter_wrong_credentials_and_clicks_on_sign_in_button()  {
        sendText(loginPage.usernameField, ConfigReader.getPropertyValue("username"));
        sendText(loginPage.passwordField, ConfigReader.getPropertyValue("password"));
        doClick(loginPage.loginPageSignInButton);
    }
    @Then("an error message is received")
    public void an_error_message_is_received (){
    String actualError=getText(loginPage.errorMessageField);
    Assert.assertEquals(expectedError,actualError);
    }

}
