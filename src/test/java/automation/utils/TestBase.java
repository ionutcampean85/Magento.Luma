package automation.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {

    static WebDriver driver;

    public WebDriver initializeDriver() {

        if (driver == null) {
            driver = new ChromeDriver();
        }
        return driver;

    }

    public void closeDriver() {

        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
