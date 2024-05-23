package automation.stepDefinitions;

import automation.pages.HomePage;
import automation.utils.TestBase;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static automation.pages.HomePage.driver;

public class redemptionSteps {
    private final HomePage homePage;

    public redemptionSteps(TestBase testBase) {
        homePage = new HomePage(testBase.initializeDriver());

    }

    @Given("I access the homepage")
    public void access_homepage() {
        homePage.openHomePage();
    }

    @When("I click on 'Men' top header menu option")
    public void click_Men_option() {
        homePage.clickMenOption();
    }

    @Then("I should be on the Men articles page")
    public boolean men_article_page_landing() {
        WebElement menArticlesPage = driver.findElement(By.cssSelector("#page-title-heading"));
        return menArticlesPage.isDisplayed();
    }

    @And("click on 'Shop Tees' tile")
    public void click_Shop_Tees_Tile() {
        homePage.clickShopTeesTile();
    }
    @And("click on first item from the list")
    public void click_first_item() {
        homePage.clickFirstItem();
    }


}
