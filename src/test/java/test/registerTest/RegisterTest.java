package test.registerTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import test.BaseTest;

import static pages.BasePage.driver;
import static pages.BasePage.getBaseUrl;

public class RegisterTest extends BaseTest {
    private String newUrl = getBaseUrl()+ "Register.html";

    @Test
    public void testRegister(){
        driver.get(newUrl);
        Assert.assertTrue(register.checkTitle(), "The title is not displayed");
        register.setFullName("Ion", "Ionescu");
        register.setAddress("Strada Crizantemelor, Nr 407 J");
        register.setEmailAddress("email@adress.com");
        register.phoneNo("+0748958745");
        register.setGenderMale();
        register.setCricket();
        register.setLanguages("Romanian");
        register.setSkills("Java");
        register.scrollToElement();
        register.setCountry("India");
        register.setDateOfBirth("1986", "February", "7");
        register.setPassword("parola", "parola");
        register.setChooseFile();
        register.clickSubmitButton();
    }
}
