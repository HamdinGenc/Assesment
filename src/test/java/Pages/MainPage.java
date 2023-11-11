 package Pages;

import Utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

 public class MainPage extends CommonMethods {

     //this is object repository of POM
     @FindBy(linkText="Sign in")
     public WebElement mainPageSignInButton;

    //to initialize all the elements of this page we have to call them inside constructor
    public MainPage(){
        PageFactory.initElements(driver, this);
    }

 }
