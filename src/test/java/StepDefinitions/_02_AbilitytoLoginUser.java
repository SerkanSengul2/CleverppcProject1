package StepDefinitions;

import Pages.DialogContent;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class _02_AbilitytoLoginUser {
    DialogContent dc=new DialogContent();

    @Then("Enter E-mail adress And Password")
    public void enterEMailAdressAndPassword() {

        dc.MysendKeys(dc.EmailAdress, "Grup3T3echno@gmail.com");
        dc.MysendKeys(dc.Password, "test123");
    }

    @And("Click on Sing in")
    public void clickOnSingIn() {
        dc.Myclick(dc.LoginButton);

    }
}
