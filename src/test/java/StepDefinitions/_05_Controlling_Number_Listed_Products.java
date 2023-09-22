package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _05_Controlling_Number_Listed_Products {

    LeftNav ln = new LeftNav();
    DialogContent dc = new DialogContent();

    @Given("navigate to dresses")
    public void navigateToDresses() {

        GWD.getDriver().get("https://cleverppc.com/prestashop4/");
        ln.Myclick(ln.dressesButton);
    }

    @When("user is at the dresses page")
    public void userIsAtTheDressesPage() {

        dc.VerifycontainsText(dc.dressesText, "dresses");
    }

    @Then("user should see there are five products")
    public void userShouldSeeThereAreFiveProducts() {

    }

    @And("user counts the number of products listed on the page")
    public void userCountsTheNumberOfProductsListedOnThePage() {

    }

    @Then("user verifies that the count matches the numbers in step three and step four")
    public void userVerifiesThatTheCountMatchesTheNumbersInStepThreeAndStepFour() {

    }
}
