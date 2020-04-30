package demo.hooks;

import demo.driver.WebDriverInstance;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class webDriverHook {

    @Before(value = "@Web")
    public void initializeWebdriver() {
        WebDriverInstance.initialize();
    }

    @After(value = "@Web")
    public void quitWebdriver() {
        WebDriverInstance.quit();
    }
}
