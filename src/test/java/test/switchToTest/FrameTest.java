package test.switchToTest;

import org.testng.annotations.Test;
import test.BaseTest;

import static pages.BasePage.driver;
import static pages.BasePage.getBaseUrl;

public class FrameTest extends BaseTest {
    private String newUrl = getBaseUrl()+ "Frames.html";

    @Test
    public void CheckFrames() {
        driver.get(newUrl);
    }
}
