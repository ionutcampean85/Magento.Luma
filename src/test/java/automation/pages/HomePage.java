package automation.pages;

import io.cucumber.java.da.Men;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {
    public static WebDriver driver;
    WebDriverWait waitForElement;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        waitForElement = new WebDriverWait(driver, Duration.ofSeconds(20));

    }

    public void openHomePage() {
        driver.get("https://magento.softwaretestingboard.com/");
        driver.manage().window().maximize();
    }

    public void clickMenOption() {
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#ui-id-5")));
        WebElement MenOption = driver.findElement(By.cssSelector("#ui-id-5"));
        MenOption.click();
    }

    public void clickShopTeesTile() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".column.main .block-promo-3columns .block-promo.mens-category-tees")));
        WebElement shopTeesTile = driver.findElement(By.cssSelector(".column.main .block-promo-3columns .block-promo.mens-category-tees"));
        Actions actions = new Actions(driver);
        actions.moveToElement(element);
        actions.perform();
        shopTeesTile.click();
    }

    public void clickFirstItem() {
        WebElement firstTshortAvailable = driver.findElement(By.cssSelector(".wrapper.grid.products-grid li:nth-child(1)"));
        firstTshortAvailable.click();
    }

}
