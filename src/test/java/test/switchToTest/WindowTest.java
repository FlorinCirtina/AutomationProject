package test.switchToTest;

import org.testng.annotations.Test;
import test.BaseTest;

import static pages.BasePage.driver;
import static pages.BasePage.getBaseUrl;

public class WindowTest extends BaseTest {
    private String newUrl = getBaseUrl()+ "Windows.html";

    @Test
    public void checkWindow() {
        driver.get(newUrl);
    }
}
