package StepDefinitions.StepDefinitionsSerkanS;

import Pages.PagesSerkanSengul.DialogContentSerkanSengul;
import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.eo.Se;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.List;

public class _01_User_RecordingSerkanS {

    DialogContentSerkanSengul dc = new DialogContentSerkanSengul();

    @Given("Navigate to Site")
    public void navigateToCampus() {
        GWD.getDriver().get("https://cleverppc.com/prestashop4/");

    }


    @And("Write E-mail and Click CreateButton")
    public void enterEMailAdress() {
        dc.MysendKeys(dc.Email, "Gr8633Techno3@gmail.com");
        dc.Myclick(dc.CreatAcc);

    }

    @And("Click")
    public void click(DataTable dt)  {
        List<String> items = dt.asList(String.class);
        for (int i = 0; i < items.size(); i++) {
            WebElement click = dc.ElementGet(items.get(i));

            dc.Myclick(click);
        }
    }

    @Then("Sendkeys")
    public void sendkeys(DataTable dt2) {
        List<List<String>> items = dt2.asLists(String.class);
        for (int i = 0; i < items.size(); i++) {
            WebElement Sendkeys = dc.ElementGet(items.get(i).get(0));
            String yazi = items.get(i).get(1);
            dc.MysendKeys(Sendkeys, yazi);
        }
    }
    @And("Click Register Button")
    public void clickRegisterButton() {

        dc.Myclick(dc.SubmitAccount);

    }

    @Then("User should login successfully")
    public void userShouldLoginSuccessfully() {
        dc.VerifycontainsText(dc.Verify, "created");
        System.out.println("Account başarılı ile yartıldı. =" + dc.Verify.getText());
    }



    }



