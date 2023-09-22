package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;

public class _01_User_Recording {
    DialogContent dc = new DialogContent();

    @Given("Navigate to Campus")
    public void navigateToCampus() {
        GWD.getDriver().get("https://cleverppc.com/prestashop4/");

    }

    @When("Click on Sing in Button")
    public void clickOnSingInButton() {
        dc.Myclick(dc.SingButton);

    }

    @And("Enter E-mail adress and write your mail adress")
    public void enterEMailAdress() {
        dc.MysendKeys(dc.Email, "TesTGrup3@gmail.com");
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
