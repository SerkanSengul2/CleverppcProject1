package StepDefinitions.StepDefinitionsSerkanS;

import Pages.PagesSerkanSengul.DialogContentSerkanSengul;
import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class _01_User_RecordingSerkanS {

    DialogContentSerkanSengul dc = new DialogContentSerkanSengul();

    @Given("Navigate to Site")
     public void navigateToCampus() {
        GWD.getDriver().get("https://cleverppc.com/prestashop4/");

    }

    @When("Click {string}")
    public void click(String Click) {
        WebElement BtnClick=dc.ElementGet(Click);
        dc.Myclick(BtnClick);
    }

    @When("Click on <sing> in Button")
    public void clickOnSingInButton(DataTable Click) {
        List<String>Clicks=Click.asList(String.class);
        for (int i = 0; i <Clicks.size(); i++) {

    }

        }


    @And("Write E-mail and Click CreateButton")
    public void enterEMailAdress() {
        dc.MysendKeys(dc.Email, "Grup3Techno3@gmail.com");
        dc.Myclick(dc.CreatAcc);

    }

    @Then("Select Title,Enter Firstname,Lastname,Password and Date of Birth")
    public void selectTitleEnterFirstnameLastnamePasswordAndDateOfBirth() {
        dc.Myclick(dc.MrSelect);
        dc.MysendKeys(dc.Firstname, "TestFirstname");
        dc.MysendKeys(dc.LastName, "TestLastName");
        dc.MysendKeys(dc.Password, "test123");

        Select SelectDays = new Select(dc.Days);
        SelectDays.selectByValue("17");

        Select SelectMonths = new Select(dc.Months);
        SelectMonths.selectByValue("4");


        Select SelectYears = new Select(dc.Years);
        SelectYears.selectByValue("1990");
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


