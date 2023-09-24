package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class _13_DeleteProductSerkanS {
    DialogContent dc=new DialogContent();

    @Then("Enter Product Searchbox")
    public void enterProductSearchboxAndClick() {
        dc.MysendKeys(dc.SearchBox, "Dress" + Keys.ENTER);

    }

    @And("i able to pick one of them")
    public void iAbleToPickOneOfThemAndClickAddToCart() {
        Actions action = new Actions(GWD.getDriver());
        action.moveToElement(dc.Productitem).click().perform();

    }

    @Then("Click Add to Cart and i should click Checkout")
    public void andClickAddToCart() {
        dc.Myclick(dc.AddToCart);
        dc.Myclick(dc.Proceed);
    }


    @And("i able to Click Deletebutton")
    public void iAbleToClickDeletebutton() {
        dc.Myclick(dc.DeleteBtn);

    }


}

