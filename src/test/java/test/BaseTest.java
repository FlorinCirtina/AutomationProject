package test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import pages.BasePage;
import pages.homepage.HomePage;
import pages.register.Register;
import pages.switchTo.Alert;
import pages.switchTo.Frame;
import pages.switchTo.Window;

public class BaseTest {

    public HomePage homePage = HomePage.getInstance();
    public Register register = Register.getInstance();
    public Alert alert = Alert.getInstance();
    public Window window = Window.getInstance();
    public Frame frames = Frame.getInstance();

    @BeforeSuite
    public void init(){
        BasePage.setUp();
    }

    @AfterSuite
    public void tearDown(){
        BasePage.tearDown();
    }
}
