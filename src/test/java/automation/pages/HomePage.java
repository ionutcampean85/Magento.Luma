package automation.pages;

import io.cucumber.java.da.Men;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.net.URL;
import java.time.Duration;

public class HomePage {
    public static WebDriver driver;
    WebDriverWait waitForElement;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        waitForElement = new WebDriverWait(driver, Duration.ofSeconds(20));

    }

    public void openPage(String page) {
        String URL = null;
        if (page.equals("Home")) URL = "https://magento.softwaretestingboard.com/";
        if (page.equals("Men Tees")) URL = "https://magento.softwaretestingboard.com/men/tops-men/tees-men.html";
        if (page.equals("Men")) URL = "https://magento.softwaretestingboard.com/men.html";
        driver.get(URL);
        driver.manage().window().maximize();
    }

    public void assertPageLocation(String location) throws Exception {
        if (location.equals("Men Tees")) {
            Assert.assertTrue(driver.getCurrentUrl().contains("tees-men.html"));
        } else if (location.equals("Home")) {
            Assert.assertTrue(driver.getCurrentUrl().contains("https://magento.softwaretestingboard.com/"));
        } else if (location.equals("Men")) {
            Assert.assertTrue(driver.getCurrentUrl().contains("men.html"));
        } else {
            throw new Exception("Invalid Location");
        }
    }


    public void clickMenOption() {
        WebElement MenOption = driver.findElement(By.cssSelector("#ui-id-5"));
        MenOption.click();
    }


    public void clickRedColour() {
        WebElement redColour = driver.findElement(By.id("option-label-color-93-item-58"));
        redColour.click();

    }

    public void clicksizeXL() {
        WebElement sizeXL = driver.findElement(By.id("option-label-size-143-item-170"));
        sizeXL.click();
    }

    public void addToCart() {
        WebElement addToCart = driver.findElement(By.id("product-addtocart-button"));
        addToCart.click();
    }

}
