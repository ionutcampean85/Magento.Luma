package automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

import static org.testng.AssertJUnit.assertFalse;
import static org.testng.AssertJUnit.assertTrue;


public class MenPage {

    WebDriver driver;

    public MenPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isMenPageDisplayed() {
        WebElement menPage = driver.findElement(By.cssSelector("#page-title-heading"));

        return menPage.isDisplayed();
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


    public boolean menTeesPageDisplayed() {
        boolean menTees = driver.getCurrentUrl().equals("https://magento.softwaretestingboard.com/men/tops-men/tees-men.html");
        return menTees;

    }
}