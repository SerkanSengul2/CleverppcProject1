package StepDefinitions.StepDefinitionsSerkanS;

import Pages.PagesSerkanSengul.DialogContentSerkanSengul;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class _02_Ability_to_Login_UserSerkanS {
    DialogContentSerkanSengul dc = new DialogContentSerkanSengul();

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
