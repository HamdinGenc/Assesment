package StepsDefinition;

import Utils.CommonMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

public class LoginPageSteps extends CommonMethods {
    @Given("User  navigates to the WSECU home page and clicks on sign in button")
    public void user_navigates_to_the_wsecu_home_page_and_clicks_on_sign_in_button() throws InterruptedException {
        Thread.sleep(5000);
        driver.findElement(By.xpath("//span[@class='text']")).click();
    }
    @And("User is redirected to WSECU Online Banking page")
    public void user_is_redirected_to_wsecu_online_banking_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("User enter wrong credentials and clicks on sign in button")
    public void user_enter_wrong_credentials_and_clicks_on_sign_in_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("an error message is received that states “Sorry, incorrect username.”")
    public void an_error_message_is_received_that_states_sorry_incorrect_username() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
