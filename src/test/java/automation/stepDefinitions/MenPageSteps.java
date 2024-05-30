package automation.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
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
    public void is_Men_Page_Is_Displayed() {
        Assert.assertTrue(menPage.isMenPageDisplayed());
    }

    @And("I click on 'Shop Tees' tile")
    public void click_Shop_Tees_tile() {
        menPage.clickShopTeesTile();
    }

    @Then("'Men Tees' page is displayed")
    public void are_Men_Tees_displayed() {
        Assert.assertTrue(menPage.menTeesPageDisplayed());
    }

    @When("I click on first item from the list")
    public void click_First_Item() {
        menPage.clickTee();


    }

    @Then("product with item 'Strike Endurance Tee' is displayed")
    public void tee_Strike_Endurance_displayed() {
        Assert.assertTrue(menPage.StrikeEnduranceTeeDisplayed());

    }


}

