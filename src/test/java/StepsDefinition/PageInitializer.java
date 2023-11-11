package StepsDefinition;



import Pages.*;

public class PageInitializer {

    public static LoginPage loginPage;
    public static MainPage mainPage;



   public static void initializePageObjects(){
       loginPage = new LoginPage();
       mainPage=new MainPage();

   }
}
