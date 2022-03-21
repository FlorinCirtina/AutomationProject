package pages.register;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

import java.nio.channels.SelectableChannel;

public class Register extends BasePage {

    private static final Logger LOG = LoggerFactory.getLogger(Register.class);
    private static Register instance;

    //----------------------------Form---------------------------------
    private By title = By.xpath("//div[h1='Automation Demo Site ']");

    // Full Name
    private  By firstName = By.xpath("//input[@ng-model='FirstName']");
    private By lastName = By.xpath("//input[@ng-model='LastName']");

    //Address
    private By address = By.xpath("//textarea[@ng-model='Adress']");

    //Email Address
    private By emailAddress = By.xpath("//input[@ng-model='EmailAdress']");

    //Phone Number
    private By phoneNumber = By.xpath("//input[@ng-model='Phone']");

    //Gender
    private By genderM = By.xpath("//input[@value='Male']");
    private By genderF = By.xpath("//input[@value='FeMale']");

    //Hobbies
    private By cricket = By.id("checkbox1");
    private By movies = By.id("checkbox2");
    private By hockey = By.id("checkbox3");

    //Languages
    private By languages = By.id("msdd");
    String selectLanguage = "//a[contains(text(), '%s')]";

    //Skills
    String selectSkills = "Skills";


    private Register(){
    }

    public static Register getInstance(){
        if (instance == null){
            instance = new Register();
        }
        return instance;
    }

    public boolean checkTitle(){
        LOG.info("Check the title");
        return driver.findElement(title).isDisplayed();
    }

    public void setFullName(String fname, String lname){
        LOG.info("Set full name into Form");
        driver.findElement(firstName).sendKeys(fname);
        driver.findElement(lastName).sendKeys(lname);
    }

    public void setAddress(String enterAddress){
        LOG.info("Set Address");
        driver.findElement(address).sendKeys(enterAddress);
    }

    public void setEmailAddress(String enterEmailAddress){
        LOG.info("Set Email Address");
        driver.findElement(emailAddress).sendKeys(enterEmailAddress);
    }

    public void phoneNo (String phone){
        LOG.info("Enter Phone NUmber");
        driver.findElement(phoneNumber).sendKeys(phone);
    }

    public void setGenderMale (){
        LOG.info("Set gender info");
        driver.findElement(genderM).click();
    }

    public void setGenderFeMale (){
        LOG.info("Set gender info");
        driver.findElement(genderF).click();
    }

    public void setCricket(){
        LOG.info("Set Cricket");
        driver.findElement(cricket).click();
    }

    public void setMovies(){
        LOG.info("Set Movies");
        driver.findElement(movies).click();
    }

    public void setHockey(){
        LOG.info("Set Hockey");
        driver.findElement(hockey).click();
    }

    public void setLanguages(String language){
        LOG.info("Set Language");
        driver.findElement(languages).click();
        driver.findElement(By.xpath(String.format(selectLanguage, language))).click();
    }

    public void setSkills(String skill){
        LOG.info("Set Skill");
        Select newSkill = new Select (driver.findElement(By.id(selectSkills)));
        newSkill.selectByValue(skill);
    }
}
