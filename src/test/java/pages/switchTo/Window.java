package pages.switchTo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

public class Window extends BasePage {
    private static final Logger LOG = LoggerFactory.getLogger(Window.class);
    private static Window instance;

    private Window(){}

    public static Window getInstance(){
        if (instance == null){
            instance = new Window();
        }
        return instance;
    }

    public void switchToNewTabWindow(){
        String originalWindow = driver.getWindowHandle();
        for (String windowHandle : driver.getWindowHandles()){
            if(!originalWindow.contentEquals(windowHandle)){
                driver.switchTo().window(windowHandle);
                break;
            }
        }
        driver.switchTo().window(originalWindow);
    }
}