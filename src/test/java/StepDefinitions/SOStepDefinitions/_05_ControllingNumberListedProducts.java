package StepDefinitions.SOStepDefinitions;

import Pages.SOPages.SODialogContent;
import Pages.SOPages.SOLeftNav;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class _05_ControllingNumberListedProducts {

    SOLeftNav ln = new SOLeftNav();
    SODialogContent dc = new SODialogContent();

    @Given("navigate to dresses")
    public void navigateToDresses() {

        GWD.getDriver().get("https://cleverppc.com/prestashop4/");
        ln.Myclick(ln.dressesButton);
    }

    @When("user is at the dresses page")
    public void userIsAtTheDressesPage() {

        dc.VerifycontainsText(dc.dressesText, "Dresses");
    }

    @Then("user should see there are five products")
    public void userShouldSeeThereAreFiveProducts() {

        dc.VerifycontainsText(dc.headingCounter, "5");
    }

    @And("user counts the number of products listed on the page")
    public void userCountsTheNumberOfProductsListedOnThePage() {

        dc.VerifycontainsText(dc.productCount, "5");
    }

    @Then("user verifies that the count matches the numbers in step three and step four")
    public void userVerifiesThatTheCountMatchesTheNumbersInStepThreeAndStepFour() {

        Assert.assertEquals(dc.allProducts.size(), 5);
    }
}
