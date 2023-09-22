package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.util.Random;

public class _04_Adding_Products_To_Cart {

    LeftNav ln = new LeftNav();
    DialogContent dc = new DialogContent();

    @Given("navigate to summer dresses")
    public void navigateToSummerDresses() {

        GWD.getDriver().get("https://cleverppc.com/prestashop4/");
        Actions actions = new Actions(GWD.getDriver());
        Action aksiyon = actions.moveToElement(ln.womenButton).build();
        aksiyon.perform();
        ln.Myclick(ln.summerDressesButton);
    }

    @When("user selects a random product")
    public void userSelectsARandomProduct() {

        Random rand = new Random();
        for (int i = 0; i < dc.allSummerDresses.size(); i++) {
            int randomDress = rand.nextInt(dc.allSummerDresses.size());
            dc.allSummerDresses.get(randomDress).click();
        }
    }

    @Then("user clicks on the Add to cart button")
    public void userClicksOnTheAddToCartButton() {

        dc.Myclick(dc.addToCartButton);
    }

    @And("product should be successfully added to the cart")
    public void productShouldBeSuccessfullyAddedToTheCart() {

        dc.VerifycontainsText(dc.confirmText, "successfully");
    }
}
