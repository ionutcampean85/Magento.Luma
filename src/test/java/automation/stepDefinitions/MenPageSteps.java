package automation.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.testng.Assert;
import automation.pages.MenPage;
import automation.utils.TestBase;
import io.cucumber.java.en.Then;

public class MenPageSteps {
    MenPage menPage;


    public MenPageSteps(TestBase testBase) {
        menPage = new MenPage(testBase.initializeDriver());
    }

    @Then("I should be on the Men page")
    public void isMenPageIsDisplayed() {
        Assert.assertTrue(menPage.isMenPageDisplayed());
    }

//    @Given("I am on 'Men' page")
//    public void I_am_on_the_page() {
//        Assert.assertTrue(menPage.isMenPageDisplayed());
//    }

    @And("I click on 'Shop Tees' tile")
    public void click_Shop_Tees_tile() {
        menPage.clickShopTeesTile();
    }

    @Then("'Men Tees' are displayed")
    public void are_Men_Tees_displayed() {
        Assert.assertTrue(menPage.areMenTeesPageDisplayed());
    }




}

