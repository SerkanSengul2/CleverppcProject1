package StepDefinitions.StepDefinitionsIrem;

import Pages.iremDialogContent;
import Pages.iremLeftNav;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _04_CheckingProductsAddedCart {

      iremDialogContent dc=new iremDialogContent();
      iremLeftNav ln=new iremLeftNav();
    @Given("Navigate to Site")
    public void navigateToDressesPage() {
        GWD.getDriver().get("https://cleverppc.com/prestashop4/");
        //ln.Myclick(ln.Dresses2);
    }

    @When("User selects a random product and click on add to cart")
    public void userSelectsARandomProductAndClickOnAddToCart() {


    }

    @Then("User clicks on continue shopping button")
    public void userClicksOnContinueShoppingButton() {
    }

    @And("User selects a different product and clicks on add to cart button")
    public void userSelectsADifferentProductAndClicksOnAddToCartButton() {
    }

    @And("User selects a final different product and clicks on add to cart button")
    public void userSelectsAFinalDifferentProductAndClicksOnAddToCartButton() {
    }

    @Then("User should verify the products in cart")
    public void userShouldVerifyTheProductsInCart() {
    }

    @And("User should verify three product in cart")
    public void userShouldVerifyThreeProductInCart() {
    }
}
