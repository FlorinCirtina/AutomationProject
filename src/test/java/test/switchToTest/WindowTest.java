package test.switchToTest;

import org.testng.annotations.Test;
import test.BaseTest;

import static pages.BasePage.*;
import static pages.BasePage.sleep;

public class WindowTest extends BaseTest {
    private String newUrl = getBaseUrl() + "Windows.html";

    @Test
    public void checkWindow() {
        driver.get(newUrl);

        //Window Tabbed
        window.clickWindowTabTabbed();
        window.clickToTriggerTabbedWindow();
        window.switchToNewTabWindow();


        //Window Seperate
        window.clickWindowTabSeperate();
        sleep(3000);
        window.clickToTriggerSeperateWindow();
        sleep(3000);
        window.switchToNewTabWindow();
        sleep(3000);

        //Window Multiple
        window.clickWindowTabMultiple();
        sleep(3000);
        window.clickToTriggerMultipleWindow();
        sleep(3000);
        window.switchToNewTabWindow();
        sleep(3000);
    }
}
