package test.registerTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import test.BaseTest;

public class RegisterTest extends BaseTest {

    @Test
    public void testRegister(){
        homePage.clickSkipSignInButton();
        Assert.assertTrue(register.checkTitle(), "The title is not displayed");
        register.setFullName("Ion", "Ionescu");
        register.setAddress("Strada Crizantemelor, Nr 407 J");
        register.setEmailAddress("email@adress.com");
        register.phoneNo("+0748958745");
        register.setGenderMale();
        register.setCricket();
        register.setLanguages("Romanian");
        register.setSkills("Java");
    }
}
