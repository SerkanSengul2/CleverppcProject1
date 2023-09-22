package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import Pages.DialogContent;
import Pages.LeftNav;
import Utilities.GWD;
import java.util.Random;

public class _04_Adding_Products_To_Cart {

    LeftNav ln = new LeftNav();
    DialogContent dc = new DialogContent();

    @Given("the user navigate to summer dresses")
    public void theUserNavigateToSummerDresses() {

        GWD.getDriver().get("https://cleverppc.com/prestashop4/");
        Actions actions = new Actions(GWD.getDriver());
        Action aksiyon = actions.moveToElement(ln.womenButton).build();
        aksiyon.perform();
        ln.Myclick(ln.summerDressesButton);
    }

    @When("the user selects a random product")
    public void theUserSelectsARandomProduct() {

        Random rand = new Random();
        for (int i = 0; i < dc.allSummerDresses.size(); i++) {
            int randomDress = rand.nextInt(dc.allSummerDresses.size());
            String strrandomDress = dc.allSummerDresses.get(randomDress).getText();
            dc.allSummerDresses.get(randomDress).click();
        }
    }

    @Then("the user clicks on the Add to cart button")
    public void theUserClicksOnTheAddToCartButton() {

        dc.Myclick(dc.addToCartButton);
    }

    @And("the product should be successfully added to the cart")
    public void theProductShouldBeSuccessfullyAddedToTheCart() {

        dc.VerifycontainsText(dc.productsInCart, "printed");
    }
}
