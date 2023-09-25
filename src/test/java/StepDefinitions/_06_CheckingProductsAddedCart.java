package StepDefinitions;

import Pages.iremDialogContent;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class _06_CheckingProductsAddedCart {
     iremDialogContent dc=new iremDialogContent();
    @Given("navigate to dresses page")
    public void navigateToDressesPage() {
        GWD.getDriver().get("https://cleverppc.com/prestashop4/");
        dc.Myclick(dc.signIn);
        dc.MysendKeys(dc.email, "serkan@gmail.com");
        dc.MysendKeys(dc.password, "12345");
        dc.Myclick(dc.submitButton);

    }

    @When("User chooses random products")
    public void userChoosesRandomProducts() {
    }

    @Then("User clicks on add to cart and user clicks on continue shopping button")
    public void userClicksOnAddToCartAndUserClicksOnContinueShoppingButton() {
    }

    @And("User chooses a different product and user clicks on add to cart button")
    public void userChoosesADifferentProductAndUserClicksOnAddToCartButton() {
    }

    @Then("User verifies that the added items are in the shopping cart")
    public void userVerifiesThatTheAddedItemsAreInTheShoppingCart() {
    }

    @And("User verifies that there are three products in shopping cart")
    public void userVerifiesThatThereAreThreeProductsInShoppingCart() {
    }
}
