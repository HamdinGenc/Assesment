 package Pages;

import Utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Utils.CommonMethods;

import static Utils.CommonMethods.driver;

public class LoginPage extends CommonMethods {

    //this is object repository of POM

    @FindBy(name="username")
    public WebElement usernameField;

    @FindBy(name="password")
    public WebElement passwordField;

    @FindBy(xpath="//button[@type='submit']")
    public WebElement loginPageSignInButton;

    @FindBy(xpath="//div[@class='ng-binding ng-scope']")
    public WebElement errorMessageField;

   //to initialize all the elements of this page we have to call them inside constructor
   public LoginPage(){
       PageFactory.initElements(driver, this);
   }

}
