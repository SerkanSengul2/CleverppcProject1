package StepDefinitions.SOStepDefinitions;

import Pages.SOPages.SODialogContent;
import Pages.SOPages.SOLeftNav;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;

public class _10_SearchNull {

    SOLeftNav ln = new SOLeftNav();
    SODialogContent dc = new SODialogContent();

    @When("user search with null")
    public void userSearchWithNull() {

        ln.MysendKeys(ln.search, "" + Keys.ENTER);
    }

    @Then("warning message should be displayed")
    public void warningMessageShouldBeDisplayed() {

        dc.VerifycontainsText(dc.alertText, "keyword");
    }
}
