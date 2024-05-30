package automation.stepDefinitions;

import automation.pages.HomePage;
import automation.utils.TestBase;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.bytebuddy.implementation.bytecode.Throw;
import org.testng.Assert;

import java.util.HashMap;
import java.util.Map;

import static automation.pages.HomePage.driver;

public class HomePageSteps {
    private final HomePage homePage;

    public HomePageSteps(TestBase testBase) {
        homePage = new HomePage(testBase.initializeDriver());

    }

    @When("I click on 'Men' top header menu option")
    public void click_Men_option() {
        homePage.clickMenOption();
    }


    @Given("^I am on \"(.*)\" page$")
    public void assertPageLocation(String location) throws Exception {
        homePage.assertPageLocation(location);
    }

    @Given("^I navigate to \"(.*)\" page$")
    public void openAndAssertPageLocation(String location) throws Exception {
        homePage.openPage(location);
        homePage.assertPageLocation(location);
    }


}

