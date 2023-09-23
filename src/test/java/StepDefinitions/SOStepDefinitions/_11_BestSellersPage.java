package StepDefinitions.SOStepDefinitions;

import Pages.SOPages.SODialogContent;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _11_BestSellersPage {

    SODialogContent dc = new SODialogContent();

    @When("user clicks on best sellers")
    public void userClicksOnBestSellers() {

        dc.Myclick(dc.bestSellersButton);
    }

    @Then("best sellers page should be displayed")
    public void bestSellersPageShouldBeDisplayed() {

        dc.VerifycontainsText(dc.bestSellerText, "TOP SELLERS");
    }
}
